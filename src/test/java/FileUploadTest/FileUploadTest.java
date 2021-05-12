package FileUploadTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void FileUploadTest() {
        FileUploadPage fileUploadPage = homePage.fileUploadPAge();
        fileUploadPage.uploadFile
                ("/Users/galinalapo/IdeaProjects/theInternet1/chromedriver");
        Assert.assertEquals(fileUploadPage.getUploadFiles(), "chromedriver", "wrong");
    }
}