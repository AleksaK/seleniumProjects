package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class yahooHW {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void before() {
        driver.get("https://www.yahoo.com");
    }

    @Test
    public void test1() {

        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        WebElement ads = driver.findElement(By.xpath("//iframe[@id='my-adsLREC-iframe']"));
        driver.switchTo().frame(ads);
        //Assert.assertTrue(ads.isEnabled(), "Link is not enabled");
        ads.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ads page title is: " + driver.getTitle());


      // Assert.assertTrue(driver.findElement(By.xpath("//iframe[@id='my-adsLREC-iframe']")).isEnabled(), "Frame link is not working");

        }



}
