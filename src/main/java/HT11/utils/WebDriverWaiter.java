package HT11.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaiter {
    protected static WebDriver driver;

    public static void waitFor(ExpectedCondition<WebElement> func) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(func);
    }

    public static void waitForElementToAppear(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waifForElementToBeClickable(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(locator));
    }
}

