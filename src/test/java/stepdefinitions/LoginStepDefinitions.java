package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {
    LoginStepDefinitions loginStepDefinitions = new LoginStepDefinitions();


    @Given("Go to bookzpro.com home page")
    public void go_to_bookzpro_com_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bookz_url"));

    }




    @Given("Click on the user Account menu")
    public void click_on_the_user_account_menu() {



    }
    @Given("Given user enters email address")
    public void given_user_enters_email_address() {

    }
    @Given("enter the user Password")
    public void enter_the_user_password() {

    }
}