package HT8Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;


public class T1 {
    public static WebDriver driver = new ChromeDriver();

    public static void waitFor(Function func) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(func);
    }

    public static void main(String[] args) throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://www.bookdepository.com/");
        String nameOfBook = "Transfer Activity Book Unicorns";
        waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.className("text-input"))));
        driver.findElement(By.className("text-input")).sendKeys("camilla");
        waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='header-search-btn']"))));
        driver.findElement(By.xpath("//*[@class='header-search-btn']")).click();
        List<WebElement> bookList = driver.findElements(By.className("book-item"));
        List<WebElement> selectedBook = bookList.stream().filter(book -> book.getText().contains(nameOfBook)).toList();
        WebElement book = selectedBook.get(0);
        actions.moveToElement(book.findElement(By.className("btn-wrap"))).click().perform();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.className("modal-content")));
        actions.moveToElement(driver.findElement(By.className("close"))).click().perform();
        waitFor(ExpectedConditions.invisibilityOf(driver.findElement(By.className("modal-content"))));
        actions.moveToElement(book.findElement(By.className("title"))).click().perform();
        driver.quit();
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
