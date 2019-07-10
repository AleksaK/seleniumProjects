package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SecondLoginpage extends BasePage{
    private By loginEmail = By.xpath("//input[@name='email']");

    private By recoveryAccountLink = By.xpath("//a[@class='_42ft _4jy0 _62c3 _4jy4 _517h _51sy']");


    public boolean isRecoveryAccountPresent()

    {
        return isElementDisplayed(recoveryAccountLink) ;

    }

    public void clearEmail()

    { clearField(loginEmail);
    }


}
