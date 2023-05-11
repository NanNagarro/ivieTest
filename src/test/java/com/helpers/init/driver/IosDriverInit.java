package com.helpers.init.driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IosDriverInit extends MobileDriverInit{
    public IosDriverInit() {
    }

    public static IOSDriver IosSetupAppium(Device device)  {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        String serverUrl;

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", device.getDeviceName());
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("udid", device.getUdid());
        capabilities.setCapability("automationName", device.getAutomationName());

        if (device.getLocal()){
            serverUrl = localUrl;
            capabilities.setCapability("app", iosBuildPath);
        }
        else{
            serverUrl = remoteUrl;
            capabilities.setCapability("browserstack.user", remoteUser);
            capabilities.setCapability("browserstack.key", remoteKey);
        }

        try {
            driver = new IOSDriver(new URL(serverUrl), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return (IOSDriver) driver;
    }
}
