package stepdef;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import java.net.MalformedURLException;

public class LoginSetpDef{

    BaseTest base = new BaseTest();

    @Given("application is launched")
    public void application_is_launched() throws MalformedURLException {
        base.createDriver();
    }
    @When("user enter username {string}")
    public void user_enter_username(String username) {
        LoginPage lp = new LoginPage();
        lp.enterUserName(username);
    }
    @When("user enter password {string}")
    public void user_enter_password(String password) {
        LoginPage lp = new LoginPage();
        lp.enterUserPassword(password);
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        LoginPage lp = new LoginPage();
        lp.clickLogin();
    }
    @Then("Error message {string} is displayed")
    public void error_message_is_displayed(String error) {
        LoginPage lp = new LoginPage();
        String orgErrMsg = "Username and password do not match any user in this service.";
        lp.verifyError(orgErrMsg, error);
    }
    @Then("user lands on {string} page")
    public void user_lands_on_page(String title) {
        LoginPage lp = new LoginPage();
        lp.verifyProduct(title);
    }

}
