package HT11.abstractClasses.fragment;

import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {

    private WebElement rootElement;

    public AbstractFragment() {

    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebElement getRootElement() {
        return rootElement;
    }
}
