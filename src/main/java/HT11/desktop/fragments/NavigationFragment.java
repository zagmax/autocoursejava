package HT11.desktop.fragments;

import HT11.abstractClasses.fragment.AbstractFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationFragment extends AbstractFragment {

    private WebElement rootElement;
    private static By homePageIconLink = By.xpath("//div[@class='user-nav-wrap ']//a[@class='home-icon-link']");
    private By contactUsLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/contactus']");
    private By helpLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/help']");
    private By middleNavLink = By.xpath("//div[@class='user-nav-wrap ']//div[@class='free-delivery']");
    private By trackOrderLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/track']");
    private By wishlistLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/account/wishlist']");
    private By loginLink = By.xpath("//div[@class='user-nav-wrap ']//a[@href='/account/login/to/account']");

    public NavigationFragment(WebElement rootElement) {
        super(rootElement);
        this.rootElement = rootElement;
    }

    public static By getHomePageIconLink() {
        return homePageIconLink;
    }

    public By getContactUsLink() {
        return contactUsLink;
    }

    public By getHelpLink() {
        return helpLink;
    }

    public By getMiddleNavLink() {
        return middleNavLink;
    }

    public By getTrackOrderLink() {
        return trackOrderLink;
    }

    public By getWishlistLink() {
        return wishlistLink;
    }

    public By getLoginLink() {
        return loginLink;
    }
}
