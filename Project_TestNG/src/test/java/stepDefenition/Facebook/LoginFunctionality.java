package stepDefenition.Facebook;

import Pages.Facebook.Loginpage;
import Pages.Facebook.SecondLoginpage;
import Utility.WrapperWebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFunctionality extends WrapperWebDriver {

    Loginpage loginpage = new Loginpage();
    SecondLoginpage secloginpage =new SecondLoginpage();

    @Given("^User is on Facebook login page$")
    public void user_is_on_Facebook_login_page()  {
      WrapperWebDriver.before();

    }

    @When("^User enters\\s*(.+) in (email|password)( again)*$")
    public void user_enters_abcd_in_email(String value, String field, String again)  {
        switch (field.toLowerCase()) {
            case "email":
            loginpage.enterEmail(value);
            break;
            case "password":
             loginpage.enterPassword(field);
             break;
             default: System.out.println("please use email/password");
             break;
        }



    }

    @When("^User enteres (.+) in password$")
    public void user_enteres_in_password(String psw) {
        loginpage.enterPassword(psw);

    }

    @When("^User clicks on login button$")
    public void user_clicks_on_login_button()  {
        loginpage.clickLogin();
        secloginpage.clearEmail();

    }


    @Then("^User lands on homepage$")
    public void user_lands_on_homepage() {
        // Write code here that turns the phrase above into concrete actions

    }


}
