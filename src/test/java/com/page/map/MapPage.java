package com.page.map;

import com.page.util.BasePage;
import com.util.deviceSettings.Android.LocationPopup;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import static com.util.executeCommand.ADBCommandExecutor.adbCommand;
import static org.openqa.selenium.Platform.ANDROID;
import static org.testng.AssertJUnit.assertTrue;

public class MapPage extends BasePage {

    @AndroidFindBy(id = "user_location")
    @iOSXCUITFindBy(id = "Tourist Info Vienna Airport")
    private WebElement locationButton;

    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSXCUITFindBy(id = "Tourist Info Vienna Airport")
    private WebElement touristInfoAirport;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[1]")
    @iOSXCUITFindBy(id = "Sightseeing")
    private WebElement sightseeingButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[2]")
    @iOSXCUITFindBy(id = "Museum")
    private WebElement museumButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[3]")
    @iOSXCUITFindBy(id = "Park & Garden")
    private WebElement parkAndGardenButton;

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[1]")
    @iOSXCUITFindBy(id = "Music and Theater")
    private WebElement musicAndTheaterButton;

    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSXCUITFindBy(id = "Tourist Info Vienna Airport")
    private WebElement cuisineButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[3]")
    @iOSXCUITFindBy(id = "Shopping")
    private WebElement shoppingButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[2]")
    @iOSXCUITFindBy(id = "Leisure & Sport")
    private WebElement leisureButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[2]")
    @iOSXCUITFindBy(id = "Tourist Info")
    private WebElement touristInfoButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[2]")
    @iOSXCUITFindBy(id = "Mobility")
    private WebElement mobilityButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView[1]/androidx.cardview.widget.CardView[3]")
    @iOSXCUITFindBy(id = "Utilities")
    private WebElement utilitiesButton;

    public MapPage clickLocationButton(){
        Platform platformName = driver.getCapabilities().getPlatformName();
        if (platformName == ANDROID) {
            adbCommand("RFCR310WZXT", "android.permission.ACCESS_COARSE_LOCATION", false);
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

}
