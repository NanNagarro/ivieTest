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
    static String androidBuildPath = getValueByKey("androidBuildPath");
    static String iosBuildPath = getValueByKey("iosBuildPath");
    static String localUrl = getValueByKey("localUrl");
    static String remoteUrl = getValueByKey("remoteUrl");
    static String remoteUser = getValueByKey("remoteUser");
    static String remoteKey = getValueByKey("remoteKey");
    static String deviceListString = getValueByKey("deviceList");

    private static String getValueByKey(String key){
        return String.valueOf(configuration.getPropertyValues("config.properties",key));
    }

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
    public static void initDriver() {
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
