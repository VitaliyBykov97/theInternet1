package javascript;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class ScrollJavaScriptTest extends BaseTest {

    @Test
    public void testScrollToParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
        Assert.assertEquals(infiniteScrollPage.getParagraphsCount(), 5, "wrong");
    }
}
