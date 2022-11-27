package HT10.cases;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

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


    static WebDriver driver = new ChromeDriver();
    HomePage homePage;
    static BasePage basePage;
    PDP productPage;
    static PageFactory pageFactory;

    @Before
    public static void setDriver() {
        driver.manage().window().maximize();
        pageFactory = new PageFactory(driver);
        basePage = pageFactory.getBasePage();
    }

    @Given("User opens the home page")
    public void openHomePage() {
        driver.get(HOME_PAGE_URL);
        homePage = pageFactory.getHomePage();
    }

    @And("page is loaded")
    public void waitForPageToLoad() {
        basePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
    }

    @When("user searches for {string} via search field")
    public void sendKeysInSearchField(final String keyword) {
        homePage.getSearchInputBox().sendKeys(keyword);
        homePage.getSearchButton().click();
    }

    @Then("result page contains {string}")
    public void checkPresenceOfABook(final String name) {
        Assert.assertTrue("no book was found", homePage.getBooksList().stream().filter(book -> book.getText().contains(name)).toList().size() > 0);

    }

    @After
    public static void tearDown() {
        driver.quit();
        driver = null;
    }
    /**
     * @Test public void checkForBookAvailability() {
     * homePage = pageFactory.getHomePage();
     * basePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
     * homePage.getSearchInputBox().sendKeys("camilla");
     * homePage.getSearchButton().click();
     * basePage.waitForPageLoadComplete(DEFAULT_WAITING_TIME);
     * Assert.assertTrue("no book was found", homePage.getBooksList().stream().filter(book -> book.getText().contains(nameOfBook)).toList().size() > 0);
     * <p>
     * }
     */
}
