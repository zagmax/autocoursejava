package HT11.desktop.pages;

import HT11.abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import HT11.desktop.fragments.NavigationFragment;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {
    WebDriver driver;

    private By signinLoginField = By.xpath("//form[@name='signIn']//input[@name='email']");

    private By signinPassField = By.xpath("//form[@name='signIn']//input[@name='password']");
    private By signinSubmitButton = By.xpath("//form[@name='signIn']//input[@id='signInSubmit']");
    private By signInShowPassCheckbox = By.xpath("//form[@name='signIn']//input[@id='auth-show-password-checkbox']");
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void backToHomePage() {
        driver.findElement(NavigationFragment.getHomePageIconLink()).click();
    }

    public WebElement getSigninLoginField() {
        return driver.findElement(signinLoginField);
    }

    public WebElement getSigninPassField() {
        return driver.findElement(signinPassField);
    }

    public WebElement getSigninSubmitButton() {
        return driver.findElement(signinSubmitButton);
    }

    public WebElement getSignInShowPassCheckbox() {
        return driver.findElement(signInShowPassCheckbox);
    }
}
