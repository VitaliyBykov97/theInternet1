package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.xpath("//*[@type='range']");
    private By value = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSliderHorizontal(Keys arrowRight){
        driver.findElement(slider).sendKeys(arrowRight);
    }

    public String getValueSlider (){
        return driver.findElement(value).getText();
    }

    public void moveSliderRight(int count){
        WebElement move = driver.findElement(slider);// становится веб элементом
        for(int i = 0; i < count; i++){
            move.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
