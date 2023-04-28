package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "./src/test/resources/config.properties";
        Properties pros = new Properties();
        FileInputStream ip = new FileInputStream(filePath);
        pros.load(ip);

        String deviceList = pros.getProperty("deviceList");
        System.out.println(deviceList);
    }
}