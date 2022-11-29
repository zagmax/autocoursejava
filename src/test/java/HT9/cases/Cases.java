package HT9.cases;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.HomePage;
import pages.PDP;
import pages.PageFactory;

import java.time.Duration;

import static pages.HomePage.HOME_PAGE_URL;


public class Cases {

    final Duration DEFAULT_WAITING_TIME = Duration.ofSeconds(10);
    static String nameOfBook = "Transfer Activity Book Unicorns";

    static WebDriver driver = new ChromeDriver();
    HomePage homePage;
    static BasePage basePage;
    PDP productPage;
    static PageFactory pageFactory;

    @BeforeClass
    public static void setDriver() {
        driver.manage().window().maximize();
        driver.get(HOME_PAGE_URL);
        pageFactory = new PageFactory(driver);
    }

    @Test
    public void checkForBookAvailability() {
        homePage = pageFactory.getHomePage();
        homePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        homePage.getSearchInputBox().sendKeys("camilla");
        homePage.getSearchButton().click();
        homePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        Assert.assertTrue("no book was found", homePage.getBooksList().stream().filter(book -> book.getText().contains(nameOfBook)).toList().size() > 0);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
