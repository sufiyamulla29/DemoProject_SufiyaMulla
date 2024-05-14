package base;

import DriverManager.AppiumDriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

   protected AndroidDriver<MobileElement> driver;
   public static WebDriverWait waitVar = null;

   public void createDriver() throws MalformedURLException {
        try {

            //defined desired capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "14");
            caps.setCapability("deviceName", "Pixel Fold API 34");
            //    caps.setCapability("AUTO_GRANT_PERMISSIONS", true);
            caps.setCapability("appPackage", "com.swaglabsmobileapp");
            caps.setCapability("app", "C:\\Users\\NAMO\\IdeaProjects\\NomoInterview\\src\\test\\resources\\App\\demo.apk");
            caps.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");

            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
            AppiumDriverManager.getInstance().setDriver(driver);

            waitVar = new WebDriverWait(driver, 90);
        }catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

   }

   public void quitDriver(){
       driver.quit();
   }
}
