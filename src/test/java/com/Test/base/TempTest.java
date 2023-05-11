package com.Test.base;

import com.page.BasePage;
import org.testng.annotations.Test;

public class TempTest extends BasePage {

    @Test
    public void tempTest() throws InterruptedException {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToSignUpPage()
                .inputEmail("ivietest@muell.icu")
                .inputPassword("Ivie12345678")
                .login();
        Thread.sleep(1000000);


    }

}
