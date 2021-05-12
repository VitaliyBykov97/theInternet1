package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipieWindowsPage {

    public WebDriver driver;
    private By clickHere = By.xpath("//*[@target='_blank']");

    public MultipieWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickClickHere(){
        driver.findElement(clickHere).click();
    }


}
