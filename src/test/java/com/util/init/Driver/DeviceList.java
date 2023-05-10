package com.util.init.Driver;

import com.util.init.PLATFORM_NAME;
import com.util.init.config.Configuration;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeviceList {

    static Configuration configuration = new Configuration();
    static PLATFORM_NAME platform_name = PLATFORM_NAME.valueOf(configuration.getPropertyValues("platformName"));
    static Boolean localFlag = Boolean.valueOf(configuration.getPropertyValues("local"));

    public static List<Device> getAllDevices() {
        return List.of(
                new Device("0", PLATFORM_NAME.ANDROID, "13.0", "RFCR310WZXT", "", "Uiautomator2", "Samsung S20FE", true),
                new Device("1", PLATFORM_NAME.IOS, "16.4", "IPhone 14 Pro", "4F54CFA9-0B01-44A2-A44F-033D438C083C", "XCUITest", "", true),
                new Device("2", PLATFORM_NAME.ANDROID, "13.0", "Samsung Galaxy S23 Ultra", "", "Uiautomator2", "", false),
                new Device("3", PLATFORM_NAME.ANDROID, "10.0", "9FK0219418005732", "", "Uiautomator2", "HuaweiP30", true),
                new Device("4", PLATFORM_NAME.ANDROID, "13.0", "emulator-5554", "", "Uiautomator2", "NanAndroidEmulator", true),
                new Device("5", PLATFORM_NAME.ANDROID, "9.0", "Google Pixel 3", "", "Uiautomator2", "", false),
                new Device("6", PLATFORM_NAME.ANDROID, "11.0", "OnePlus 9", "", "Uiautomator2", "", false),
                new Device("7", PLATFORM_NAME.ANDROID, "13.0", "Pixel_6_API_33", "", "Uiautomator2", "", true));
    }

    public static List<Device> getFilteredDevices() {
        Stream<Device> stream = getAllDevices().stream();
        return stream
                .filter(x -> x.getPlatformName() == platform_name)
                .filter(x -> x.getLocal() == localFlag)
                .filter(x -> Objects.equals(x.getDeviceName(), "RFCR310WZXT"))
                .collect(Collectors.toList());
    }

}
