package com.Test.RegressionTest;

import com.Test.util.initialRobot;
import com.page.util.BasePage;
import org.testng.annotations.Test;

public class MapsTest extends BasePage {
    @Test
    public void testGoOnAWalk() {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToMapPage()
                .clickLocationButton();

    }
}
