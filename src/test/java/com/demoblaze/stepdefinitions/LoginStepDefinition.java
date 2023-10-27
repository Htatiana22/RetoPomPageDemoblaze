package com.demoblaze.stepdefinitions;

import com.demoblaze.steps.HomeSteps;
import com.demoblaze.steps.LoginSteps;
import com.demoblaze.steps.ValidateLogin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    HomeSteps homeSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    ValidateLogin validateLogin;
    @Given("The user open demoblaze page")
    public void theUserOpenDemoblazePage() {
        homeSteps.openBrowser();
    }
    @When("The user selects the login option")
    public void theUserSelectsTheLoginOption() {
        homeSteps.clickLogIn();
        loginSteps.enterData();
    }
    @Then("The user can login successfully")
    public void theUserCanLoginSuccessfully() {
        validateLogin.validateMessage();
    }
}
