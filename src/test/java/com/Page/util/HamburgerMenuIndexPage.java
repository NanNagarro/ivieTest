package com.page.util;

import com.page.HamburgerMenu.SignUpPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class HamburgerMenuIndexPage extends BasePage {
    @AndroidFindBy(id = "profilePlaceholderLabel")
    @iOSFindBy(id = "id")
    private WebElement signUpButton;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement home;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement map;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement walksAndGuide;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement events;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement cityGuide;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement myLocations;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement ivieTips;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement touristInfo;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement settings;

    public SignUpPage goToSignUpPage()  {
        SignUpPage signUpPage = new SignUpPage();
        signUpButton.click();
        return signUpPage;
    }
}
