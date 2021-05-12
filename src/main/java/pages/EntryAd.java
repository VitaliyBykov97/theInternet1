package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAd {

    private WebDriver driver;
    private By modalText = By.cssSelector("div.modal-title h3");
    private By closeLink = By.cssSelector("div.modal-footer p");
    private By modalWindow = By.id("modal");

    public EntryAd(WebDriver driver) {
        this.driver = driver;
    }
    public void closeModal(){
        driver.findElement(closeLink).click();
    }

    public String getTitle (){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindow)));// всплывающие окна есть всегда, меняется только видимость
        return driver.findElement(modalText).getText();
    }
}
