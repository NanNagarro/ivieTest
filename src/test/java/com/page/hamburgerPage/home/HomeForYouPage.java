package com.page.hamburgerPage.home;

import com.page.BasePage;
import com.page.hamburgerPage.PageWithMenuButton;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import static com.helpers.helperActions.Action.Direction.LEFT;
import static com.helpers.helperActions.Action.swipeInsideHorizontalAction;

public class HomeForYouPage extends PageWithMenuButton {
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"For you\"]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"homePage_forYou_button\"]")
    private WebElement ForYou;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/consentCheckBox")
    @iOSXCUITFindBy(id = "personalisation_consent_checkbox")
    private WebElement CheckboxConsent;


    @AndroidFindBy(id = "at.vienna.ivie.dev:id/getStartedButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok, let's get started\"]")
    private WebElement OkLetsGetStartedButton;


    @iOSXCUITFindBy(id = "Museums & Galleries")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[2]/android.widget.ImageView")
    private WebElement MuseumsAndGalleries;
    @iOSXCUITFindBy(id = "music")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[3]/android.widget.ImageView")
    private WebElement MusikAndTheater;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit 2 interest(s)\"]")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/submitButton")
    private WebElement Submit2Interests;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/primary_btn")
    private WebElement OkButtonForYou;

    @iOSXCUITFindBy(id = "Not now")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/secondary_btn")
    private WebElement NotNowButtonForYou;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"ivie\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
    @AndroidFindBy(id = "at.vienna.ivie.dev:id/drawerLayout")
    private WebElement SwipeLeftForYouTab;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/menu_button")
    @iOSXCUITFindBy(id = "menuButton")
    private WebElement HomeButtonSmall;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(id = "My Interests")
    private WebElement MyInterests;

    public HomeForYouPage ForYouPageConfig() {
        //ForYou.click();
        CheckboxConsent.click();
        OkLetsGetStartedButton.click();
        return this;
    }

    public ChooseInterests ChooseInterests() {

        ForYouPageConfig();
        MusikAndTheater.click();
        MuseumsAndGalleries.click();
        Submit2Interests.click();
        return new ChooseInterests();
    }

    public SignUpForProfilDialog SignUpForProfilDialog() {

        ChooseInterests();
        OkButtonForYou.click();
        NotNowButtonForYou.click();
        return new SignUpForProfilDialog();
    }

    public ForYouAfterSetup ForYouAfterSetup() {

        SignUpForProfilDialog();
        for (int i=0;i<10;i++){
            swipeInsideHorizontalAction(SwipeLeftForYouTab,LEFT);
        }
        return this.ForYouAfterSetup();
    }

    public SettingMyInterests SettingMyInterests() {

        SignUpForProfilDialog();
        HomeButtonSmall.click();
        MyInterests.click();
        Submit2Interests.click();
        return this.SettingMyInterests();
    }


}


