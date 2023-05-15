package com.helpers.init.driver;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Device {

    String platformName;
    String platformVersion;
    String deviceName;
    String udid;
    String automationName;
    String comment;
    Boolean local;

}
