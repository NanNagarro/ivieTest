package com.test.RegressionTest;

import com.page.map.MapPage;
import com.test.base.InitialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;

import static com.helpers.testData.UserGenerator.getUserInfo;

public class MapsTest extends BasePage {

    public MapPage initPage(){
        return new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToMapPage();
    }
    @Test
    public void testGoOnAWalk() {
        initPage()
                .clickLocationButton();
    }

    @Test
    public void testMapFavoriteLogin() throws InterruptedException {
        initPage()
                .clickLocationButton()
                .swipeComponent()
                .clickTouristInfo()
                .clickTouristInfoVienna()
                //.swipeUpShowLocationDetails()
                .favoriteButtonClick()
                .createProfileOrLoginButtonClick()
                .inputEmail(getUserInfo("user1").getUserName())
                .inputPassword(getUserInfo("user1").getPassword())
                .login();
        Thread.sleep(10000);
    }

    @Test
    public void testMapPreviewIcon() throws InterruptedException {
        initPage()
                .clickLocationButton()
                .swipeComponent()
                .clickTouristInfo()
                .clickTouristInfoVienna()
                .mapPreviewOpens();
        Thread.sleep(10000);
    }
}
