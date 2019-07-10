package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotels2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com");

        WebElement CloseButton = driver.findElement(By.xpath("//button[@class='cta widget-overlay-close']"));
        CloseButton.click();

        WebElement Destination = driver.findElement(By.xpath("//input[@id='qf-0q-destination']"));
        Destination.sendKeys("New York");


        WebElement City = driver.findElement(By.xpath("//tr[@id='citysqm-asi0-s0']//div[text()=', New York, United States of America']"));
        City.click();

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


        Select drpRooms = new Select(driver.findElement(By.id("qf-0q-compact-occupancy")));
        drpRooms.selectByIndex(2);

        Select drpAdult = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-adults']")));
        drpAdult.selectByIndex(1);

        Select drpChild = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-children']")));
        drpChild.selectByIndex(2);

        Select drpChildAge1 = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-child-0-age']")));
        drpChildAge1.selectByIndex(2);

        Select drpChildAge2 = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-child-1-age']")));
        drpChildAge2.selectByIndex(3);

        WebElement SubmitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        SubmitButton.click();

        String page2 = driver.getTitle();
        System.out.println(page2);

        if (page2.contains("New York")) {

            System.out.println("Title is correct");

        } else {
            System.out.println("Title is incorrect");
        }
    }
}
