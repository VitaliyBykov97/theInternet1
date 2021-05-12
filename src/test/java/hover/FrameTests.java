package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysuwygEditorPage;

public class FrameTests extends BaseTest {

    @Test
    public void testEditor(){
        WysuwygEditorPage wysuwygEditorPage = homePage.clickEditoPage();
        wysuwygEditorPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "word!";

        wysuwygEditorPage.sendTextToTextArea(text1);
        wysuwygEditorPage.increaseIndent();
        wysuwygEditorPage.sendTextToTextArea(text2);

        Assert.assertEquals(wysuwygEditorPage.getTextAreaContent(), text1 + text2, "wrong");

    }
}
