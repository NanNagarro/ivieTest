package com.util.init;

public class Device {

    PLATFORM_NAME platform_name;
    String deviceName;
    String version;

    public Device(PLATFORM_NAME platform_name, String deviceName, String version) {
        this.platform_name = platform_name;
        this.deviceName = deviceName;
        this.version = version;
    }


    public void setPlatform_name(PLATFORM_NAME platform_name) {
        this.platform_name = platform_name;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
