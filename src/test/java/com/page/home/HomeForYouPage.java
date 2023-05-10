package com.page.home;

import com.page.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import static com.util.helpers.Action.swipeToLeftAction;

public class HomeForYouPage extends BasePage {
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"For you\"]/android.widget.TextView")
    @iOSXCUITFindBy(id = "homePage_forYou_button")
    private WebElement ForYou;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/consentCheckBox")
    @iOSXCUITFindBy(id = "personalisation_consent_checkbox")
    private WebElement CheckboxConsent;


    @AndroidFindBy(id = "at.vienna.ivie.dev:id/getStartedButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok, let's get started\"]")
    private WebElement OkLetsGetStartedButton;


    @iOSXCUITFindBy(id = "Museums & Galleries")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[2]/android.widget.ImageView[2]")
    private WebElement MuseumsAndGalleries;
    @iOSXCUITFindBy(id = "music")
    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[3]/android.widget.ImageView[2]")
    private WebElement MusikAndTheater;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit 2 interest(s)\"]")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/submitButton")
    private WebElement Submit2Interests;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/primary_btn")
    private WebElement OkButtonForYou;

    @iOSXCUITFindBy(id = "Not now")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/secondary_btn\n")
    private WebElement NotNowButtonForYou;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"ivie\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/drawerLayout")
    private WebElement SwipeLeftForYouTab;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/menu_button")
    @iOSXCUITFindBy(id = "menuButton")
    private WebElement HomeButtonSmall;


    public HomeForYouPage ForYouPageConfig() {
        ForYou.click();
        CheckboxConsent.click();
        OkLetsGetStartedButton.click();
        return this;
    }

    public ChooseInterests ChooseInterests() {

        ForYouPageConfig();
        MusikAndTheater.click();
        MuseumsAndGalleries.click();
        Submit2Interests.click();
        return this.ChooseInterests();
    }

    public SignUpForProfilDialog SignUpForProfilDialog() {

        ChooseInterests();
        OkButtonForYou.click();
        NotNowButtonForYou.click();
        return this.SignUpForProfilDialog();
    }

    public ForYouAfterSetup ForYouAfterSetup() {

        SignUpForProfilDialog();
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        swipeToLeftAction(SwipeLeftForYouTab);
        return this.ForYouAfterSetup();
    }



}

