package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;
import java.util.List;


public class BaseTest {
    private EventFiringWebDriver driver;
    private String link = "http://the-internet.herokuapp.com";
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/galinalapo/Downloads/theInternet1/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());


        driver.manage().window().maximize();
        goHome();
        homePage = new HomePage(driver);
    }
    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    public void takeScreenshot(ITestResult result) throws IOException {
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screensot = camera.getScreenshotAs(OutputType.FILE);

        System.out.println(screensot.getAbsolutePath());
            Files.move(screensot, new File("/Users/galinalapo/IdeaProjects/theInternet1/src/main/resources/screenshots" +  result.getName() + ".png"));

    }
    @AfterMethod
    public void recordFailure (ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE){
            takeScreenshot(result);
        }
    }

        //driver.findElement(By.xpath("//*[@href='/redirector']"));
        //List<WebElement> alinks = driver.findElements(By.cssSelector("#content a"));
        //System.out.println("A-links quantity is " + alinks.size());
        //Assert.assertEquals(alinks.size(), 46, "wrong number of links");
        // driver.get(link);
        //System.out.println("Page title is driven");


    /*
    public static void main (String[]args) throws InterruptedException {
        BaseTest test = new BaseTest();
        test.setUp();
        test.tearDown();
    }*/

    @BeforeMethod
    public void goHome(){
        driver.get(link);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        return chromeOptions;
    }
}