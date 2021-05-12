package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1 = By.xpath("//*[@href='/dynamic_loading/1']");


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1(){
        driver.findElement(example1).click();
        return new Example1Page(driver);
    }

    public class Example1Page {
        private WebDriver driver;
        private By idStart = By.id("start");
        private By startButton = By.cssSelector("#start button");
        private By loadingIndicator = By.id("loading");
        private By finishText = By.id("finish");

        public Example1Page(WebDriver driver) {
            this.driver = driver;
        }

        public void clickStartButton (){
            driver.findElement(startButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        }

        public String getText(){
            return driver.findElement(finishText).getText();
        }

    }

}
