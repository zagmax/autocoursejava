package HT11.abstractClasses.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    WebDriver driver;
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButton(By path){
        driver.findElement(path).click();
    }
    public void sendKeyword(By path, String keyword){
        driver.findElement(path).sendKeys(keyword);
    }
}
