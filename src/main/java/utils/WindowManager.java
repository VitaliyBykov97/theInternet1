package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    WebDriver driver;
    WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){

        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refresh(){
        navigate.refresh();
    }

    public void goTo (String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        Set<String> windows = driver.getWindowHandles();

        System.out.println("number pf tabs: " + windows.size());
        System.out.println("Titles");
        windows.forEach(System.out::println);

        for(String window : windows){

            System.out.println("Switch to tab " + window);
            driver.switchTo().window(window);

            System.out.println("Tag title is " + driver.getTitle());
            if (tabTitle.equals(driver.getTitle())){// соответствует название вкладки тому окну, которое открылось
                break;
            }
        }
    }
}
