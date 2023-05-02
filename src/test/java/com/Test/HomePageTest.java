package com.Test;

import com.page.util.BasePage;
import com.tests.LoginRobot;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @Test
    public void testLogin() throws InterruptedException {
        LoginRobot robot = new LoginRobot();
        robot.toHomePage();


    }
}
