package cm_tests;

import cm_utils.driverFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.base.Verify;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.homepage;

import java.io.IOException;


public class cm_login {

    private homepage HPObject = new homepage(driverFactory.getDriver());


    @Given("^i have launched the browser$")
    public void iHaveLaunchedTheBrowser() {

        driverFactory.getDriver();
    }

    @When("^i validated the home page$")
    public void iValidatedTheHomePage() throws IOException {
        HPObject.VerifyHomePage();
    }
}
