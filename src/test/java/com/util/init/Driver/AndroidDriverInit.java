package com.util.init.Driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.FULL_RESET;

public class AndroidDriverInit extends MobileDriverInit {

    public AndroidDriverInit() {
    }

    public static AndroidDriver AndroidsetupAppium(Device device) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL serverUrl;

        capabilities.setCapability(FULL_RESET, true);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName",device.getDeviceName() ); //RFCR310WZXT
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("automationName", device.getAutomationName());

        if (device.getLocal()){
            serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
            capabilities.setCapability("app", "C:\\Users\\nanli\\Downloads\\app-debug.apk");
        }
        else{
            serverUrl = new URL("http://hub.browserstack.com/wd/hub");
            capabilities.setCapability("browserstack.user", "prinzchtv_Zsw9UN");
            capabilities.setCapability("browserstack.key", "5JWJFBuh2UTNnPyEP2DY");
            capabilities.setCapability("app_url", "bs://52cd3f404a59054a0d2079d0f7cedfb91cdcb6b2");
        }



        driver = new AndroidDriver(serverUrl, capabilities);
        return (AndroidDriver) driver;
    }

}
