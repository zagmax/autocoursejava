package pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public BasePage getBasePage() {
        return new BasePage(driver);
    }


    public PDP getPDP() {
        return new PDP(driver);

    }
}
