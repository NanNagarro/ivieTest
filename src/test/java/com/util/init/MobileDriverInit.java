package com.util.init;

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
        capabilities.setCapability("deviceName", "RFCR310WZXT");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("automationName", "Uiautomator2");
        capabilities.setCapability("app", "C:\\Software\\apk\\app-debug.apk");
        URL serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
        PLATFORM_NAME platform_name = PLATFORM_NAME.ANDROID;

        switch (platform_name) {
            case ANDROID :
                capabilities.setCapability("platformName", "Android");
                driver = new AndroidDriver(serverUrl, capabilities);
                break;
            case IOS: capabilities.setCapability("platformName", "Ios");
                capabilities.setCapability("platformName", "Ios");
                driver = new IOSDriver(serverUrl, capabilities);
                break;
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.resetApp();
        return  driver;
    }

    @AfterClass
    public void tearDownAppium() {
        if (driver != null) {
            driver.quit();
        }
    }
}