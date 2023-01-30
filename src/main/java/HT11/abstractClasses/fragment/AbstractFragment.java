package HT11.abstractClasses.fragment;

import HT11.utils.WebDriverWaiter;
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


    public void clickElement(WebElement element) {
        WebDriverWaiter.waitFor(ExpectedConditions.visibilityOf(element));
        element.click();
    }

}
