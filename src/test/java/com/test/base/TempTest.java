package com.test.base;

import com.page.BasePage;
import org.testng.annotations.Test;

import static com.helpers.testData.UserGenerator.getUser;

public class TempTest extends BasePage {

    @Test
    public void tempTest() {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToSignUpPage()
                .inputEmail(getUser("user2").getUserName())
                .inputPassword(getUser("user2").getUserName())
                .login();
    }

}
