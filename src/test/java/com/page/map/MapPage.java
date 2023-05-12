package com.page.map;

import com.helpers.helperActions.Action;
import com.page.BasePage;
import com.helpers.deviceSettings.Android.LocationPopup;
import com.page.signup.SignUpPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import static com.helpers.executeCommand.ADBCommandExecutor.adbCommand;
import static com.helpers.helperActions.Action.Direction.LEFT;
import static com.helpers.helperActions.Action.swipeInsideHorizontalAction;
import static com.helpers.helperActions.Action.swipeUp;
import static org.openqa.selenium.Platform.ANDROID;
import static org.testng.AssertJUnit.assertTrue;

public class MapPage extends BasePage {

    @AndroidFindBy(id = "user_location")
    @iOSXCUITFindBy(id = "Tourist Info Vienna Airport")
    private WebElement locationButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[1]")
    @iOSXCUITFindBy(id = "Tourist Info Vienna Airport")
    private WebElement mapCenterButton;

    // Bottom sheet part
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[1]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Sightseeing")
    private WebElement sightseeingButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[2]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Museum")
    private WebElement museumButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[3]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Park & Garden")
    private WebElement parkAndGardenButton;

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[4]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Music and Theater")
    private WebElement musicAndTheaterButton;

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[5]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "")
    private WebElement cuisineButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[6]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Shopping")
    private WebElement shoppingButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[7]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Leisure & Sport")
    private WebElement leisureButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[2]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Tourist Info")
    private WebElement touristInfoButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[9]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Sightseeing")
    private WebElement hopOnHopOffBus;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[10]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Mobility")
    private WebElement mobilityButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[11]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Utilities")
    private WebElement utilitiesButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[12]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Congress Center")
    private WebElement congressCenter;

    @AndroidFindBy(id = "category_menu_list")
    @iOSXCUITFindBy(id = "Congress Center")
    private WebElement category_menu_list;

    @AndroidFindBy(id = "view2")
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

    public MapPage clickLocationButton(){
        Platform platformName = driver.getCapabilities().getPlatformName();
        if (platformName == ANDROID) {
            adbCommand("RFCR310WZXT", "android.permission.INTERNET", false);
            LocationPopup lp = new LocationPopup();
            lp.clickAlwaysAllowed();
            lp.yesButtonClicked();
            lp.backClicked();
        }
        // For IOS Bridge
        else{

        }
        assertTrue(locationButton.isDisplayed());
        return this;
    }

    public MapPage swipeComponent(){
        swipeInsideHorizontalAction(category_menu_list,LEFT);
        swipeInsideHorizontalAction(category_menu_list,LEFT);
        return this;
    }

    public MapPage clickTouristInfo(){
        touristInfoButton.click();
        return this;
    }

    public MapPage clickTouristInfoVienna(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        touristInfoVienna.click();
        return this;
    }

    public MapPage swipeUpShowLocationDetails(){
      swipeUp(true);
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

    public MapPage mapPreviewOpens(){
        mapCenterButton.isDisplayed();
        return this;
    }


}
