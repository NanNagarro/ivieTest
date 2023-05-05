package com.util.init.Driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.util.init.Driver.AndroidDriverInit.AndroidsetupAppium;
import static com.util.init.Driver.DeviceList.getFilteredDevices;
import static com.util.init.Driver.IosDriverInit.IosSetupAppium;

public class MobileDriverInit {
    public static AppiumDriver driver;
    public static List<AppiumDriver> driverList;
    @BeforeClass
    public static void setupAppium() throws IOException {
        driverList = new ArrayList<>();
        for (Device device : getFilteredDevices()) {
            switch (device.getPlatformName()) {
                case ANDROID :
                    driver = AndroidsetupAppium(device);
                    break;
                case IOS:
                    driver = IosSetupAppium(device);
                    break;
            }
            driverList.add(driver);
            System.out.println("Add driver :"+ device.getDeviceName());
        }
        System.out.println("driver size :"+ driverList.size());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDownAppium() {
        if (driver != null) {
            driver.quit();
        }
    }
}
