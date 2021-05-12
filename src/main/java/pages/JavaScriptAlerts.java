package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {
    private WebDriver driver;
    private By JSAlert = By.xpath("//*[@onclick='jsAlert()']");
    private By JSConfirm = By.xpath("//*[@onclick='jsConfirm()']");
    private By JSPrompt = By.xpath("//*[@onclick='jsPrompt()']");
    private By result = By.id("result");

    public JavaScriptAlerts(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJSAlert(){
        driver.findElement(JSAlert).click();
    }

    public void clickJSConfirm(){
        driver.findElement(JSConfirm).click();
    }

    public void clickJSPrompt(){
        driver.findElement(JSPrompt).click();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void acceptPopup(){
        driver.switchTo().alert().accept();
    }

    public void dismissPopup(){
        driver.switchTo().alert().dismiss();
    }

    public String getConfirmText(){
        return driver.switchTo().alert().getText();
    }

    public void setPromptInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
