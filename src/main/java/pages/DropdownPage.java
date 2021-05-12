package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By drobdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public Select findDropDownElement(){
        return new Select(driver.findElement(drobdown));
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
       // Select select = (Select) driver.findElement(drobdown);
       // select.selectByVisibleText(option);

    }
    public List<String> getSelectedOption(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();//getAllSelectedOptions - возвращает все опции
        return selectedElements
                .stream()
                .map(e -> e.getText())
                .collect(Collectors.toList());// преображаем WebElement в тип String
    }

}
