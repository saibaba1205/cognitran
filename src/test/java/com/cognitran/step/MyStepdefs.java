package com.cognitran.step;

import com.cognitran.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on the Homepage$")
    public void iAmOnTheHomepage() {
        new HomePage().acceptcookies();
    }

    @When("^I mouseHover on careers tab$")
    public void iMouseHoverOnCareersTab() {
        new HomePage().mousehoveroncareers();
    }

    @And("^I click on students & graduates tab$")
    public void iClickOnStudentsGraduatesTab() {
        new HomePage().clickonstudentandgraduates();
    }

    @And("^I should varify text we are currently looking for$")
    public void iShouldVarifyTextWeAreCurrentlyLookingFor() {
new HomePage().verifytextcareer("We are currently looking for:");
    }

    @Then("^I should be able to click on submit your cv tab$")
    public void iShouldBeAbleToClickOnSubmitYourCvTab() {
    }
}
