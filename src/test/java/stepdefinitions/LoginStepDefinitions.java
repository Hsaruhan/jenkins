package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();


    @Given("Go tto bookzpro.com home page")
    public void goTtoBookzproComHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bookz_url"));
    }


    @Given("Click on the user Account menu")
    public void click_on_the_user_account_menu() {
        loginPage.accountIcon.click();

    }
    @Given("Given user enters email address")
    public void given_user_enters_email_address() {
        loginPage.e_mail.sendKeys(ConfigurationReader.getProperty("b_valid_mail"));
    }
    @Given("enter the user Password")
    public void enter_the_user_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("b_valid_password"));
    }
    @Given("user Clicks Login button")
    public void user_clicks_login_button() {
        loginPage.firstLogin.click();

    }


}