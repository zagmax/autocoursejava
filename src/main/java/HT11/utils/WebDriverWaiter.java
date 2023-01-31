package HT11.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaiter {
    protected static WebDriver driver;

    public static void waitFor(ExpectedCondition<WebElement> func) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(func);
    }
}

