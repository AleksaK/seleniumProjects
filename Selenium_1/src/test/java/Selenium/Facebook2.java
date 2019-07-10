package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement fnameField = driver.findElement(By.xpath("//input[@id='u_0_c']"));
        fnameField.sendKeys("Alexandra");

        WebElement lnameField = driver.findElement(By.xpath("//input[@id='u_0_e']"));
        lnameField.sendKeys("Miskin");

        WebElement emailField = driver.findElement(By.xpath("//input[@id='u_0_h']"));
        emailField.sendKeys("a@gmail.com");

        WebElement reenterEmail = driver.findElement(By.xpath("//input[@id='u_0_k']"));
        reenterEmail.sendKeys("a@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@id='u_0_o']"));
        passwordField.sendKeys("123456");

        WebElement selectSex = driver.findElement(By.xpath("//input[@id='u_0_9']"));
        selectSex.click();

        WebElement signUpButton = driver.findElement(By.xpath("//button[@id='u_0_u']"));
        signUpButton.click();



    }
}
