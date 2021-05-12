package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysuwygEditorPage {

    private WebDriver driver;
    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath(".//button[@title='Increase indent']");

    public WysuwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void sendTextToTextArea(String text) {
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndent() {
        driver.findElement(increaseIndentButton).click();
    }

    public void switchToTextArea() {
        driver.switchTo().frame(frameId);
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public String getTextAreaContent() {
        switchToTextArea();
        String  text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
