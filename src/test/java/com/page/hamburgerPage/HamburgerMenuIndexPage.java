package com.page.hamburgerPage;

import com.helpers.helperActions.Action;
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

import static com.helpers.helperActions.Action.DIRECTION.UP;
import static com.helpers.helperActions.Action.START_HORIZONTAL.LEFT;
import static com.helpers.helperActions.Action.START_HORIZONTAL.MIDDLE;
import static com.helpers.helperActions.Action.swipeVertical;

public class HamburgerMenuIndexPage extends PageWithMenuButton {

    @AndroidFindBy(id = "profilePlaceholderLabel")
    @iOSXCUITFindBy(id = "Sign up or login for more features")
    private WebElement signUpButton;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Home']")
    @iOSXCUITFindBy(id = "Home")
    private WebElement home;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Map']")
    @iOSXCUITFindBy(id = "Map")
    private WebElement map;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Walks & Guides']")
    @iOSXCUITFindBy(id = "Walks & Guides")
    private WebElement walksAndGuide;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Events']")
    @iOSXCUITFindBy(id = "Events")
    private WebElement events;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='City Card']")
    @iOSXCUITFindBy(id = "City Card")
    private WebElement cityCard;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My Locations']")
    @iOSXCUITFindBy(id = "My Locations")
    private WebElement myLocations;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ivie's Tips']")
    @iOSXCUITFindBy(id = "ivie's Tips")
    private WebElement ivieTips;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tourist-Info']")
    @iOSXCUITFindBy(id = "Tourist-Info")
    private WebElement touristInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        swipeVertical(LEFT,UP);
        settings.click();
        return new SettingsPage();
    }

}
