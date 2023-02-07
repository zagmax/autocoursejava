package ht12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {
    public boolean matchStringToRegex(String text, String regex) {
        return (text.matches(regex));
    }

    public boolean isStringEmail(String email) {
        return email.matches("[A-Za-z0-9_]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{1,4}");
    }
    public boolean isStringIPAddress(String IP) {
        return (IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
    }
    public boolean isStringBankCardNumber(String number) {
        return (number.matches("\\d{16}"));
    }

    private WebDriver driver = new ChromeDriver();

    public void getAddress(){
        driver.get("https://www.epam.com/about/who-we-are/contact");
        String address=driver.findElement(By.cssSelector("b:first-child span.font-size-22:first-child")).getText();
        driver.quit();
        Pattern p = Pattern.compile("[\\w ]+");
        Matcher m = p.matcher(address);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
