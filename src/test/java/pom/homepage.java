package pom;

import cm_utils.driverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class homepage {

    private WebDriver driver;

    //Corporate Memory home page elements
    @FindBy(how = How.XPATH, using = "//*[@id=\"BreadCrumbDiv\"]/div")
    private WebElement Categories;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[1]/a")
    private WebElement AboutTheForum;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[2]/a")
    private WebElement AddArtefact;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[3]/a")
    private WebElement Adminstration;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[4]/a")
    private WebElement Approve;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[5]/a")
    private WebElement ExternalParter;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[6]/a")
    private WebElement Media;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[7]/a")
    private WebElement Calender;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[7]/a")

    private WebElement TalkToUs;

    @FindBy(how = How.XPATH, using = "//*[@id=\"CategoriesDiv\"]/a[1]/div/div[1]")
    private WebElement iAmWomenTile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"CategoriesDiv\"]/a[2]/div/div[1]")
    private WebElement profesinalDevelopmentTile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"CategoriesDiv\"]/a[3]/div/div[1]")
    private WebElement liftAsYouClimbTile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"CategoriesDiv\"]/a[4]/div/div[1]")
    private WebElement advocacyTile;




    //Constructor
    public homepage (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void VerifyHomePage() throws IOException {
        String CategotyText = Categories.getText();
        Assert.assertEquals("Categories",CategotyText);
    }

    /*
    action required
     */
    public void talkToUs() throws IOException {
        TalkToUs.click();
    }

    public void calendar() throws IOException {
        Calender.click();
    }

    public void media() throws IOException {
        Media.click();
    }

    public void ExternalPartners() throws IOException {
        ExternalParter.click();
    }






    //system actions based on the elements

}
