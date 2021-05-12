package Slider_Horizontal;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class SliderHorizontalTest extends BaseTest {

    @Test
    public void SliderTest() {
        HorizontalSliderPage sliderHorizontalTest = homePage.clickHorizontalSlider();
        sliderHorizontalTest.moveSliderRight(8);
        Assert.assertEquals(sliderHorizontalTest.getValueSlider(), "4","error");

    }
}
