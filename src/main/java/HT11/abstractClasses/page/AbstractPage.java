package HT11.abstractClasses.page;

import HT11.desktop.fragments.NavigationFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    WebDriver driver;
    public NavigationFragment navFrag;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        navFrag = new NavigationFragment(driver);
    }

    public void clickButton(By path) {
        driver.findElement(path).click();
    }

    public void sendKeyword(By path, String keyword) {
        driver.findElement(path).sendKeys(keyword);
    }

    public void clickLoginLink() {
        driver.findElement(navFrag.getLoginLink()).click();
    }
}
