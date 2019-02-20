package com.cybertek.step_definitions;

import com.cybertek.pages.MySchedulePage;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.ApplicationConstants;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.UserUitility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class UserRolesStepDefinition {

    @Given("the user logs in as a light-side team member")
    public void the_user_logs_in_as_a_light_side_team_member() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        SignInPage signInPage = new SignInPage();
       Map<String , String >userCredentials = UserUitility.getUserCredentials(
               ApplicationConstants.STUDENT_TEAM_MEMBER,ApplicationConstants.LIGHT_SIDE);
        signInPage.login(userCredentials.get("email"),userCredentials.get("password"));
    }

    @Given("the user logs in as a light-side team lead")
    public void the_user_logs_in_as_a_light_side_team_lead() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("the user logs in as a light-side teacher")
    public void the_user_logs_in_as_a_light_side_teacher() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("there are available spots for scheduling")
    public void there_are_available_spots_for_scheduling() {

        MySchedulePage mySchedulePage = new MySchedulePage();

    }

    @When("the user hunts for a spot")
    public void the_user_hunts_for_a_spot() {

    }

    @Then("book button should not be displayed")
    public void book_button_should_not_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



    @Then("book button should be displayed")
    public void book_button_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}
