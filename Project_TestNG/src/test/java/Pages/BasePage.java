package Pages;

import Utility.WrapperWebDriver;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebElement webAction(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(WrapperWebDriver.getDriver())
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

    public void clickOn(By locator) {
        webAction(locator).click();
    }
    public void clearField(By locator) {webAction(locator).clear();}

    public void enterText(By locator, String text) {
        webAction(locator).sendKeys(text);
    }

    public String getTextFromElement(By locator) {
        return webAction(locator).getText();
    }

    public String getAttributeValue(By locator, String attribute) {
        return webAction(locator).getAttribute(attribute);
    }

    public boolean isSelected(By locator) {
        return webAction(locator).isSelected();
    }

    public void selectFromDropdown(By locator, String visibleText) {
        Select dropdown = new Select(webAction(locator));
        dropdown.selectByVisibleText(visibleText);
    }

    public boolean isElementDisplayed (By locator){return webAction(locator).isDisplayed();}


















}
