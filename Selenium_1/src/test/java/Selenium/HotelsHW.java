package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelsHW {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com");

        WebElement CloseButton = driver.findElement(By.xpath("//button[@class='cta widget-overlay-close']"));
        CloseButton.click();

        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //DESTINATION
        WebElement Destination = driver.findElement(By.xpath("//input[@id='qf-0q-destination']"));
        Destination.sendKeys("bora");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String autoResult = "//tbody[@class='autosuggest-city']//tr";

        List<WebElement> results = driver.findElements(By.xpath(autoResult));
        //List<String> destinations = new ArrayList<String>();
        //for (WebElement dest : results) {
        //  destinations.add(dest.getText());
        //   }
        //System.out.println(destinations);

        for (int i = 0; i < results.size() - 1; i++) {
            if (results.get(i).getText().contains("Bora Bora, French Polynesia")) {
                Actions act = new Actions(driver);
                act.moveToElement(results.get(i));
                results.get(i).click();
            }
        }
        // Check in check out dates
        Date now = new Date();

        SimpleDateFormat dayToday = new SimpleDateFormat("d");
        //System.out.println(dayToday.format(now));

        String a = "//td[@data-date='2019-2-";
        int checkin = Integer.valueOf(dayToday.format(now)) + 1;p
        String b1 = String.valueOf(checkin);
        //System.out.println(b1);
        int checkout = Integer.valueOf(dayToday.format(now)) + 10;
        String b2 = String.valueOf(checkout);
        //System.out.println(b2);
        String c = "']";

        //check in
        WebElement CheckIn = driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-in']"));
        CheckIn.click();

        WebElement CheckInDate = driver.findElement(By.xpath(a + b1 + c));
        CheckInDate.click();

        //check out
        WebElement CheckOut = driver.findElement(By.xpath("//input[@id='qf-0q-localised-check-out']"));
        CheckOut.click();

        WebElement CheckOutDate = driver.findElement(By.xpath(a + b2 + c));
        CheckOutDate.click();

        // Validate number of nights
        WebElement Nights = driver.findElement(By.xpath("//span[@class='widget-query-num-nights']"));
        int ngt = Integer.valueOf(Nights.getText());

        if (ngt == 9) {
            System.out.println("Number of night is correct");
        } else {
            System.out.println("Number of nights is incorrect");
        }

        //Dropdowns
        Select drpRooms = new Select(driver.findElement(By.id("qf-0q-compact-occupancy")));
        drpRooms.selectByIndex(2);

        Select drpAdult = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-adults']")));
        drpAdult.selectByIndex(1);
       

        String ch1 = "//select[@id='qf-0q-room-";
        String ch3 = "-children']";

        int num = 2;
        String ChildrenxPath = null;
        for (int i = 0; i < num; i++) {
            String ch2 = String.valueOf(i);
            ChildrenxPath = ch1 + ch2 + ch3;
            System.out.println(ChildrenxPath);
        }

        Select drpChild = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-children']")));
        drpChild.selectByIndex(num);


    }
}
