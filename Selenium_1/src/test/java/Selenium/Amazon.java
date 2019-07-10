package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");


        WebElement SearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        SearchBox.sendKeys("book");



    }
}
