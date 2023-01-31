package HT11.abstractClasses.page;

import HT11.desktop.fragments.NavigationFragment;
import HT11.utils.WebDriverWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class AbstractPage {
    protected WebDriver driver;
    private NavigationFragment navFrag;

    protected AbstractPage(WebDriver driver) {
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

    public void sendKeys(WebElement element, String keys) {
        WebDriverWaiter.waitFor(ExpectedConditions.visibilityOf(element));
        element.sendKeys(keys);
    }

    public WebElement getElement(By locator) {
        WebDriverWaiter.waitFor(ExpectedConditions.visibilityOf(driver.findElement(locator)));
        return driver.findElement(locator);
    }
}
