package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DarkSky2 {
    public static void main(String[] args)  {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");

        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat df = new SimpleDateFormat("h");
        System.out.println(df.format(now));

        SimpleDateFormat dayToday = new SimpleDateFormat("d");
        System.out.println(dayToday.format(now));


        List<WebElement> temps = driver.findElements(By.xpath("//div[@id='timeline']//div[@class='hours']"));
        List<String> texts = new ArrayList<String>();
        //String []  tex = new String[temps.size()];
        for (WebElement ele : temps) {
            texts.add(ele.getText());
        }


        for (String text : texts) {
            System.out.println(text.replaceAll("[^0-9]", ""));
        }


        try {

            int timeNow = Integer.valueOf(df.format(now));
            int timeOnWebSite = Integer.valueOf(texts.get(0));

            if (timeNow +2 == timeOnWebSite) {

                System.out.println("Time is correct");
            }

            else {
                System.out.println("Time is incorrect");
            }
        }   catch (NumberFormatException e) {


           // System.out.println(texts);

        }

        WebElement TimeMachine = driver.findElement(By.xpath("//a[@class='button']"));
        TimeMachine.click();

        WebElement todaysDateWebSite =  driver.findElement(By.xpath("//td[@class='is-today']"));
        System.out.println("todaysDateWebSite");

        int todaysDate = Integer.valueOf(dayToday.format(now));
        //int todaysDateWeb = Integer.valueOf(todaysDateWebSite);






        }
    }

