package HT11.abstractClasses.page;

import HT11.desktop.fragments.NavigationFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {
    protected WebDriver driver;
    private NavigationFragment navFrag;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        getNavFrag();
    }

    public NavigationFragment getNavFrag() {
        if (navFrag == null) {
            navFrag = new NavigationFragment(driver.findElement(By.xpath("//*[@class='user-nav-wrap ']")));
        }
        return navFrag;
    }

    public void waitFor(ExpectedCondition<WebElement> func) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(func);
    }

    public void clickElement(WebElement element) {
        waitFor(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    public void sendKeys(WebElement element, String keys){
        element.sendKeys(keys);
    }
}
