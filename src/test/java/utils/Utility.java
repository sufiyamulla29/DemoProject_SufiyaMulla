package utils;

import base.BaseTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends BaseTest {

    public void click(MobileElement element){
        waitVar.until(ExpectedConditions.elementToBeClickable(element)).click() ;
    }

    public void type(MobileElement element,String text){
        String test = element.getAttribute("text");
        System.out.println(test);
        waitVar.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public void exist(MobileElement element, String title){
        waitVar.until(ExpectedConditions.visibilityOf(element));
        assertTrue(element.isDisplayed());
    }


}
