package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlerts;

public class AlertTests extends BaseTest {

    @Test
    public void testAlert(){
        JavaScriptAlerts javaScriptAlerts = homePage.clickJavaScriptAlerts();
        javaScriptAlerts.clickJSAlert();
        javaScriptAlerts.acceptPopup();
        Assert.assertEquals(javaScriptAlerts.getResult(), "You successfully clicked an alert", "wrong result text");
    }

    @Test
    public void testConfirm (){
        JavaScriptAlerts javaScriptAlerts = homePage.clickJavaScriptAlerts();
        javaScriptAlerts.clickJSConfirm();
        String confirmText = javaScriptAlerts.getConfirmText();
        javaScriptAlerts.dismissPopup();
        Assert.assertEquals(confirmText, "I am a JS Confirm", "wrong JS ConfirmText");
        Assert.assertEquals(javaScriptAlerts.getResult(), "You clicked: Cancel", "wrong confirmText");
    }

    @Test
    public void testPrompt(){
        JavaScriptAlerts javaScriptAlerts = homePage.clickJavaScriptAlerts();
        javaScriptAlerts.clickJSPrompt();
        String text = "Hey There";
        javaScriptAlerts.setPromptInput(text);
        javaScriptAlerts.acceptPopup();
        Assert.assertEquals(javaScriptAlerts.getResult(), "You entered: " + text, "wrong text");
    }
}
