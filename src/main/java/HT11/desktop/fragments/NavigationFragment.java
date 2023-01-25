package HT11.desktop.fragments;

import HT11.abstractClasses.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationFragment extends AbstractFragment {
    @FindBy(css = ".user-nav .right-nav li:last-child")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//a[@class='home-icon-link']")
    private WebElement homePageIconLink;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//a[@href='/contactus']")
    private WebElement contactUsLink;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//a[@href='/help']")
    private WebElement helpLink;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//div[@class='free-delivery']")
    private WebElement middleNavLink;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//a[@href='/track']")
    private WebElement trackOrderLink;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//a[@href='/account/wishlist']")
    private WebElement wishlistLink;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//a[@href='/account/login/to/account']")
    private WebElement loginLink;

    public NavigationFragment(WebElement element) {
        super(element);
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getHomePageIconLink() {
        return homePageIconLink;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    public WebElement getHelpLink() {
        return helpLink;
    }

    public WebElement getMiddleNavLink() {
        return middleNavLink;
    }

    public WebElement getTrackOrderLink() {
        return trackOrderLink;
    }

    public WebElement getWishlistLink() {
        return wishlistLink;
    }

    public WebElement getLoginLink() {
        return loginLink;
    }
}
