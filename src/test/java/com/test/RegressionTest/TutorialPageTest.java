package com.test.RegressionTest;

import com.page.BasePage;
import com.test.base.InitialRobot;
import org.testng.annotations.Test;

import static com.helpers.testData.UserGenerator.getUser;

public class TutorialPageTest extends BasePage {
    @Test
    public void ivie_test_Functionality_1_0_OnboardingScreen_IVIE2_572_132_2668() {
        new InitialRobot().toHomePage();
    }

    @Test
    public void ivie_test_Profile_and_Login_LoginWithGoogleAccount_IVIE2_542_132_2668() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSignUpPage()
                .googleLogin()
                .selectGoogleAccount()
                .clickEditDetailsButton();
    }

    @Test
    public void ivie_test_Profile_and_Login_LoginWithEmailandPassword_IVIE2_506_132_2668() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSignUpPage()
                .inputEmail(getUser("user3").getUserName())
                .inputPassword(getUser("user3").getPassword())
                .login()
                .clickEditDetailsButton();
    }

    @Test
    public void ivie_test_Profile_and_Login_LogOut_IVIE2_576_132_2668() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSignUpPage()
                .inputEmail(getUser("user3").getUserName())
                .inputPassword(getUser("user3").getPassword())
                .login()
                .clickLogoutButton().clickMenuButton();
    }

    @Test
    public void ivie_test_Profile_and_Login_LogOutFromEditProfileScreen_IVIE2_575_132_2668() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSignUpPage()
                .inputEmail(getUser("user3").getUserName())
                .inputPassword(getUser("user3").getPassword())
                .login()
                .clickLogoutButton()
                .clickMenuButton();
    }

    @Test
    public void ivie_test_Profile_and_Login_WelcomeProfileScreen_IVIE2_573_132_2668() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSignUpPage()
                .inputEmail(getUser("user3").getUserName())
                .inputPassword(getUser("user3").getPassword())
                .login()
                .clickEditDetailsButton();
    }

    @Test
    public void ivie_test_Profile_and_Login_ProfileEditScreen_IVIE2_570_132_2668() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSignUpPage()
                .inputEmail(getUser("user3").getUserName())
                .inputPassword(getUser("user3").getPassword())
                .login()
                .clickEditDetailsButton()
                .clickSaveButton();
    }

    @Test
    public void ivie_test_Profile_and_Login_ProfileMenuIntegrationNotLoggedIn_IVIE2_567_132_2668() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSignUpPage()
                .inputEmail(getUser("user3").getUserName());
    }

    // TODO: 24.05.2023 When clicking settings, sometimes Tourist-Info show up.
    @Test
    public void ivie_test_Functionality_1_0_Language_IVIE2_960_140_2671() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick()
                .goToSettingsPage()
                .clickLanguageButton()
                .clickGermanButton()
                .clickMenuButton();
    }

    @Test
    public void aVoid() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick();
    }

    @Test
    public void ivie_test_RELOAD_APP_IVIE2_960_140_2671_PREREQUISITE_FOR_PERSONALISATION() {
        new InitialRobot()
                .toHomePage()
                .menuButtonClick();
        driver.quit();
        initDriver();
        new InitialRobot()
                .toHomePage()
                .menuButtonClick();
    }

    @Test
    public void ivie_test_Functionality_1_0_WeatherIconDetailPage_IVIE2_577_132_2668() {
        new InitialRobot()
                .toHomePage()
                .clickWeatherIcon()
                .swipeWeatherCards()
                .closeWeatherCards()
                .clickWeatherIcon()
                .clickMenuButton();

    }

    @Test
    public void ivie_test_Walks_OverviewPage_IVIE2_594__132_2668() {
        new InitialRobot().toHamburgerMenuIndexPage().goToWalksAndGuidePage().goToCuriousMuseumsGuide().clickBackButton().goToRedViennaGuide().clickBackButton();
    }

    @Test
    public void ivie_test_Walks_WalkMenuItem_NewSortingOption_IVIE2_933_140_2671() {
        //"Beethoven Walk","Ringstrasse Walk",
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .checkLocationNameIsDisplayed()
                .clickSortedBy()
                .clickSortedByAlphabetical()
                .checkLocationNameIsDisplayedByAlphabetical();
    }





}
