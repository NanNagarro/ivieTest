package com.Test.PersonalisationTest;

import com.Test.base.InitialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;


public class Personalisationtests extends BasePage {

    @Test
    public void consentForUser() {
        new InitialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ForYouPageConfig();

    }
    @Test
    public void chooseInterestsTest() {
        new InitialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ChooseInterests();
    }

    @Test
    public void signUpForProfilDialogTest() {
        new InitialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .SignUpForProfilDialog();
    }

    @Test
    public void forYouTabTest() {
        new InitialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ForYouAfterSetup();

    }

    @Test
    public void profilMyInterestsTest() {

    }

    @Test
    public void settingsMyInterestsTest() {
        new InitialRobot()
                .toHomePage()
                .ForYouButtonClick()
                .ForYouAfterSetup();
    }


}
