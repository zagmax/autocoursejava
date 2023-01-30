package HT11.abstractClasses.fragment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public abstract class AbstractFragment {
    private WebDriver driver;
    private WebElement rootElement;

    protected AbstractFragment(WebElement element, WebDriver driver) {
        this.rootElement = element;
        this.driver = driver;
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return this.rootElement;
    }

    public void waitFor(ExpectedCondition<WebElement> func) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(func);
    }

    public void clickElement(WebElement element) {
        waitFor(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    protected WebElement getElement(By locator) {
        waitFor(ExpectedConditions.visibilityOf(driver.findElement(locator)));
        return driver.findElement(locator);
    }

}
