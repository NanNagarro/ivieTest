package com.test.RegressionTest;

import com.page.hamburgerPage.map.MapPage;
import com.test.base.InitialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;

import static com.helpers.testData.UserGenerator.getUser;

public class MapsTest extends BasePage {

    public MapPage initPage(){
        return new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToMapPage();
    }
    @Test
    public void testCompassButtonIsShowUp() {
        initPage()
                .clickLocationButton();
    }

    @Test
    public void testMapFavoriteLogin()  {
        initPage()
                .clickLocationButton()
                .swipeLeftUntilTouristInfoDisplayed()
                .clickTouristInfo()
                .clickTouristInfoVienna()
                .favoriteButtonClick()
                .createProfileOrLoginButtonClick()
                .inputEmail(getUser("user3").getUserName())
                .inputPassword(getUser("user3").getPassword())
                .login()
                .clickBackButton()
                .clickOkWindowPopUp()
                .clickMenuButton()
                .goToHomePage()
                .menuButtonClick()
                .goToMapPage()
                .swipeLeftUntilTouristInfoDisplayed()
                .swipeUphowLocationDetails()
                .clickTouristInfoVienna()
                .swipeUpFromBottom()
                .clickOpeningHours()
                .clickOpeningHours()
                .clickAccessibility()
                .clickAccessibility();

    }

    @Test
    public void testMapPreviewIcon()  {
        initPage()
                .clickLocationButton()
                .swipeLeftUntilTouristInfoDisplayed()
                .clickTouristInfo()
                .clickTouristInfoVienna()
                .mapPreviewOpens();
    }
}
