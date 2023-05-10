package com.Test.PersonalisationTest;

import com.Test.util.initialRobot;
import com.page.util.BasePage;
import com.page.home.HomeForYouPage;
import org.testng.annotations.Test;


public class Personalisationtests extends BasePage {
    @Test
    public void consentForUser() {
        new initialRobot().toHomePage();

        new HomeForYouPage()
                .ForYouPageConfig();
    }
    @Test
    public void chooseInterestsTest() {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToHomePage();
        new HomeForYouPage()
                .ChooseInterests();
    }

    @Test
    public void signUpForProfilDialogTest() {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToHomePage();
        new HomeForYouPage()
                .SignUpForProfilDialog();
    }

    @Test
    public void forYouTabTest() {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToHomePage();
        new HomeForYouPage()
                .ForYouAfterSetup();

    }

    @Test
    public void profilMyInterestsTest() {

    }

    @Test
    public void settingsMyInterestsTest() {

    }


}
