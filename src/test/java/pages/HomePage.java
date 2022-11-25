package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    public static final String HOME_PAGE_URL = "https://www.bookdepository.com/";

    private List<WebElement> bookList;

    @FindBy(xpath = "//*[@class='header-search-btn']")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@class='text-input']")
    private WebElement searchInputBox;

    @FindBy(xpath = "//*[@class='text-input']")
    private WebElement neww;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, HOME_PAGE_URL);
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchInputBox() {
        return searchInputBox;
    }

    public List<WebElement> getBooksList() {
        return bookList = this.driver.findElements(By.className("book-item"));
    }
}
