package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class calendar {

    private WebDriver driver;

    //Women Forum system elements
     /*
    Name: Khangwelo Ravhutsi
    Date: 15 November 2020
    Description: CALENDAR ELEMENTS
     */

    @FindBy(how = How.XPATH, using = "//*[@id=\"calendarEvents\"]/div/div/h3")
    private WebElement CalendarBookedCheck;

    @FindBy(how = How.XPATH, using = "//*[@id=\"t01\"]/tbody/tr/th[1]")
    private WebElement EventNameCheck;

    @FindBy(how = How.XPATH, using = "//*[@id=\"t01\"]/tbody/tr/th[2]")
    private WebElement EventDescriptionCheck;

    @FindBy(how = How.XPATH, using = "//*[@id=\"t01\"]/tbody/tr/th[3]")
    private WebElement StartDateCheck;

    @FindBy(how = How.XPATH, using = "//*[@id=\"t01\"]/tbody/tr/th[4]")
    private WebElement EndDateCheck;

    //Constructor
    public calendar (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void calendarValidation() throws IOException {
        String calendarCheck = CalendarBookedCheck.getText();
        String eventNameCheck = EventNameCheck.getText();
        Assert.assertEquals("Events Calendar Booked",calendarCheck);
    }

    public void eventValidation() throws IOException {

        String eventNameCheck = EventNameCheck.getText();
        String eventDescription = EventDescriptionCheck.getText();
        String startDate = StartDateCheck.getText();
        String endDate = EndDateCheck.getText();

        Assert.assertEquals("Event Name",eventNameCheck);
        Assert.assertEquals("Event Description",eventDescription);
        Assert.assertEquals("Start Date",startDate);
        Assert.assertEquals("End Date",endDate);

    }
}
