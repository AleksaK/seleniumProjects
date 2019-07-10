import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InterruptedIOException;

public class Facebook {

    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("sashenka05@list.ru");

        WebElement passwordField = driver.findElement(By.name("pass"));
        passwordField.sendKeys("123456");

        //WebElement loginButton =driver.findElement(By.id("u_0_2"));
        //loginButton.click();

        WebElement linkCreate = driver.findElement(By.linkText("Create a Page"));
        linkCreate.click();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement linkForgotAccount = driver.findElement(By.partialLinkText("Forgot account?"));
        linkForgotAccount.click();


        WebElement findEmail = driver.findElement(By.id("identify_email"));
        findEmail.sendKeys("sashenka05@lis.ru");

    }
}
