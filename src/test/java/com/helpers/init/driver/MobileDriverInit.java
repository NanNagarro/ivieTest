package com.helpers.init.driver;

import com.helpers.init.config.Configuration;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.helpers.init.driver.AndroidDriverInit.androidSetupAppium;
import static com.helpers.init.driver.DeviceList.deviceGenerator;
import static com.helpers.init.driver.IosDriverInit.IosSetupAppium;

public class MobileDriverInit {
    public static AppiumDriver driver;
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

    @BeforeClass
    public static void setupAppium() throws IOException {

            Device device = getFilteredDevice().get(0);

            String platFormName = device.getPlatformName();

            switch (platFormName) {
                case "ANDROID":
                    driver = androidSetupAppium(device);
                    break;
                case "IOS":
                    driver = IosSetupAppium(device);
                    break;
            }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDownAppium() {
        if (driver != null) {
            driver.quit();
        }
    }
}
