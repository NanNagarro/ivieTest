package com.helpers.init.driver;

import com.helpers.init.config.Configuration;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

import static com.helpers.init.driver.AndroidDriverInit.androidSetupAppium;
import static com.helpers.init.driver.DeviceList.deviceGenerator;
import static com.helpers.init.driver.IosDriverInit.IosSetupAppium;

public class MobileDriverInit {
    public static AppiumDriver driver;

    public static List<Device> deviceList;

    static Configuration configuration = new Configuration();
    static String androidBuildPath = String.valueOf(configuration.getPropertyValues("config.properties","androidBuildPath"));
    static String iosBuildPath = String.valueOf(configuration.getPropertyValues("config.properties","iosBuildPath"));
    static String localUrl = String.valueOf(configuration.getPropertyValues("config.properties","localUrl"));
    static String remoteUrl = String.valueOf(configuration.getPropertyValues("config.properties","remoteUrl"));
    static String remoteUser = String.valueOf(configuration.getPropertyValues("config.properties","remoteUser"));
    static String remoteKey = String.valueOf(configuration.getPropertyValues("config.properties","remoteKey"));
    static String deviceListString = String.valueOf(configuration.getPropertyValues("config.properties","deviceList"));

    public static List<Device> getFilteredDevice() {
        String[] deviceListNames = deviceListString.split(";");
        List<Device> deviceList = new ArrayList<>();
        for (String name : deviceListNames) {
            deviceList.add(deviceGenerator(name));
        }
        return  deviceList;
    }

    // Need multiple appium server for multiple device?
    @BeforeMethod
    public static void init() {
        deviceList = getFilteredDevice();
        setupAppium(getFilteredDevice().get(0));
    }

    public static void setupAppium(Device device) {
        String platFormName = device.getPlatformName();
        switch (platFormName) {
            case "ANDROID":
                driver = androidSetupAppium(device);
                break;
            case "IOS":
                driver = IosSetupAppium(device);
                break;
        }
    }

    @AfterMethod
    public void tearDownAppium() {
        if (driver != null) {
            driver.quit();
        }
    }
}
