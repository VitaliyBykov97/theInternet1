package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.HoversPage;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.PictureCation caption = hoversPage.hoverOverPicture(0);
        Assert.assertTrue(caption.captionIsDisplayed());
        Assert.assertEquals(caption.getHeaderText(), "name: user1", "wrong");
        Assert.assertEquals(caption.getLinkText(), "View profile", "wrong");
        Assert.assertEquals(caption.getLinkHref(),"http://the-internet.herokuapp.com/users/1", "wrong link attribute");
    }
}
