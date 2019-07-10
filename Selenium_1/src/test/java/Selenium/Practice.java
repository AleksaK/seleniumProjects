package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {


    public static void main(String[] args) {

       // System.setProperty("webdriver.chrome.driver" , "/Usr/local/bin/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("sashenka05@list.ru");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("123456");

        WebElement loginButton =driver.findElement(By.id("u_0_2"));
        loginButton.click();

        //driver.close();

    }


}
