package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    private By input = By.id("email");
    private By button = By.id("form_submit");

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText (String text){
        driver.findElement(input).sendKeys(text);
    }

    public InternalServerError pressRetrievePassword(){
        driver.findElement(button).click();
        return new InternalServerError(driver);
    }
}
