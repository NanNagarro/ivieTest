package com.page.HamburgerMenu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class CityCardPage {
    @AndroidFindBy(id = "Home")
    @iOSXCUITFindBy(id = "HOME")
    private WebElement homeButtonVCC;

    @AndroidFindBy(id = "City Card")
    @iOSXCUITFindBy(id = "ADD CARD")
    private WebElement addCardButttonVCC;

    @AndroidFindBy(id = "Benefits")
    @iOSXCUITFindBy(id = "BENEFITS")
    private WebElement benefitsButtonVCC;

    @iOSXCUITFindBy(id = "MY CARDS")
    private WebElement myCardsButtonVCC;

    @iOSXCUITFindBy(id = "BUY")
    private WebElement buyButtonVCC;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/orderCardBtn")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Buy Now\"])[1]")
    private WebElement buyNowButtonVCC;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/activateCardBtn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Existing Card\"]")
    private WebElement addExistingCardButtonVCC;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/redeemCardBtn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Redeem Code\"]")
    private WebElement redeemCodeButtonVCC;
}
