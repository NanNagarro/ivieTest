package com.util.init.Driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit extends MobileDriverInit {

    public AndroidDriverInit() {
    }

    public static AndroidDriver AndroidsetupAppium(Device device) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL serverUrl;

        if (device.getLocal()){
            serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
            capabilities.setCapability("app", "C:/Software/apk/app-debug.apk");
        }
        else{
            serverUrl = new URL("http://hub.browserstack.com/wd/hub");
            capabilities.setCapability("browserstack.user", "nanli_kwsMtj");
            capabilities.setCapability("browserstack.key", "Z5PhssPR6JViB2yWaTzd");
            capabilities.setCapability("app_url", "bs://1296596b6e45a1876f7d712502a82b72c212a5a5");
        }

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName",device.getDeviceName() ); //RFCR310WZXT
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("automationName", device.getAutomationName());
        driver = new AndroidDriver(serverUrl, capabilities);
        return (AndroidDriver) driver;
    }

}
