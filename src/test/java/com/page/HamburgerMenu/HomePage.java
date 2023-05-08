package com.page.HamburgerMenu;

import com.page.util.BasePage;
import com.page.util.HamburgerMenuIndexPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSXCUITFindBy(id = "Accept All Trackings")
    private WebElement acceptCookies;

    @AndroidFindBy(id = "menu_button")
    private WebElement menuButton;

    @AndroidFindBy(id = "Highlights")
    @iOSXCUITFindBy(id = "homePage_highlights_button")
    private WebElement highLights;


    @AndroidFindBy(id = "For you")
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
