package com.Test;

import com.page.util.BasePage;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @Test
    public void goToSignUpPage() throws InterruptedException {
        new initialRobot()
                .toHamburgerMenuIndexPage().goToMapPage();


    }

}
