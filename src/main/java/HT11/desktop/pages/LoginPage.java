package HT11.desktop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import HT11.desktop.fragments.NavigationFragment;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void backToHomePage() {
        driver.findElement(NavigationFragment.getHomePageIconLink()).click();
    }

    private By signinLoginField = By.xpath("//form[@name='signIn']//input[@name='email']");
    private By signinPassField = By.xpath("//form[@name='signIn']//input[@name='password']");
    private By signinSubmitButton = By.xpath("//form[@name='signIn']//input[@id='signInSubmit']");
    private By signInShowPassCheckbox = By.xpath("//form[@name='signIn']//input[@id='auth-show-password-checkbox']");

    public By getSigninLoginField() {
        return signinLoginField;
    }

    public By getSigninPassField() {
        return signinPassField;
    }

    public By getSigninSubmitButton() {
        return signinSubmitButton;
    }

    public By getSignInShowPassCheckbox() {
        return signInShowPassCheckbox;
    }
}
