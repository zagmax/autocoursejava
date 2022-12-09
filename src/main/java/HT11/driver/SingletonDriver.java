package HT11.driver;

import HT11.desktop.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SingletonDriver {
    LoginPage loginPage = new LoginPage(driver);

    private static WebDriver driver;

    private SingletonDriver() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void checkLoginRedirect() {
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com/");
        loginPage.clickLoginLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.bookdepository.com/account/login/to/account");
        loginPage.backToHomePage();
        driver.quit();
    }
}
