package com.helpers.init.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit extends MobileDriverInit {

    public AndroidDriverInit() {
    }

    public static AndroidDriver androidSetupAppium(Device device) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL serverUrl;

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName",device.getDeviceName());
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("automationName", device.getAutomationName());

        if (device.getLocal()){
            serverUrl = new URL(localUrl);
            capabilities.setCapability("app", androidBuildPath);
        }

        else{
            serverUrl = new URL(remoteUrl);
            capabilities.setCapability("user", remoteUser);
            capabilities.setCapability("key", remoteKey);
        }

        driver = new AndroidDriver(serverUrl, capabilities);
        return (AndroidDriver) driver;
    }

}
