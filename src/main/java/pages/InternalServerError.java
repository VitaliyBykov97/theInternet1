package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalServerError {

    private WebDriver driver;
    private By link = By.cssSelector("body > h1");
    @FindBy(css = "body > h1")
    private WebElement title;

    public InternalServerError(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getServerError(){
        return title.getText();
    }
}
