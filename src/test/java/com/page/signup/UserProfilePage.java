package com.page.signup;

import com.page.BasePage;
import com.page.hamburgerPage.PageWithMenuButton;
import com.page.hamburgerPage.map.MapPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class UserProfilePage extends PageWithMenuButton {

    @AndroidFindBy(id = "backButton")
    @iOSXCUITFindBy(id = "id")
    private WebElement backButton;

    @AndroidFindBy(id = "profile_item_title")
    @iOSXCUITFindBy(id = "id")
    private WebElement editDetails;

    public MapPage clickBackButton()  {
        backButton.click();
        return new MapPage();
    }
}
