package framesPage;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;

public class FramesPageTests extends BaseTest {

    @Test
        public void testsFramePage(){
        FramesPage framesPage = homePage.clickFramesPage();
        FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickOnFramesPage();
        String middleText = "MIDDLE";
        nestedFramesPage.getTextFromMiddleFrameset();
        Assert.assertEquals(nestedFramesPage.getTextFromMiddleFrameset(), middleText,"wrong");
    }

    @Test
    public void testesBottomFramePage(){
        FramesPage framesPage = homePage.clickFramesPage();
        FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickOnFramesPage();
        String bottomText = "BOTTOM";
        nestedFramesPage.getTextFromBottomFrameset();
        Assert.assertEquals(nestedFramesPage.getTextFromBottomFrameset(), bottomText, "wrong bottom");
    }
}
