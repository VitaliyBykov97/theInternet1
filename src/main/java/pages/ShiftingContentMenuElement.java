package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShiftingContentMenuElement {
    private WebDriver driver;
    private By menuItems = By.cssSelector("#content li");//по такому селектору мы находим, сколько всего ссылок есть
    //если ты вставмшь эту запись в консоль разработчика , то увидишь , что найдено 5 кнопок
    public ShiftingContentMenuElement(WebDriver driver) {
        this.driver = driver;
    }

    public int getQuantityLinks() {
        List<WebElement> alinks = driver.findElements(menuItems);// здесь мы приводим к списку количество найденных элементов
        System.out.println(alinks.size());
        return alinks.size();
    }
}
