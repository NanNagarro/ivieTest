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

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "homePage_highlights_button")
    private WebElement highLights;


    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "homePage_forYou_button")
    private WebElement ForYou;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement detailButton;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "weatherButton")
    private WebElement WeatherIcon;

    @AndroidFindBy(id = "id")
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
        System.out.println("click");
        acceptCookies.click();
        return this;
    }

    public HomePage acceptNoTrackingOnIOS()  {
        System.out.println("click");
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
