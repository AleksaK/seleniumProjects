package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.facebook.com");
        String page1 = driver.getTitle();
        System.out.println(page1);

        WebElement clickCreate = driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
        clickCreate.click();

        //System.out.println(driver.getTitle());

        WebElement fbLogo =driver.findElement(By.xpath("//i[@class='fb_logo img sp_QWp0VwOicFX_1_5x sx_6622d5']"));
        fbLogo.click();

        String page2 = driver.getTitle();
        System.out.println(page2);

        if (page1.equals(page2)){

            System.out.println("Titles are the same");
    }
        else{
            System.out.println("error");
        }
    }
}
