package com.page.HamburgerMenu;

import com.page.util.BasePage;
import com.page.util.HamburgerMenuIndexPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSFindBy(id = "Accept All Trackings")
    private WebElement acceptCookies;

    @AndroidFindBy(id = "menu_button")
    @iOSFindBy(id = "menuButton")
    private WebElement menuButton;

    @AndroidFindBy(id = "Highlights")
    @iOSFindBy(id = "homePage_highlights_button")
    private WebElement highLights;


    @AndroidFindBy(id = "For you")
    @iOSFindBy(id = "homePage_forYou_button")
    private WebElement ForYou;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement detailButton;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/current_weather_layout")
    @iOSFindBy(id = "weatherButton")
    private WebElement WeatherIcon;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/search_layout")
    @iOSFindBy(id = "searchButton")
    private WebElement searchButton;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "Don’t Allow")
    private WebElement dontAllowNotification;


    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "permissionConsentAllowConsentButton")
    private WebElement permissionConsent;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "Ask App Not to Track")
    private WebElement askAppNotToTrack;



    public HomePage acceptCookies()  {
        acceptCookies.click();
        return this;
    }

    public HomePage acceptNoTrackingOnIOS()  {
        permissionConsent.click();
        askAppNotToTrack.click();

        return this;
    }



    public HamburgerMenuIndexPage menuButtonClick(){
        HamburgerMenuIndexPage hamburgerMenuIndexPage = new HamburgerMenuIndexPage();
        menuButton.click();
        return hamburgerMenuIndexPage;
    }

    public void detailButtonClick() throws InterruptedException {
        detailButton.click();
        Thread.sleep(100000);
    }



}
