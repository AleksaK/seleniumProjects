package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.getElementById('email').value='a@gmail.com';");
        js.executeScript("document.getElementById('pass').value='Sssssss1';");
        js.executeScript("document.getElementById('u_0_2').click()");




    }
}
