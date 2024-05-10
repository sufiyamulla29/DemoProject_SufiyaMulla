package DriverManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverManager {

    private static ThreadLocal<AndroidDriver<MobileElement>> td = new ThreadLocal<>();
    private static AppiumDriverManager driverManager = null;


    public static AppiumDriverManager getInstance(){
        if(driverManager == null){
            return new AppiumDriverManager();
        }
        return driverManager;
    }

    public void setDriver(AndroidDriver<MobileElement> driver){
        td.set(driver);
    }

    public AndroidDriver<MobileElement> getDriver(){
        return td.get();
    }

}
