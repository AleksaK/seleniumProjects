package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//private WebElement user = driver.findElement(By.name("userName"))
	@FindBy(name="userName")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy ( name="login")
	private WebElement submit;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void applicationLogin(String username, String password) {
		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	
	}
}
