package com.helpers.init.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit extends MobileDriverInit {

    public AndroidDriverInit() {
    }

    public static AndroidDriver androidSetupAppium(Device device) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        String serverUrl;

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName",device.getDeviceName());
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("automationName", device.getAutomationName());

        if (device.getLocal()){
            serverUrl = localUrl;
            capabilities.setCapability("app", androidBuildPath);
        }

        else{
            serverUrl = remoteUrl;
            capabilities.setCapability("user", remoteUser);
            capabilities.setCapability("key", remoteKey);
        }

        try {
            driver = new AndroidDriver(new URL(serverUrl), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return (AndroidDriver) driver;
    }

}
