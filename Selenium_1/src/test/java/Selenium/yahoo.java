package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class yahoo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");

        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement bellButton = driver.findElement(By.xpath("//button[@title='Notifications']"));

        Actions act = new Actions(driver);
        act.moveToElement(bellButton).build().perform();

        List<WebElement> notifications = driver.findElements(By.xpath("//li[@class='yns-container']"));
        List<String> news = new ArrayList<String>();
        for (WebElement not : notifications) {
     news.add(not.getText());
  }
         System.out.println(news);


    }
}
