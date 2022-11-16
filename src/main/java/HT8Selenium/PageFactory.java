package HT8Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class PageFactory {
    private static WebDriver driver = new ChromeDriver();

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public static HomePage getHomePage() {
        return new HomePage(driver);
    }

    public static void waitFor(Function func) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(func);
    }

}
