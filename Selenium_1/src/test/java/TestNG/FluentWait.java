package TestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentWait {
/*
    public void Fluent(){
        WebDriver driver = new ChromeDriver();

        public static WebElement webAction(final By locator) {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(15, TimeUnit.SECONDS)
                    .pollingEvery(1, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .ignoring(ElementNotVisibleException.class)
                    .withMessage(
                            "Webdriver waited for 15 seconds but still could not find the element therefore Timeout Exception has been thrown");

            WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(locator);
                }
            });
            return element;
        }

    }

*/
}
