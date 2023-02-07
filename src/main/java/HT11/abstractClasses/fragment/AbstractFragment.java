package HT11.abstractClasses.fragment;

import HT11.utils.WebDriverWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public abstract class AbstractFragment {
    private WebElement rootElement;

    protected AbstractFragment(WebElement element) {
        this.rootElement = element;
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return this.rootElement;
    }

    public WebElement getElement(By locator) {
        WebDriverWaiter.waitForElementToAppear(locator);
        return rootElement.findElement(locator);
    }
    public void clickElement(By locator) {
        getElement(locator).click();
    }


}
