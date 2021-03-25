package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class media {
    private WebDriver driver;

    //Women Forum system elements
     /*
    Name: Khangwelo Ravhutsi
    Date: 15 November 2020
    Description: CALENDAR ELEMENTS
     */
    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[6]/ul/li[1]/a")
    private WebElement mediaImage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[6]/ul/li[2]/a")
    private WebElement mediaVideo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"jsddm\"]/li[6]/ul/li[3]/a")
    private WebElement mediaAudio;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]")
    private WebElement Gallery;

    @FindBy(how = How.XPATH, using = "//*[@id=\"Function\"]/a[1]/img")
    private WebElement imageone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mainBody\"]/h3")
    private WebElement functionimage;

    //Constructor
    public media (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void image() throws IOException {
        mediaImage.click();
    }

    public void galleryValidation() throws IOException {
        mediaImage.click();
    }



}
