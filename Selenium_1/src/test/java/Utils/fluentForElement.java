package Utils;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;

public class fluentForElement {




        public static WebElement webAction ( final By locator){
            WebDriver driver = new ChromeDriver();
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

