package cm_utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementFactory {

    private Object WebElement;

    public WebElement getElement(By element){
        return (org.openqa.selenium.WebElement) WebElement;
    }
}
