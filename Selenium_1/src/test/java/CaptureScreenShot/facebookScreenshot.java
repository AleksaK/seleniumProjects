package CaptureScreenShot;

import Utils.ScreenShoot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class facebookScreenshot  {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {
        //driver.get("https://www.facebook.com");


    }


    @Test
        public void fbScreenshoot() throws IOException {
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        ScreenShoot.captureScreenshot(driver, "BrowserOpen");


        WebElement fnameField = driver.findElement(By.xpath("//input[@id='u_0_c']"));
        fnameField.sendKeys("Aleksandra");

        WebElement lnameField = driver.findElement(By.xpath("//input[@id='u_0_e']"));
        lnameField.sendKeys("Miskin");
        ScreenShoot.captureScreenshot(driver, "NameEntered");


       /* TakesScreenshot ts = (TakesScreenshot)driver;
        File src =  ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./ScreenShots/facebook.png"));
        System.out.println("Screenshot captured");

*/
            driver.quit();



        }
    }
