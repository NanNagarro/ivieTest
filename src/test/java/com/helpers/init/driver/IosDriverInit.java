package com.helpers.init.driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IosDriverInit extends MobileDriverInit{
    public IosDriverInit() {
    }

    public static IOSDriver IosSetupAppium(Device device) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL serverUrl;

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", device.getDeviceName());
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("udid", device.getUdid());
        capabilities.setCapability("automationName", device.getAutomationName());

        if (device.getLocal()){
            serverUrl = new URL(localUrl);
            capabilities.setCapability("app", iosBuildPath);
        }
        else{
            serverUrl = new URL(localUrl);
            capabilities.setCapability("browserstack.user", remoteUser);
            capabilities.setCapability("browserstack.key", remoteKey);
        }


        driver = new IOSDriver(serverUrl, capabilities);
        return (IOSDriver) driver;
    }
}
