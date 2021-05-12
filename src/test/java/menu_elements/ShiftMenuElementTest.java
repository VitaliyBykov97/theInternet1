package menu_elements;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftingContentMenuElement;
import pages.ShiftingPage;

import java.util.List;

public class ShiftMenuElementTest extends BaseTest {

    @Test
    public void QuantityOfLinks(){
        ShiftingPage shiftingPage = homePage.clickShiftingContent();//на главной странице нажали на кнопку шифт элемент
        ShiftingContentMenuElement shiftingContentMenuElement  = shiftingPage.ClickOnShiftingElements();// здесь мы
        //на странице шифт элемент находим кнопку меню элемент и переходим туда
        Assert.assertEquals(shiftingContentMenuElement.getQuantityLinks(), 5, "wrong");//здесь мы вызываем
        //метод который считает количество найденных элементов и передает их к списку. Assert сопоставляет ожидаемый результат
        // то естб "5" и полученный. если результат разнится, то выдает ошибку

    }
}
