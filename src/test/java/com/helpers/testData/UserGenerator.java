package com.helpers.testData;

import static com.helpers.init.driver.MobileDriverInit.configuration;

public class UserGenerator {

    public static User getUserInfo(String userKey){
        String userString = String.valueOf(configuration.getPropertyValues("users.properties",userKey));
        String[] userStringArray = userString.split(",");
        String username = userStringArray[0];
        String password = userStringArray[1];
        User testUser = new User(username,password);
        testUser.setUserName(username);
        testUser.setPassword(password);
        return testUser;
    }


}
