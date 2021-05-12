package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LargeDeepDomPage;

public class javaScriptTest extends BaseTest {

    @Test
    public void testJS(){
        LargeDeepDomPage largeDeepDomPage = homePage.clickLargeDeepDomPage();
        largeDeepDomPage.scrollToTable();
    }
}
