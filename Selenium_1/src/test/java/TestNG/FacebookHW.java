package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookHW {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {
        //driver.get("https://www.facebook.com");
    }

    @Test
    public void test1() {
        driver.get("https://www.facebook.com");

        WebElement fnameField = driver.findElement(By.xpath("//input[@id='u_0_c']"));
        fnameField.sendKeys("Alexandra");

        WebElement lnameField = driver.findElement(By.xpath("//input[@id='u_0_e']"));
        lnameField.sendKeys("Miskin");


        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='u_0_k']")).isDisplayed(),"Is Not Displayed");
        WebElement emailField = driver.findElement(By.xpath("//input[@id='u_0_h']"));
        emailField.sendKeys("a@gmail.com");

        WebElement reenterEmail = driver.findElement(By.xpath("//input[@id='u_0_k']"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='u_0_k']")).isDisplayed(),"Is Displayed");
        reenterEmail.sendKeys("a@gmail.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@id='u_0_o']"));
        passwordField.sendKeys("123456");

        WebElement signUpButton = driver.findElement(By.xpath("//button[@id='u_0_u']"));
        signUpButton.click();


    }

        @Test
    public void test2() {
            driver.get("https://www.facebook.com");

            Assert.assertFalse(driver.findElement(By.id("u_0_9")).isSelected(), "IsFalse");
            driver.findElement(By.id("u_0_9")).click();
            Assert.assertTrue(driver.findElement(By.id("u_0_9")).isSelected(), "IsTrue");

            System.out.println(driver.findElement(By.id("u_0_9")).getAttribute("type"));
    }

    @Test
    public void test3(){

        driver.get("https://www.facebook.com");
        String page1 = driver.getTitle();
        System.out.println(page1);

        WebElement clickCreate = driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
        clickCreate.click();

        //System.out.println(driver.getTitle());

        WebElement fbLogo =driver.findElement(By.xpath("//i[@class='fb_logo img sp_caECuEN6t8a sx_31fb8d']"));
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


    @AfterTest
    public void afterTest() {

   // driver.close();
    }





}
