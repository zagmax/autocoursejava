package HT9.cases;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import pages.HomePage;
import pages.PDP;
import pages.PageFactory;

import java.time.Duration;
import java.util.List;

public class cases {

    final Duration DEFAULT_WAITING_TIME = Duration.ofSeconds(10);
    WebDriver driver;
    HomePage homePage;
    BasePage basePage;
    PDP productPage;
    PageFactory pageFactory;

    @BeforeClass
    public static void setDriver() {
    }

    @Test
    public void test1() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bookdepository.com/");
        pageFactory = new PageFactory(driver);
        basePage = pageFactory.getBasePage();
        homePage = pageFactory.getHomePage();
        basePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        //Actions actions = new Actions(driver);
        String nameOfBook = "Transfer Activity Book Unicorns";
        //basePage.waitFor(ExpectedConditions.visibilityOf(homePage.getSearchInputBox()));
        homePage.getSearchInputBox().sendKeys("camilla");
        homePage.getSearchButton().click();
        basePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        List<WebElement> searchResult = driver.findElements(By.className("book-item")).stream().filter(book -> book.getText().contains(nameOfBook)).toList();

        Assert.assertTrue("no book was found", searchResult.size() > 0);
        driver.quit();
        driver = null;
    }

    @AfterClass
    public static void tearDown() {
    }
}
