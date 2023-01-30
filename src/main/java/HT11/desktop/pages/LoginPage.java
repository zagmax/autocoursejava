package HT11.desktop.pages;

import HT11.abstractClasses.page.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {
    private By signinLoginField = By.xpath("//form[@name='signIn']//input[@name='email']");
    private By signinPassField = By.xpath("//form[@name='signIn']//input[@name='password']");
    private By signinSubmitButton = By.xpath("//form[@name='signIn']//input[@id='signInSubmit']");
    private By signInShowPassCheckbox = By.xpath("//form[@name='signIn']//input[@id='auth-show-password-checkbox']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSigninLoginField() {
        return getElement(signinLoginField);
    }

    public WebElement getSigninPassField() {
        return getElement(signinPassField);
    }

    public WebElement getSigninSubmitButton() {
        return getElement(signinSubmitButton);
    }

    public WebElement getSignInShowPassCheckbox() {
        return getElement(signInShowPassCheckbox);
    }

    public void clickSigninSubmitButton() {
        clickElement(signinSubmitButton);
    }

    public void clickSignInShowPassCheckbox() {
        clickElement(signInShowPassCheckbox);
    }
}
