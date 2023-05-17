package com.helpers.init.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit extends MobileDriverInit {

    public AndroidDriverInit() {
    }

    public static AndroidDriver androidSetupAppium(Device device) {

        UiAutomator2Options capabilities = new UiAutomator2Options ();
        String serverUrl;

        capabilities
                .setDeviceName(device.getDeviceName())
                .setPlatformVersion(device.getPlatformVersion());

        if (device.getLocal()){
            serverUrl = localUrl;
            capabilities.setApp(androidBuildPath);
        }

        else{
            serverUrl = remoteUrl;
            capabilities.setCapability("browserstack.user", remoteUser);
            capabilities.setCapability("browserstack.key", remoteKey);
            capabilities.setCapability("app_url", "bs://52cd3f404a59054a0d2079d0f7cedfb91cdcb6b2");
        }

        try {
            driver = new AndroidDriver(new URL(serverUrl), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return (AndroidDriver) driver;
    }

}
