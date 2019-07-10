package Tests;

import Pages.Facebook.Loginpage;
import Pages.Facebook.SecondLoginpage;
import Utility.WrapperWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends WrapperWebDriver {

    Loginpage loginpage = new Loginpage();
    SecondLoginpage secondloginpage = new SecondLoginpage();


    @Test
    public void verifyLogin() {
        loginpage.enterEmail("a@gmail.com");
        loginpage.enterPassword("123456");
        loginpage.clickLogin();
        Assert.assertTrue(secondloginpage.isRecoveryAccountPresent(), "Link is not present");

    }

    @Test
    public void verifyRadButton (){
        Assert.assertFalse(loginpage.isFemaleButtonSelected());
        loginpage.clickRadButton();
        Assert.assertTrue(loginpage.isFemaleButtonSelected());

    }











}
