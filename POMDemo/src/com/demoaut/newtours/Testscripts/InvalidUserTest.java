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

public class InvalidUserTest extends BaseTest {

  
    
    @Test
    public void InvalidUsersTest() {
    	Login lp = new Login(driver);
    	lp.applicationLogin("fish", "fish");  //invalid credentials
    	
    	boolean signONPresent = driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
    	Assert.assertTrue(signONPresent);
      	   			
    }
    

}
