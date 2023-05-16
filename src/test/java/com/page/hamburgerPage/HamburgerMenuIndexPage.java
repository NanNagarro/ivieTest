package com.page.hamburgerPage;

import com.page.BasePage;
import com.page.hamburgerPage.cityCard.CityCardPage;
import com.page.hamburgerPage.events.EventsPage;
import com.page.hamburgerPage.home.HomeHighLightsPage;
import com.page.hamburgerPage.ivieTips.IvieTipsPage;
import com.page.hamburgerPage.map.MapPage;
import com.page.hamburgerPage.myLocations.MyLocationsPage;
import com.page.hamburgerPage.settings.SettingsPage;
import com.page.signup.SignUpPage;
import com.page.hamburgerPage.touristInfo.TouristInfoPage;
import com.page.hamburgerPage.walksAndGuides.WalksAndGuidePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class HamburgerMenuIndexPage extends PageWithMenuButton {

    @AndroidFindBy(id = "profilePlaceholderLabel")
    @iOSXCUITFindBy(id = "Sign up or login for more features")
    private WebElement signUpButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(id = "Home")
    private WebElement home;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Map")
    private WebElement map;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Walks & Guides")
    private WebElement walksAndGuide;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Events")
    private WebElement events;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "City Card")
    private WebElement cityCard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "My Locations")
    private WebElement myLocations;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "ivie's Tips")
    private WebElement ivieTips;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Tourist-Info")
    private WebElement touristInfo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.view.ViewGroup")
    @iOSXCUITFindBy(id = "Settings")
    private WebElement settings;


    public SignUpPage goToSignUpPage()  {
        signUpButton.click();
        return new SignUpPage();
    }

    public HomeHighLightsPage goToHomePage() {
        home.click();
        return  new HomeHighLightsPage();
    }

    public MapPage goToMapPage() {
        map.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new MapPage();
    }

    public WalksAndGuidePage goToWalksAndGuidePage() {
        walksAndGuide.click();
        return new WalksAndGuidePage();
    }

    public EventsPage goToEventsPage() {
        events.click();
        return new EventsPage();
    }

    public CityCardPage goToCityCardPage() {
        cityCard.click();
        return new CityCardPage();
    }

    public MyLocationsPage goToMyLocationPage() {
        myLocations.click();
        return new MyLocationsPage();
    }

    public IvieTipsPage goToIvieTipsPage() {
        ivieTips.click();
        return new IvieTipsPage();
    }

    public TouristInfoPage goToTouristInfoPage() {
        touristInfo.click();
        return new TouristInfoPage();
    }

    public SettingsPage goToSettingsPage(){
        settings.click();
        return new SettingsPage();
    }

}
