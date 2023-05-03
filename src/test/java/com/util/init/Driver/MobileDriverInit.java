package com.util.init.Driver;

import com.util.init.PLATFORM_NAME;
import com.util.init.config.Configuration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.util.init.Driver.AndroidDriverInit.AndroidsetupAppium;
import static com.util.init.Driver.IosDriverInit.IosSetupAppium;

public class MobileDriverInit {
    public static AppiumDriver driver;
    @BeforeClass
    public static MobileDriver setupAppium() throws IOException {

        Configuration configuration = new Configuration();
        PLATFORM_NAME platform_name = PLATFORM_NAME.valueOf(configuration.getPropertyValues("platformName"));
        Boolean localFlag = Boolean.valueOf(configuration.getPropertyValues("local"));


        List<Device> testDeviceList = List.of(
                new Device("0",PLATFORM_NAME.ANDROID,"13.0","RFCR310WZXT","","Uiautomator2","Samsung S20FE",true),
                new Device("1",PLATFORM_NAME.IOS,"16.4","IPhone 14 Pro","4F54CFA9-0B01-44A2-A44F-033D438C083C","XCUITest","",true),
                new Device("2",PLATFORM_NAME.ANDROID,"13.0","Samsung Galaxy S23 Ultra","","Uiautomator2","",false)

                );

        Stream<Device> stream = testDeviceList.stream();

        List<Device> testDeviceListFiltered = stream
                .filter(x -> x.getPlatformName() == platform_name)
                .filter(x -> x.getLocal() == localFlag)
                .collect(Collectors.toList());


        for (Device device : testDeviceListFiltered) {
            switch (device.getPlatformName()) {
                case ANDROID :
                    driver = AndroidsetupAppium(device);
                    break;
                case IOS:
                    driver = IosSetupAppium(device);
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return  driver;
    }

    @AfterClass
    public void tearDownAppium() {
        if (driver != null) {
            driver.quit();
        }
    }
}
