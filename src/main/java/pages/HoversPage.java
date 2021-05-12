package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {
    private WebDriver driver;
    private By picture = By.className("figure");
    private By caption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public PictureCation hoverOverPicture(int index){
        WebElement image = driver.findElements(picture).get(index);
        Actions action = new Actions(driver); //обязателен драйвер
        action.moveToElement(image).perform();//расширяет селениум. мы можем навести курор, два раза нажать, нажать
        // и удерживать. perform - завершает это действие
        return new PictureCation(image.findElement(caption));
    }


    public class PictureCation{

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");


        public PictureCation(WebElement caption) {
            this.caption = caption;
        }


        public  boolean captionIsDisplayed(){
            return caption.isDisplayed();
        }

        public String getHeaderText(){
            return caption.findElement(header).getText();
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }

        public String getLinkHref (){
            return caption.findElement(link).getAttribute("href");
        }

    }
}
