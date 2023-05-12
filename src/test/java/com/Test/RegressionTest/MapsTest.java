package com.Test.RegressionTest;

import com.Test.base.InitialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;

public class MapsTest extends BasePage {
    @Test
    public void testGoOnAWalk() {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToMapPage()
                .clickLocationButton();
    }

    @Test
    public void testPoint() {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToMapPage()
                .clickLocationButton()
                .swipeComponent();
    }
}
