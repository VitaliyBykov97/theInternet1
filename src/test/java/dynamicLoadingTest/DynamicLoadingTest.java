package dynamicLoadingTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void DynamicLoadingTest (){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingPage.Example1Page example1Page = dynamicLoadingPage.clickExample1();//switch to 2 or more links

        example1Page.clickStartButton();
        Assert.assertEquals(example1Page.getText(), "Hello World!", "Wrong text!");
    }

}
