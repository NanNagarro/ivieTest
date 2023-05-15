package com.helpers.testData;

import static com.helpers.init.driver.MobileDriverInit.configuration;

public class UserGenerator {

    public static User getUser(String userKey){
        String userString = String.valueOf(configuration.getPropertyValues("users.properties",userKey));
        String[] userStringArray = userString.split(",");
        return User.builder()
                .userName(userStringArray[0])
                .password(userStringArray[1])
                .build();
    }

}
