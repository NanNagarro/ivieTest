package com.page.hamburgerPage.home;

import com.page.BasePage;
import com.page.hamburgerPage.HamburgerMenuIndexPage;
import com.page.hamburgerPage.PageWithMenuButton;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;


public class HomeHighLightsPage extends PageWithMenuButton {
    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSXCUITFindBy(id = "Accept All Trackings")
    private WebElement acceptCookies;

    @AndroidFindBy(id = "menuButton")
    private WebElement menuButton;

    @AndroidFindBy(id = "Highlights")
    @iOSXCUITFindBy(id = "homePage_highlights_button")
    private WebElement highLights;


    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"For you\"]/android.widget.TextView")
    @iOSXCUITFindBy(id = "homePage_forYou_button")
    private WebElement ForYou;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "id")
    private WebElement detailButton;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/current_weather_layout")
    @iOSXCUITFindBy(id = "weatherButton")
    private WebElement WeatherIcon;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/search_layout")
    @iOSXCUITFindBy(id = "searchButton")
    private WebElement searchButton;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "Don’t Allow")
    private WebElement dontAllowNotification;


    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "permissionConsentAllowConsentButton")
    private WebElement permissionConsent;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "Ask App Not to Track")
    private WebElement askAppNotToTrack;

    @iOSXCUITFindBy(id = "Continue")
    private WebElement continuesIOSPopUP;



    public HomeHighLightsPage acceptCookies()  {
        acceptCookies.click();

        return this;
    }

    public HomeHighLightsPage acceptNoTrackingOnIOS()  {

        permissionConsent.click();
        askAppNotToTrack.click();


        return this;
    }

    public HamburgerMenuIndexPage menuButtonClick(){
        HamburgerMenuIndexPage hamburgerMenuIndexPage = new HamburgerMenuIndexPage();
        menuButton.click();
        return hamburgerMenuIndexPage;
    }

    public void detailButtonClick() {
        detailButton.click();
    }

    public HomeForYouPage ForYouButtonClick()  {
        ForYou.click();
        HomeForYouPage homeForYouPage = new HomeForYouPage();
        return homeForYouPage;
    }



}
