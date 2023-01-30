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

    public By getLoginButton() {
        return (loginButton);
    }

    public By getHomePageIconLink() {
        return (homePageIconLink);
    }

    public By getContactUsLink() {
        return (contactUsLink);
    }

    public By getHelpLink() {
        return (helpLink);
    }

    public By getMiddleNavLink() {
        return (middleNavLink);
    }

    public By getTrackOrderLink() {
        return (trackOrderLink);
    }

    public By getWishlistLink() {
        return (wishlistLink);
    }

    public By getLoginLink() {
        return (loginLink);
    }

    public void clickLoginLink() {
        clickElement(loginLink);
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
