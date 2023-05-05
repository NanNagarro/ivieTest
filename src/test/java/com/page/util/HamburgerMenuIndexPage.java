package com.page.util;

import com.page.HamburgerMenu.HomePage;
import com.page.HamburgerMenu.MapPage;
import com.page.HamburgerMenu.SignUpPage;
import com.page.HamburgerMenu.WalksAndGuidePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class HamburgerMenuIndexPage extends BasePage {
    @AndroidFindBy(id = "profilePlaceholderLabel")
    @iOSFindBy(id = "Sign up or login for more features")
    private WebElement signUpButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")
    @iOSFindBy(id = "Home")
    private WebElement home;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup")
    @iOSFindBy(id = "Map")
    private WebElement map;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup")
    @iOSFindBy(id = "Walks & Guides")
    private WebElement walksAndGuide;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.view.ViewGroup")
    @iOSFindBy(id = "Events")
    private WebElement events;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.view.ViewGroup")
    @iOSFindBy(id = "City Card")
    private WebElement cityCard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.view.ViewGroup")
    @iOSFindBy(id = "My Locations")
    private WebElement myLocations;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.view.ViewGroup")
    @iOSFindBy(id = "ivie's Tips")
    private WebElement ivieTips;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.view.ViewGroup")
    @iOSFindBy(id = "Tourist-Info")
    private WebElement touristInfo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.view.ViewGroup")
    @iOSFindBy(id = "Settings")
    private WebElement settings;

    public SignUpPage goToSignUpPage()  {
        SignUpPage signUpPage = new SignUpPage();
        signUpButton.click();
        return signUpPage;
    }

    public void goToHomePage() throws InterruptedException {
        HomePage signUpPage = new HomePage();
        home.click();
        Thread.sleep(10000);
    }

    public void goToMapPage() throws InterruptedException {
        MapPage mapPage = new MapPage();
        map.click();
        Thread.sleep(1000);
    }

    public void goToWalksAndGuidePage() throws InterruptedException {
        WalksAndGuidePage walksAndGuidePage = new WalksAndGuidePage();
        walksAndGuide.click();
        Thread.sleep(10000);
    }

    public void goToEventsPage() throws InterruptedException {
        events.click();
        Thread.sleep(10000);
    }

    public void goToCityCardPage() throws InterruptedException {
        cityCard.click();
        Thread.sleep(10000);
    }

    public void goToMyLocationPage() throws InterruptedException {
        myLocations.click();
        Thread.sleep(10000);
    }

    public void goToIvieTipsPage() throws InterruptedException {
        ivieTips.click();
        Thread.sleep(10000);
    }

    public void goToTouristInfoPage() throws InterruptedException {
        touristInfo.click();
        Thread.sleep(10000);
    }

    public void goToSettingsPage() throws InterruptedException {
        settings.click();
        Thread.sleep(10000);
    }

}
