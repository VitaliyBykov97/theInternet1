package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigation(){

        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingPage.Example1Page example1Page = dynamicLoadingPage.clickExample1();

        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.selenium.dev/documentation/en/");
    }

    @Test

    public void testSwitchToTab(){
        homePage.clickMultipieWindows().clickClickHere();
        getWindowManager().switchToTab("New Window");
    }


}
