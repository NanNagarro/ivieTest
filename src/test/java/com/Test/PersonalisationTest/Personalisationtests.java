package com.Test.PersonalisationTest;

import com.Test.util.initialRobot;
import com.page.util.BasePage;
import com.page.util.ForYouPageConfig;
import com.page.util.TutorialPage;
import org.testng.annotations.Test;


public class Personalisationtests extends BasePage {
    @Test
    public void consentForUser() {
        new initialRobot()
                .toHamburgerMenuIndexPage();
                //.goToHomePage();
        new ForYouPageConfig()
                .ForYouPageConfig();
    }
    @Test
    public void chooseInterestsTest() {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToHomePage();
        new ForYouPageConfig()
                .ChooseInterests();
    }

    @Test
    public void signUpForProfilDialogTest() {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToHomePage();
        new ForYouPageConfig()
                .SignUpForProfilDialog();
    }

    @Test
    public void forYouTabTest() {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToHomePage();
        new ForYouPageConfig()
                .ForYouAfterSetup();

    }

    @Test
    public void profilMyInterestsTest() {

    }

    @Test
    public void settingsMyInterestsTest() {

    }


}
