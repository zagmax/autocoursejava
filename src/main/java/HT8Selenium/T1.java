package HT8Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class T1 {
    //public static WebDriver driver = new ChromeDriver();
    static HomePage homePage;

    public static void main(String[] args) throws InterruptedException {
        homePage = PageFactory.getHomePage();
        //homePage.driver.get(homePage.HOME_PAGE_URL);
        Actions actions = new Actions(homePage.driver);
        String nameOfBook = "Transfer Activity Book Unicorns";
        //PageFactory.waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.className("text-input"))));
        //PageFactory.waitFor(ExpectedConditions.);
        PageFactory.waitFor(ExpectedConditions.visibilityOf(homePage.getSearchInputBox()));
        //driver.findElement(By.className("text-input"))
        homePage.getSearchInputBox().sendKeys("camilla");
        PageFactory
                .waitFor(ExpectedConditions
                .visibilityOf(homePage.getSearchButton()));
        homePage.getSearchButton().click();
        List<WebElement> bookList = homePage.driver.findElements(By.className("book-item"));
        List<WebElement> selectedBook = bookList.stream().filter(book -> book.getText().contains(nameOfBook)).toList();
        WebElement book = selectedBook.get(0);
        actions.moveToElement(book.findElement(By.className("btn-wrap"))).click().perform();
        PageFactory.waitFor(ExpectedConditions.presenceOfElementLocated(By.className("modal-content")));
        actions.moveToElement(homePage.driver.findElement(By.className("close"))).click().perform();
        PageFactory.waitFor(ExpectedConditions.invisibilityOf(homePage.driver.findElement(By.className("modal-content"))));
        actions.moveToElement(book.findElement(By.className("title"))).click().perform();
        //driver.quit();
    }
}
    /*
    Локаторы: https://www.bookdepository.com/
    --- On the Home page locate logo, Sign in Register, icon, search field, navigation menu, banner.
    logo: //*[@class='brand-link']/img
    sign in register: //li[@class='mob-nav-account']/a[@href='/account/login/to/account']
    icon (?) : 1) //*[@class='brand-link']/img
               2) //*[img]
    search field: //form[@id='book-search-form']//input[@class='text-input']
    navigation menu: //ul[@class='page-links mobile-nav-content']
    banner: //*[@class='paragraph-content']
    --------------------
    7.	Select any site and select 5 elements on it, wright 3 css and 3 xpath selectors for each(could be added as a separate file,or commented lines in the code
    --------------------

allo.ua/
1)
CSS: a.v-logo > img   <> div.mh__sr > a:not(div) <> div.mh__sr > a:only-of-type
Xpath: //a[@class='v-logo']/img <> //a[@href='https://allo.ua/']/child::* <> //img[@class='v-logo__img']
2)
CSS: div.mh-catalog-btn <> div.mh-catalog-btn:nth-child(3) <> div.mh__sr > div:nth-last-child(3)
Xpath: //*[@class='mh-catalog-btn'] <> //*[@class='ct-button']/parent::div <> //a[@class='v-logo']/following-sibling::div
3)
CSS: input.search-form__input <> form input:only-child <> label.search-form__label *
Xpath: //*[@id='search-form__input'] <> //*[@class='search-form__label']/child::input <> //input[@name='search']
4)
CSS: div.footer-additional <> div.footer-additional:nth-child(2) <> div.footer-additional:last-child
Xpath: //*[@class='footer-additional'] <> //*[@class='footer']/child::div/following-sibling::div <> //*[@class='footer-copyright footer__copyright--home']/parent::div
5)
CSS: div.mh-actions <> div.mh-actions:last-child <> div.mh-actions:nth-child(5)
Xpath: //*[@class='mh-actions'] <> //div[@class='mh-search']/following-sibling::div <> //*[@class='mh-profile']/parent::div









    */
