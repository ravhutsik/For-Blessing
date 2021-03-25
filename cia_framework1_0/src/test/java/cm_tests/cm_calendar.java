package cm_tests;

import cm_utils.driverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.calendar;
import pom.homepage;

import java.io.IOException;

public class cm_calendar {

    private homepage HPObject = new homepage(driverFactory.getDriver());
    private calendar calendarObjects = new calendar (driverFactory.getDriver());

    @Given("^i am on home page and click on the CALENDAR link$")
    public void iClickOnTheCALENDARLink() throws IOException {
        HPObject.calendar();
    }

    @When("^i can be able to view all available events$")
    public void iCanBeAbleToViewAllAvailableEvents() throws IOException {
        calendarObjects.eventValidation();
    }

    @Then("^i validate calendar page$")
    public void iValidateCalendarPage() throws IOException {
        calendarObjects.calendarValidation();
    }
}
