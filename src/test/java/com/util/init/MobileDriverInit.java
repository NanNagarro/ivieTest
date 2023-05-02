package com.util.init;

import com.util.init.config.Configuration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileDriverInit {
    public static AppiumDriver driver;
    @BeforeClass
    public static MobileDriver setupAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL serverUrl = new URL("http://127.0.0.1:4723/wd/hub");

        Configuration configuration = new Configuration();
        PLATFORM_NAME platform_name = PLATFORM_NAME.valueOf(configuration.getPropertyValues("deviceList"));


        switch (platform_name) {
            case ANDROID :
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "Pixel_6_API_33"); //RFCR310WZXT
                capabilities.setCapability("platformVersion", "13.0");
                capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability("app", "/Users/christophubleis/Desktop/WTV/AndroidAutomation/iVieAndroid/Application/app-debug.apk"); //C:/Software/apk/app-debug.apk
                driver = new AndroidDriver(serverUrl, capabilities);
                break;

            case IOS:
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("deviceName", "IPhone 14 Pro");
                capabilities.setCapability("platformVersion", "16.4");
                capabilities.setCapability("udid", "4F54CFA9-0B01-44A2-A44F-033D438C083C");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("app", "/Users/christophubleis/Library/Developer/Xcode/DerivedData/ivie-bzinybpwuwunkgclitqehaobrfzf/Build/Products/Debug-iphonesimulator/ivie.app");
                driver = new IOSDriver(serverUrl, capabilities);
                break;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return  driver;
    }

    @AfterClass
    public void tearDownAppium() {
        if (driver != null) {
            driver.quit();
        }
    }
}
