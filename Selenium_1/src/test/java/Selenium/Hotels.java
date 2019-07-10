package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotels {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com");

        WebElement CloseButton = driver.findElement(By.xpath(" //button[@class='cta widget-overlay-close']"));
        CloseButton.click();

        String a=  "//td[@data-date='2019-2-" ;
        String b1 = "1";
        String b2= "10";
        String c = "']" ;

        //check in
        WebElement CheckIn = driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-in']"));
        CheckIn.click();

        WebElement CheckInDate = driver.findElement(By.xpath(a+b1+c));
        CheckInDate.click();

        //check out
        WebElement CheckOut = driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-out']"));
        CheckOut.click();

        WebElement CheckOutDate = driver.findElement(By.xpath(a+b2+c));
        CheckOutDate.click();

        WebElement Nights = driver.findElement(By.xpath("//span[@class='widget-query-num-nights']"));
         int ngt = Integer.valueOf(Nights.getText());

         if (ngt==9){
             System.out.println("Number of night is correct");
         }

    }
}
