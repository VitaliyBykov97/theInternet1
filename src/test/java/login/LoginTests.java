package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();

        Assert.assertEquals(secureAreaPage.getMessage(), "You logged into a secure area!\n×",
                "Message is wrong");
        secureAreaPage.getMessage();


    }
}
