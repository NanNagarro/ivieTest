package com.helpers.init.driver;

import java.util.List;

public class DeviceList extends MobileDriverInit{

    public static Device deviceGenerator(String inputString){
        String deviceDetail = String.valueOf(configuration.getPropertyValues("devices.properties",inputString));
        String[] tokens=deviceDetail.split(";");
        return new Device(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],Boolean.parseBoolean(tokens[6]));
    }

    public static List<Device> getAllDevices() {
        String device1 = String.valueOf(configuration.getPropertyValues("devices.properties","device1"));
        String device2 = String.valueOf(configuration.getPropertyValues("devices.properties","device2"));
        String device3 = String.valueOf(configuration.getPropertyValues("devices.properties","device3"));
        String device4 = String.valueOf(configuration.getPropertyValues("devices.properties","device4"));

        return List.of(
                deviceGenerator(device1),
                deviceGenerator(device2),
                deviceGenerator(device3),
                deviceGenerator(device4)
        );
    }
}
