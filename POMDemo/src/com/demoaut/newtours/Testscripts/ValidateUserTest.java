package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;

public class ValidateUserTest extends BaseTest {

 
    
    @Test
    public void ValidateUsersTest() {
    	Login lp = new Login(driver);
    	lp.applicationLogin("mercury", "mercury");
    	
    	boolean signOffPresent = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
    	Assert.assertTrue(signOffPresent);
      	   			
    }


}
