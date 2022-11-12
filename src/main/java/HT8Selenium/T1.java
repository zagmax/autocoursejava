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
/*






*/
    public static void main(String[] args) throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://www.bookdepository.com/");
        String name = "Transfer Activity Book Unicorns";
        waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.className("text-input"))));
        driver.findElement(By.className("text-input")).sendKeys("camilla");
        waitFor(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='header-search-btn']"))));
        driver.findElement(By.xpath("//*[@class='header-search-btn']")).click();
        List<WebElement> bookList = driver.findElements(By.className("book-item"));
        List<WebElement> selectedBook = bookList.stream().filter(book -> book.getText().contains(name)).toList();
        WebElement book = selectedBook.get(0);
        actions.moveToElement(book.findElement(By.className("btn-wrap"))).click().perform();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.className("modal-content")));
        actions.moveToElement(driver.findElement(By.className("close"))).click().perform();
        waitFor(ExpectedConditions.invisibilityOf(driver.findElement(By.className("modal-content"))));
        actions.moveToElement(book.findElement(By.className("title"))).click().perform();
        driver.quit();
    }
}
