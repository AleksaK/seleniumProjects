package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class facebookRadButton {

        @Test
        public void test1(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");

            Assert.assertFalse(driver.findElement(By.id("u_0_9")).isSelected(), "IsFalse");
            driver.findElement(By.id("u_0_9")).click();
            Assert.assertTrue(driver.findElement(By.id("u_0_9")).isSelected(), "IsTrue");

            System.out.println(driver.findElement(By.id("u_0_9")).getAttribute("type"));


        }
    }


