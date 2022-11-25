package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitFor(Function func) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(func);
    }
    public void waitForPageLoadComplete(Duration timeToWait) {
        new WebDriverWait(driver, timeToWait).until(webDriver -> ( (JavascriptExecutor) webDriver ).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForAjaxToComplete( Duration timeToWait ) {
        new WebDriverWait(driver, timeToWait).until(webDriver -> ( (JavascriptExecutor) webDriver ).executeScript("return window.jQuery != undefined && jQuery.active == 0;"));
    }
}
