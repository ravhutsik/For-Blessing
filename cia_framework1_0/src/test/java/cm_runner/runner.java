package cm_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import java.io.File;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true,
        features = {"src\\test\\java\\cm_features\\"},
        tags = {"@cm_login, @cm_calendar, @cm_talkToUs"},
        glue = {"cm_tests"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class runner {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("src\\test\\java\\cm_report\\extent-config.xml"));
    }

}
