package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFrames = By.xpath("//*[@href='/nested_frames']");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickOnFramesPage() {
        driver.findElement(nestedFrames).click();
        return new NestedFramesPage(driver);
    }

    public class NestedFramesPage {
        private WebDriver driver;
        private By topFrame = By.xpath("//*[@name='frame-top']");
        private By middleFrame = By.xpath("//*[@name='frame-middle']");
        private By leftFrame = By.xpath("//*[@name='frame-left']");
        private By rightFrame = By.xpath("//*[@name='frame-right']");
        private By bottomFrame = By.xpath("//*[@name='frame-bottom']");
        private By middleText = By.id("content");
        private By bottomText = By.tagName("body");

        public NestedFramesPage(WebDriver driver) {
            this.driver = driver;
        }

        public void switchToMiddleFramesetFrame() {
            driver.switchTo().frame(driver.findElement(topFrame));
            driver.switchTo().frame(driver.findElement(middleFrame));
        }

        public void switchToMainPage() {
            driver.switchTo().parentFrame();
            driver.switchTo().parentFrame();
        }

        public void switchToBottomFramesetFrame() {
            driver.switchTo().frame(driver.findElement(bottomFrame));
        }

        public void switchToMainPageFromBottom() {
            driver.switchTo().parentFrame();
        }

        public String getTextFromMiddleFrameset() {
            switchToMiddleFramesetFrame();
            String element = driver.findElement(middleText).getText();
            switchToMainPage();
            return element;
        }

        public String getTextFromBottomFrameset() {
            switchToBottomFramesetFrame();
            String elementBottom = driver.findElement(bottomText).getText();
            switchToMainPageFromBottom();
            return elementBottom;

        }
    }
}
