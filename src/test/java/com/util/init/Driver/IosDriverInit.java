package com.util.init.Driver;

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

        if (device.getLocal()){
            serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
            capabilities.setCapability("app", "/Users/christophubleis/Library/Developer/Xcode/DerivedData/ivie-bzinybpwuwunkgclitqehaobrfzf/Build/Products/Debug-iphonesimulator/ivie.app");
        }
        else{
            serverUrl = new URL("http://hub.browserstack.com/wd/hub");
            capabilities.setCapability("browserstack.user", "nanli_kwsMtj");
            capabilities.setCapability("browserstack.key", "Z5PhssPR6JViB2yWaTzd");
        }

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", device.getDeviceName());
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("udid", device.getUdid());
        capabilities.setCapability("automationName", device.getAutomationName());
        driver = new IOSDriver(serverUrl, capabilities);
        return (IOSDriver) driver;
    }
}
