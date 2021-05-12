package EntryAdTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAd;

public class EntryAdTest extends BaseTest {
    @Test
    public void EntryAdTest (){
        EntryAd entryAd = homePage.clickEntryAd();
        Assert.assertEquals(entryAd.getTitle(), "THIS IS A MODAL WINDOW", "error title");
    }
/*
    @Test
    public void closeEntryAd(){
        EntryAd entryAd = homePage.clickEntryAd();
        Assert.assertEquals(entryAd.closeModal(), "");
    }*/
}
