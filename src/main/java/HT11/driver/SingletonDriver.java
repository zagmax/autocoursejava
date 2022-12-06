package HT11.driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SingletonDriver {
    public static WebDriver driver = new ChromeDriver();
    static By loginButton = By.cssSelector(".user-nav .right-nav li:last-child");

    public static void main(String[] args) {
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com/");
        driver.findElement(loginButton).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bookdepository.com/account/login/to/account");
        driver.quit();
    }
}
