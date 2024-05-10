package stepdef;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import java.net.MalformedURLException;

public class LoginSetpDef{

    BaseTest base = new BaseTest();

    @Given("application is launched")
    public void application_is_launched() throws MalformedURLException {
        // Write code here that turns the phrase above into concrete actions
        base.createDriver();
    }
    @When("user enter username {string}")
    public void user_enter_username(String username) {
        LoginPage lp = new LoginPage();
        // Write code here that turns the phrase above into concrete actions
        lp.enterUserName(username);
    }
    @When("user enter password {string}")
    public void user_enter_password(String password) {
        LoginPage lp = new LoginPage();
        // Write code here that turns the phrase above into concrete actions
        lp.enterUserPassword(password);
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        LoginPage lp = new LoginPage();

        // Write code here that turns the phrase above into concrete actions
        lp.clickLogin();
    }
    @Then("Error message {string} is displayed")
    public void error_message_is_displayed(String error) {
        LoginPage lp = new LoginPage();
        // Write code here that turns the phrase above into concrete actions
        String orgErrMsg = "Username and password do not match any user in this service.";
        lp.verifyError(orgErrMsg, error);
    }
    @Then("user lands on {string} page")
    public void user_lands_on_page(String title) {
        LoginPage lp = new LoginPage();
        // Write code here that turns the phrase above into concrete actions
        lp.verifyProduct(title);
    }

}
