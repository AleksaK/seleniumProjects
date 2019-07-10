package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShoot {

    public static void captureScreenshot(WebDriver driver, String screenshotName) {

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("./ScreenShots/"+screenshotName + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exeption while taking screenshot" + e.getMessage());

        }


    }
}
