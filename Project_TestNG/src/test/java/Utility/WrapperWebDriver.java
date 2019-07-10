package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WrapperWebDriver {

    private static ConfigReader read =new ConfigReader();
    private static WebDriver driver = null;
    private static String url = read.getUrl();


    @BeforeMethod
    public static void before() {

       // System.setProperty("webdriver.chrome.driver", "C:\\Project_TestNG\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }


    @AfterMethod
    public static void after() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
