package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class talkToUs {

    private WebDriver driver;

    //Women Forum system elements
     /*
    Name: Khangwelo Ravhutsi
    Date: 15 November 2020
    Description: TALK TO US ELEMENTS
     */
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div/div/div[1]/div[1]/a")
    private WebElement feedback;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]")
    private WebElement suggestion_check;

    //Constructor
    public talkToUs(WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void suggestion() throws IOException {
        feedback.click();
    }

    public void suggestioncheckPoint() throws IOException{
        String feedbackCheck = suggestion_check.getText();
        Assert.assertEquals("Please share your ideas, suggestions of feedback by clicking on the above link",feedbackCheck);
    }

}
