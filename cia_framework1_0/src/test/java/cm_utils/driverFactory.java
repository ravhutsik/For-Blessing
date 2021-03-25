package cm_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class driverFactory {
    private static WebDriver driver = null;

    public driverFactory(){

    }

    public static WebDriver getDriver() {

        String url = "http://biscorpmemqa:86/WF/Home";
        System.setProperty("webdriver.chrome.driver", "common_drivers" + File.separator + "chromedriver.exe");

        if (driver == null) {
            driver = new ChromeDriver();
        }

        driver.get(url); // open the metadata hub system URL
        driver.manage().window().maximize(); //maximise the browser
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //waiting for the page to load

        return driver;
    }

}
