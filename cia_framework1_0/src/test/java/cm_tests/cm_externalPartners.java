package cm_tests;

import cm_utils.driverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pom.externalPartners;
import pom.homepage;

import java.io.IOException;

public class cm_externalPartners {
    private homepage HPObject = new homepage(driverFactory.getDriver());
    private externalPartners ExternaObject = new externalPartners(driverFactory.getDriver());


    @Given("^i'm at the WF home page$")
    public void iMAtTheWFHomePage() throws IOException {
        HPObject.VerifyHomePage();
    }

    @When("^i click on the EXTERNAL PARTNERS link$")
    public void iClickOnTheEXTERNALPARTNERSLink() throws IOException {
        HPObject.ExternalPartners();
    }

    @And("^i can be able to view all external events$")
    public void iCanBeAbleToViewAllExternalEvents() throws IOException {
        ExternaObject.externalHeadingCheck();

    }

    @And("^i validate each external link$")
    public void iValidateEachExternalLink() throws IOException {
        ExternaObject.externalParnerValidation();
    }
}
