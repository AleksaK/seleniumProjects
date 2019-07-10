package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Loginpage extends BasePage {

    private By loginEmail = By.xpath("//input[@name='email']");
    private By loginPassword = By.xpath("//input[@id='pass']");
    private By loginSubmit = By.xpath("//button[@id='u_0_u']");
    private By radButton = By.id("u_0_9");
    private  By loginButton = By.xpath("//input[@value='Log In']");



    public void enterEmail(String emailAddr) {
        enterText(loginEmail, emailAddr);
    }

    public void enterPassword(String password) {
        enterText(loginPassword, password);
    }

    public void clickSubmit() {
        clickOn(loginSubmit);
    }
    public void clickLogin(){clickOn(loginButton);}
    public void clickRadButton (){clickOn(radButton);}

    public boolean isFemaleButtonSelected(){
        return isSelected(radButton);
    }






}
