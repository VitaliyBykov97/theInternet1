package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }


    // 2- based index
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;//драйвер работает как исполнитель скриптов \
        while (getParagraphsCount() < index){
            javascriptExecutor.executeScript(script);
        }
    }

    public int getParagraphsCount(){
        return driver.findElements(textBlock).size();
    }

    //public void

    //document.body.scrollHeight - сообщает на какую высоту модно проскролить страницу
    // window.scrollTo(x,y) - сообщает к какойму праметру надо сдвинуться
    //window.scrollTo(0, document.body.scrollHeight)
}
