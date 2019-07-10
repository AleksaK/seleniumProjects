package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleTabs {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com");

        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String parenrHandle = driver.getWindowHandle();
        Set<String> windowHandle = driver.getWindowHandles();
        for (String handle: windowHandle) {
            if (!handle.equals(parenrHandle)){
                driver.switchTo().window(handle);
                driver.manage().window().maximize();
                System.out.println("Title is " + driver.getTitle());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.close();
            }
            System.out.println(handle);

        }
        driver.switchTo().window(parenrHandle);




    }
}
