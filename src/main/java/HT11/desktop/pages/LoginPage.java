package HT11.desktop.pages;

import HT11.abstractClasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//form[@name='signIn']//input[@name='email']")
    private WebElement signinLoginField;
    @FindBy(xpath = "//form[@name='signIn']//input[@name='password']")
    private WebElement signinPassField;
    @FindBy(xpath = "//form[@name='signIn']//input[@id='signInSubmit']")
    private WebElement signinSubmitButton;
    @FindBy(xpath = "//form[@name='signIn']//input[@id='auth-show-password-checkbox']")
    private WebElement signInShowPassCheckbox;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSigninLoginField() {
        return signinLoginField;
    }

    public WebElement getSigninPassField() {
        return (signinPassField);
    }

    public WebElement getSigninSubmitButton() {
        return (signinSubmitButton);
    }

    public WebElement getSignInShowPassCheckbox() {
        return (signInShowPassCheckbox);
    }
}
