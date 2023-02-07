package HT11.abstractClasses.page;

import HT11.desktop.fragments.NavigationFragment;
import HT11.utils.WebDriverWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractPage {
    private WebDriver driver;
    private NavigationFragment navFrag;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        getNavFrag();
    }

    public NavigationFragment getNavFrag() {
        if (navFrag == null) {
            navFrag = new NavigationFragment(driver.findElement(By.xpath("//*[@class='user-nav-wrap ']")), driver);
        }
        return navFrag;
    }

    public void clickElement(By locator) {
        getElement(locator).click();
    }

    public void sendKeys(By locator, String keys) {
        WebDriverWaiter.waitForElementToAppear(locator);
        driver.findElement(locator).sendKeys(keys);
    }

    public WebElement getElement(By locator) {
        WebDriverWaiter.waitForElementToAppear(locator);
        return driver.findElement(locator);
    }
}
