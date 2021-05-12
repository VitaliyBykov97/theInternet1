package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clickLink(String linkText) {
        return driver.findElement(By.linkText(linkText));
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

    public ShiftingPage clickShiftingContent() {
        clickLink("Shifting Content").click();
        return new ShiftingPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown").click();
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider").click();
        return new HorizontalSliderPage(driver);
    }

    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password").click();
        return new ForgotPassword(driver);
    }

    public JavaScriptAlerts clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts").click();
        return new JavaScriptAlerts(driver);
    }

    public FileUploadPage fileUploadPAge (){
        clickLink("File Upload").click();
        return new FileUploadPage(driver);
    }

    public WysuwygEditorPage clickEditoPage (){
        clickLink("WYSIWYG Editor").click();
        return new WysuwygEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading").click();
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDomPage clickLargeDeepDomPage(){
        clickLink("Large & Deep DOM").click();
        return new LargeDeepDomPage(driver);
    }

    public EntryAd clickEntryAd(){
        clickLink("Entry Ad").click();
        return new EntryAd(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll").click();
        return new InfiniteScrollPage(driver);
    }

    public FramesPage clickFramesPage() {
        clickLink("Frames").click();
        return new FramesPage(driver);
    }

    public MultipieWindowsPage clickMultipieWindows(){
        clickLink("Multiple Windows").click();
        return new MultipieWindowsPage(driver);
    }
}
