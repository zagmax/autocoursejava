package HT11.abstractClasses.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    WebDriver driver;
    public static final String HOME_PAGE_URL = "https://www.bookdepository.com/";
    private By basketButton = By.xpath("//div[@class='right-section']/div[@class='basket-wrap']/a");
    private By searchButtonPath = By.xpath("//*[@class='header-search-btn']");
    private By searchInputBoxPath = By.xpath("//*[@class='text-input']");
    private By loginButton = By.cssSelector(".user-nav .right-nav li:last-child");

    public By getSearchButtonPath() {
        return searchButtonPath;
    }
    public By getSearchInputBoxPath() {
        return searchInputBoxPath;
    }
    public By getLoginButton() {
        return loginButton;
    }
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getPageUrl() {
        return HOME_PAGE_URL;
    }
    public By getBasketButton() {
        return basketButton;
    }
}
