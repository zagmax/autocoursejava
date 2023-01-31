package HT11.desktop.fragments;

import HT11.abstractClasses.fragment.AbstractFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NavigationFragment extends AbstractFragment {
    private By loginButton = By.cssSelector(".user-nav .right-nav li:last-child");
    private By homePageIconLink = By.xpath("//div[@class='user-nav-wrap ']//a[@class='home-icon-link']");
    private By contactUsLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/contactus']");
    private By helpLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/help']");
    private By middleNavLink = By.xpath("//div[@class='user-nav-wrap ']//div[@class='free-delivery']");
    private By trackOrderLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/track']");
    private By wishlistLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/account/wishlist']");
    private By loginLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/account/login/to/account']");

    public NavigationFragment(WebElement element, WebDriver driver) {
        super(element);
    }

    public WebElement getLoginButton() {
        return getElement((loginButton));
    }

    public WebElement getHomePageIconLink() {
        return getElement((homePageIconLink));
    }

    public WebElement getContactUsLink() {
        return getElement((contactUsLink));
    }

    public WebElement getHelpLink() {
        return getElement((helpLink));
    }

    public WebElement getMiddleNavLink() {
        return getElement((middleNavLink));
    }

    public WebElement getTrackOrderLink() {
        return getElement((trackOrderLink));
    }

    public WebElement getWishlistLink() {
        return getElement((wishlistLink));
    }

    public WebElement getLoginLink() {
        return getElement((loginLink));
    }

    public void clickLoginLink() {
        clickElement(getLoginLink());
    }

    public void clickLoginButton() {
        clickElement(getLoginButton());
    }

    public void clickWishlistLink() {
        clickElement(getWishlistLink());
    }

    public void clickTrackOrderLink() {
        clickElement(getTrackOrderLink());
    }

    public void clickHelpLink() {
        clickElement(getHelpLink());
    }

    public void clickContactUsLink() {
        clickElement(getContactUsLink());
    }

    public void clickMiddleNavLink() {
        clickElement(getMiddleNavLink());
    }

    public void clickHomePageIconLink() {
        clickElement(getHomePageIconLink());
    }

}
