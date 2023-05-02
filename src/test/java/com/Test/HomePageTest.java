package com.Test;

import com.page.util.BasePage;
import com.tests.LoginRobot;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {
    LoginRobot loginRobot = new LoginRobot();

    @Test
    public void goToSignUpPage(){
        loginRobot.toHamburgerMenuIndexPage().goToSignUpPage();
    }

}
