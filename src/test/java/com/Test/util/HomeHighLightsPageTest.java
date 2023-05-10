package com.Test.util;

import com.page.BasePage;
import org.testng.annotations.Test;

public class HomeHighLightsPageTest extends BasePage {

    @Test
    public void goToSignUpPage() throws InterruptedException {
        new initialRobot()
                .toHamburgerMenuIndexPage().goToMapPage();


    }

}
