package com.helpers.executeCommand;

import java.io.IOException;

public class ADBCommandExecutor {

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
                System.out.println("Permission change successfully.");
            } else {
                System.err.println("Failed to change permission.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
