package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hotels3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com");

        WebElement CloseButton = driver.findElement(By.xpath("//button[@class='cta widget-overlay-close']"));
        CloseButton.click();


        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement searchBox = driver.findElement(By.id("qf-0q-destination"));
        searchBox.sendKeys("new");

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        String selectRes = "//tbody[@class='autosuggest-city']//tr[@id='citysqm-asi0-s0']//span[@class='highlighted']";

        WebElement res = driver.findElement(By.xpath(selectRes));
        Actions  act = new Actions(driver);
        act.moveToElement(res);
        res.click();

    }
}
