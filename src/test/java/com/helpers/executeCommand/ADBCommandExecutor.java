package com.helpers.executeCommand;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class ADBCommandExecutor {
    private static final Logger LOGGER = LogManager.getLogger(ADBCommandExecutor.class);

    public static void adbCommand(String serialNumber, String permission, Boolean grantFlag) {

        String packageName = "at.vienna.ivie.dev";

        // Construct the ADB command
        String[] adbCommand;

        if (grantFlag) {
            adbCommand = new String[]{"adb", "-s", serialNumber, "shell", "pm", "grant", packageName, permission};
        } else {
            adbCommand = new String[]{"adb", "-s", serialNumber, "shell", "pm", "revoke", packageName, permission};
        }

        try {
            // Execute the ADB command
            Process process = new ProcessBuilder(adbCommand).start();

            // Wait for the command to finish
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                LOGGER.info("Permission change successfully.");
            } else {
                LOGGER.info("Failed to change permission.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
