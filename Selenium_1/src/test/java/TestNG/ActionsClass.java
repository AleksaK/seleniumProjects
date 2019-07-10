package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ActionsClass {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void before() {
        driver.get("https://www.yahoo.com");
    }


    @Test
        public void test1(){

            driver.manage().window().maximize();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement bellButton = driver.findElement(By.xpath("//button[@title='Notifications']"));


            Actions act = new Actions(driver);
            act.moveToElement(bellButton).build().perform();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            List<WebElement> notifications = driver.findElements(By.xpath("//li[@class='yns-container'][*]//span[@class='yns-title']"));
           // System.out.println(notifications);

            List<String> news = new ArrayList<String>();
            for (WebElement not : notifications) {
                //news.add(not.getAttribute("title"));
                System.out.println(not.getAttribute("title"));
                //System.out.println(news);
            }
            //System.out.println(news);



        }
        @AfterClass
    public void after(){
        driver.close();
        }








    }


