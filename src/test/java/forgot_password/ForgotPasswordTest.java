package forgot_password;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.InternalServerError;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void testForgotPassword(){
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        forgotPassword.enterText("vitaliy.bykov970@gmail.com");
        InternalServerError internalServerError = forgotPassword.pressRetrievePassword();
        Assert.assertEquals(internalServerError.getServerError(), "Internal Server Error", "wrong");
    }
}
