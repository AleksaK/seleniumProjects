package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twitter.com");


        WebElement signupButton = driver.findElement(By.linkText("Sign Up"));
        signupButton.click();


       driver.get("https://twitter.com/i/flow/signup");
        WebElement nameField = driver.findElement(By.name("name"));
        nameField.sendKeys("Anna");

    }


}
