package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class externalPartners {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]")
    private WebElement usefulLinkHeading;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divBody\"]/div[1]/a[1]/div[2]")
    private WebElement inspiringWomen;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divBody\"]/div[1]/a[2]/div[2]")
    private WebElement businessEngage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divBody\"]/div[1]/a[3]/div[2]")
    private WebElement businessWomen;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divBody\"]/div[2]/a[1]/div[2]")
    private WebElement nedbankMall;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divBody\"]/div[2]/a[2]/div[2]")
    private WebElement internationalWomenForum;

    //Constructor
    public externalPartners (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void externalParnerValidation() throws IOException {
        String inspiringWomenCheck = inspiringWomen.getText();
        String businessEngageCheck = businessEngage.getText();
        String businessWomenCheck = businessWomen.getText();
        String nedbankMallCheck = nedbankMall.getText();
        String internationalWomenForumCheck = internationalWomenForum.getText();

        Assert.assertEquals("Inspiring Women",inspiringWomenCheck);
        Assert.assertEquals("Business Engage",businessEngageCheck);
        Assert.assertEquals("Business Women's Association",businessWomenCheck);
        Assert.assertEquals("Nedbank Mall",nedbankMallCheck);
        Assert.assertEquals("International Women's Forum",internationalWomenForumCheck);

    }

    public void externalHeadingCheck() throws IOException {
        String headingValidation = usefulLinkHeading.getText();
        Assert.assertEquals("Useful links",headingValidation);
    }

}
