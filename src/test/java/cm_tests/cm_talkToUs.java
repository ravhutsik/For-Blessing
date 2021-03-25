package cm_tests;

import cm_utils.driverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pom.homepage;
import pom.talkToUs;

import java.io.IOException;

public class cm_talkToUs {
    //initializing the homepage object drivers
    private homepage HPObject = new homepage(driverFactory.getDriver());
    private talkToUs talkToUsObject = new talkToUs(driverFactory.getDriver());

    @Given("^i am at the WF home page$")
    public void iAmAtTheWFHomePage() throws IOException {
        HPObject.VerifyHomePage();
    }

    @When("^i click on the TALK TO US link$")
    public void iClickOnTheTALKTOUSLink() throws IOException {
        HPObject.talkToUs();
    }

    @And("^i can be able to click on the feedback/suggestion link$")
    public void iCanBeAbleToClickOnTheFeedbackSuggestionLink() throws IOException {
        talkToUsObject.suggestion();
    }

    @And("^i can be able to send email$")
    public void iCanBeAbleToSendEmail() throws IOException {
        talkToUsObject.suggestioncheckPoint();
    }
}
