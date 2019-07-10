package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;


public class DarkSky {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");


       String array [] = {"NY", "NJ", "TX", "NV", "CT" };


        for(int i=0;i<=array.length-1;i++)
        {
            driver.findElement(By.xpath("//input[@type='text']")).clear();
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys(array[i]);
            driver.findElement(By.xpath("//a[@class='searchButton']//img[@height='16']")).click();
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }


            String title = driver.getTitle();
            System.out.println(title);

            List<WebElement> temps = driver.findElements(By.xpath("//span[@class='summary-high-low']/span"));
                   List<Integer> texts = new ArrayList<Integer>();
                   for (WebElement ele : temps) {
                       texts.add(Integer.valueOf(ele.getText().replaceAll("[^0-9]", "")));
                       // test[i]=ele.getText();
                       // System.out.println(ele.getText());

                       }

                   if ((texts.get(0)< texts.get(1)) && (texts.get(0)<texts.get(2)))
        {
                       System.out.println("temperature is correct");

                   }

                   else {System.out.println("temperature is incorrect");}

                   System.out.println(texts);

                  // for (String text : texts) {
                  //     System.out.println(text.replaceAll("[^0-9]",""));
                  // }





            if (title.contains(array[i])) {

                System.out.println("Title of the page  and State are the same");
                System.out.println("___________________________________________");

        }
            else {
                System.out.println("Title of the page  and State are not the same!");
                System.out.println("___________________________________________");
            }



        }


    }
}
