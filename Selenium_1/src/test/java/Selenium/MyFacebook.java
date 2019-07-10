package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFacebook {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //to get rid og pop up windows
        //driver.switchTo().alert().dismiss();

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("sashulka_90@yahoo.com");

        WebElement passwordField = driver.findElement(By.name("pass"));
        passwordField.sendKeys("princeton10");


        WebElement loginButton =driver.findElement(By.id("u_0_2"));
        loginButton.click();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


        //driver.switchTo().alert().dismiss();

        WebElement myProfile = driver.findElement(By.xpath("//img[@class='_2qgu _54rt img']"));
        myProfile.click();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
