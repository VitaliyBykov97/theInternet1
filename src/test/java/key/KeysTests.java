package key;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTests extends BaseTest {
    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("hello world" + Keys.BACK_SPACE);//сначала напечатаем "привет мир", потом нажмем бэкспэйс
        Assert.assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE", "result is wrong");
    }

    @Test
    public void testShortCuts(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("hello world" + Keys.chord(Keys.COMMAND, "z"));
        Assert.assertEquals(keyPressesPage.getTargetValue(), "hello worl", "wrong value");
    }
}
