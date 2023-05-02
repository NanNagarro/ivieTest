package com.Test;

import com.page.util.BasePage;
import com.tests.LoginRobot;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @Test
    public void goToSignUpPage() throws InterruptedException {
        new LoginRobot()
                .toHamburgerMenuIndexPage().goToMapPage();


    }

}
