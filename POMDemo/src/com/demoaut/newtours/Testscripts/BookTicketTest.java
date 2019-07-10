package com.demoaut.newtours.Testscripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//initialy this import displays page name, replays it with * , means ALL PAGES
import com.demoaut.newtours.Pages.*;  

public class BookTicketTest extends BaseTest {
	
//	WebDriver driver;
	
//   @BeforeTest
//   public void openBrowser(){
//    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//    	driver = new ChromeDriver();
//    	driver.manage().window().maximize();
//    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    	driver.get("http://newtours.demoaut.com");
//    }  
  
  
    @Test
    public void ticketBookingTest() {
    	Login lp = new Login(driver);
    	FlightFinder ff = new FlightFinder(driver);
    	SelectFlight sf = new SelectFlight (driver);
    	BookFlight bf = new BookFlight (driver);
    	FlightConfirmation fc = new FlightConfirmation (driver);
    	
    	
    	lp.applicationLogin("mercury", "mercury");
    	ff.findFlight();
    	sf.flightSelection();
    	bf.flightBooking("Marina", "Moro", "12345");
    	
    	String expectedMessage = "Your itinerary has been booked!";
    	String actualMessage = fc.messageCSS.getText();
       // driver.findElements(By.cssSelector("value")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    	
    }
    
    
//     @AfterTest
//     public void closeBrowser() {
//    	 driver.close();
//     }
//     

}

