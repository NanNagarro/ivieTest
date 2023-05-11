package com.helpers.init.driver;

public class Device {
    String platformName;

    public String getPlatformName() {
        return platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getUdid() {
        return udid;
    }

    public String getAutomationName() {
        return automationName;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getLocal() {
        return local;
    }

    String platformVersion;
    String deviceName;
    String udid;
    String automationName;
    String comment;
    Boolean local;

    public Device(String platformName, String platformVersion, String deviceName, String udid, String automationName, String comment, Boolean local) {
        this.platformName = platformName;
        this.platformVersion = platformVersion;
        this.deviceName = deviceName;
        this.udid = udid;
        this.automationName = automationName;
        this.comment = comment;
        this.local = local;
    }

}
