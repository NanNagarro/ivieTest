package com.helpers.deviceSettings.Android;

import com.page.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LocationPopup extends BasePage {
    // Android location pop up setting
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement alwaysAllowed;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
    private WebElement oneTime;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    private WebElement denied;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
    private WebElement back;

    // App enable location
    @AndroidFindBy(id = "action_yes_btn")
    private WebElement yesButton;

    @AndroidFindBy(id = "action_no_btn")
    private WebElement noButton;

    public LocationPopup clickAlwaysAllowed()  {
        alwaysAllowed.click();
        return this;
    }

    public LocationPopup oneTimeAllowed()  {
        oneTime.click();
        return this;
    }

    public LocationPopup denyLocation()  {
        denied.click();
        return this;
    }

    public LocationPopup yesButtonClicked()  {
        yesButton.click();
        return this;
    }

    public LocationPopup noButtonClicked()  {
        noButton.click();
        return this;
    }

    public LocationPopup backClicked()  {
        back.click();
        return this;
    }


}
