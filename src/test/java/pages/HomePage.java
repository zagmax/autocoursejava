package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class HomePage extends BasePage {
    WebDriver driver;
    public static final String HOME_PAGE_URL = "https://www.bookdepository.com/";

    By searchButtonPath = By.xpath("//*[@class='header-search-btn']");
    By searchInputBoxPath = By.xpath("//*[@class='text-input']");
    By allBooks = By.className("book-item");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButtonPath);
    }

    public WebElement getSearchInputBox() {
        return driver.findElement(searchInputBoxPath);
    }

    public List<WebElement> getBooksList() {
        return driver.findElements(allBooks);
    }
}
