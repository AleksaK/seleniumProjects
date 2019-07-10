package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class waitPractice {

    WebDriver driver = new ChromeDriver();


    @Test
    public void test1(){

        driver.get("https://www.facebook.com");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());
        wait.until(ExpectedConditions.titleIs("hello"));

        //Fluent wait



    }

}
