package com.page.hamburgerPage.settings;

import com.page.hamburgerPage.HamburgerMenuIndexPage;
import com.page.hamburgerPage.PageWithMenuButton;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SettingsPage extends PageWithMenuButton {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Language']")
    @iOSXCUITFindBy(id = "Language")
    private WebElement languageButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English']")
    @iOSXCUITFindBy(id = "English")
    private WebElement englishButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='German']")
    @iOSXCUITFindBy(id = "German")
    private WebElement germanButton;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/backButton")
    @iOSXCUITFindBy(id = "backNavigationIcon")
    private WebElement backNavigationIcon;

    public SettingsPage clickLanguageButton(){
        languageButton.click();
        return this;
    }

    public HamburgerMenuIndexPage clickGermanButton(){
       germanButton.click();
        return new HamburgerMenuIndexPage();
    }
}
