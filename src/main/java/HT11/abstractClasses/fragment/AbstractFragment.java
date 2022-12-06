package HT11.abstractClasses.fragment;
import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {

    private WebElement rootElement;

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public AbstractFragment(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getRootElement() {
        return rootElement;
    }
}
