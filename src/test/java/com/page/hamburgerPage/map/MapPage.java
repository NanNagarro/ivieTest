package com.page.hamburgerPage.map;

import com.helpers.deviceSettingsPage.Android.LocationPopup;
import com.page.hamburgerPage.HamburgerMenuIndexPage;
import com.page.hamburgerPage.PageWithMenuButton;
import com.page.signup.SignUpPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import static com.helpers.executeCommand.ADBCommandExecutor.adbCommand;
import static com.helpers.helperActions.Action.*;
import static com.helpers.helperActions.Action.Direction.*;
import static org.openqa.selenium.Platform.ANDROID;

public class MapPage extends PageWithMenuButton {

    @AndroidFindBy(id = "user_location")
    @iOSXCUITFindBy(id = "id")
    private WebElement locationButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[1]")
    @iOSXCUITFindBy(id = "id")
    private WebElement mapCenterButton;

    // Bottom sheet part
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sightseeing']")
    @iOSXCUITFindBy(id = "Sightseeing")
    private WebElement sightseeingButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Museum']")
    @iOSXCUITFindBy(id = "Museum")
    private WebElement museumButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Park & Garden']")
    @iOSXCUITFindBy(id = "Park & Garden")
    private WebElement parkAndGardenButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Music and Theater']")
    @iOSXCUITFindBy(id = "Music and Theater")
    private WebElement musicAndTheaterButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cuisine & Nightlife']")
    @iOSXCUITFindBy(id = "")
    private WebElement cuisineButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shopping']")
    @iOSXCUITFindBy(id = "Shopping")
    private WebElement shoppingButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Leisure & Sport']")
    @iOSXCUITFindBy(id = "Leisure & Sport")
    private WebElement leisureButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tourist Info']")
    @iOSXCUITFindBy(id = "Tourist Info")
    private WebElement touristInfoButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hop-on Hop-off Bus']")
    @iOSXCUITFindBy(id = "Sightseeing")
    private WebElement hopOnHopOffBus;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobility']")
    @iOSXCUITFindBy(id = "Mobility")
    private WebElement mobilityButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Utilities']")
    @iOSXCUITFindBy(id = "Utilities")
    private WebElement utilitiesButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Congress Center']")
    @iOSXCUITFindBy(id = "Congress Center")
    private WebElement congressCenter;

    @AndroidFindBy(id = "category_menu_list")
    @iOSXCUITFindBy(id = "Congress Center")
    private WebElement category_menu_list;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tourist Info Vienna']")
    @iOSXCUITFindBy(id = "id")
    private WebElement touristInfoVienna;

    @AndroidFindBy(id = "location_name_xs")
    @iOSXCUITFindBy(id = "id")
    private WebElement locationName;

    @AndroidFindBy(id = "mark_as_favorite_xs")
    @iOSXCUITFindBy(id = "id")
    private WebElement favoriteButton;

    @AndroidFindBy(id = "button_text")
    @iOSXCUITFindBy(id = "id")
    private WebElement createProfileOrLogin;

    @AndroidFindBy(id = "layout_navigator")
    @iOSXCUITFindBy(id = "id")
    private WebElement okWindowPopUp;

    @AndroidFindBy(id = "menuButton")
    @iOSXCUITFindBy(id = "id")
    private WebElement menuButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+"Opening Hours"+"']")
    @iOSXCUITFindBy(id = "id")
    private WebElement openingHours;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='"+"Accessibility"+"']")
    @iOSXCUITFindBy(id = "id")
    private WebElement accessibility;

    @AndroidFindBy(id = "location_xs_IV")
    @iOSXCUITFindBy(id = "id")
    private WebElement locationPicture;

    @AndroidFindBy(id = "share_icon_xs")
    @iOSXCUITFindBy(id = "id")
    private WebElement shareButton;

    @AndroidFindBy(id = "locations_xs_description")
    @iOSXCUITFindBy(id = "id")
    private WebElement locationDescription;


    public MapPage clickLocationButton(){
        Platform platformName = driver.getCapabilities().getPlatformName();
        if (platformName == ANDROID) {
            adbCommand(getFilteredDevice().get(0).getDeviceName(), "android.permission.ACCESS_FINE_LOCATION", false);
            LocationPopup lp = new LocationPopup();
            lp.clickAlwaysAllowed();
            lp.yesButtonClicked();
            lp.backClicked();
        }
        // For IOS Bridge
        else{

        }
        return this;
    }

    public MapPage clickTouristInfo(){
        touristInfoButton.click();
        return this;
    }

    public MapPage clickTouristInfoVienna(){
        touristInfoVienna.click();
        return this;
    }

    public MapPage favoriteButtonClick(){
        favoriteButton.click();
        return this;
    }

    public SignUpPage createProfileOrLoginButtonClick(){
        createProfileOrLogin.click();
        return new SignUpPage();
    }

    public MapPage clickMapPreview(){
        mapCenterButton.click();
        return this;
    }

    public MapPage clickOkWindowPopUp(){
        okWindowPopUp.click();
        return this;
    }

    public MapPage clickOpeningHours(){
        openingHours.click();
        return this;
    }

    public MapPage clickAccessibility(){
        accessibility.click();
        return this;
    }

    public HamburgerMenuIndexPage clickMenuButton(){
        menuButton.click();
        return new HamburgerMenuIndexPage();
    }

    public MapPage clickShareButton(){
        shareButton.click();
        return this;
    }

    public MapPage mapPreviewOpens(){
        mapCenterButton.isDisplayed();
        return this;
    }

    public MapPage swipeUpToShowTouristInfoDetail(){
        swipeVerticalWithElement(touristInfoButton,UP);
        return this;
    }

    public MapPage swipeDownToShowShareButton(){
        swipeVerticalWithElement(locationDescription,DOWN);
        return this;
    }

    public MapPage swipeUpToShowOpeningHours(){
        swipeVerticalWithElement(shareButton,UP);
        return this;
    }

    public MapPage swipeLeftUntilTouristInfoDisplayed(){
        swipeInsideHorizontalAction(category_menu_list, touristInfoButton, LEFT);
        return this;
    }

    public MapPage closeDeviceShareDetails(){
        swipeVertical(DOWN);
        return this;
    }






}
