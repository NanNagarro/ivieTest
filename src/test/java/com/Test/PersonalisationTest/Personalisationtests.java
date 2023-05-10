package com.Test.PersonalisationTest;

import com.Test.util.initialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;


public class Personalisationtests extends BasePage {
    @Test
    public void consentForUser() {
        new initialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ForYouPageConfig();

    }
    @Test
    public void chooseInterestsTest() {
        new initialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ChooseInterests();
    }

    @Test
    public void signUpForProfilDialogTest() {
        new initialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .SignUpForProfilDialog();
    }

    @Test
    public void forYouTabTest() {
        new initialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ForYouAfterSetup();

    }

    @Test
    public void profilMyInterestsTest() {

    }

    @Test
    public void settingsMyInterestsTest() {
        new initialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ForYouAfterSetup();
    }


}
