package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingPage {
    private WebDriver driver;
    private By MenuElements = By.xpath("//*[@href='/shifting_content/menu']");// является локатором по
    // которому мы найдем кнопку menu elements

    public ShiftingPage (WebDriver driver){
        this.driver = driver;
    }

    public ShiftingContentMenuElement ClickOnShiftingElements(){//здесь мы нашли menu elemetns и нажали на линку
        driver.findElement(MenuElements).click();
        return new ShiftingContentMenuElement(driver);
    }
}
