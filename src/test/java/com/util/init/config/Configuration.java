package com.util.init.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    static String propFileName = "config.properties";
    static Properties prop = new Properties();

    public String getPropertyValues(String key)  {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty(key);
    }





}
