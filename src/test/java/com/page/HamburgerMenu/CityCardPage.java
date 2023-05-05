package com.page.HamburgerMenu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class CityCardPage {
    @AndroidFindBy(id = "Home")
    @iOSFindBy(id = "HOME")
    private WebElement homeButtonVCC;

    @AndroidFindBy(id = "City Card")
    @iOSFindBy(id = "ADD CARD")
    private WebElement addCardButttonVCC;

    @AndroidFindBy(id = "Benefits")
    @iOSFindBy(id = "BENEFITS")
    private WebElement benefitsButtonVCC;

    @iOSFindBy(id = "MY CARDS")
    private WebElement myCardsButtonVCC;

    @iOSFindBy(id = "BUY")
    private WebElement buyButtonVCC;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/orderCardBtn")
    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Buy Now\"])[1]")
    private WebElement buyNowButtonVCC;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/activateCardBtn")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Existing Card\"]")
    private WebElement addExistingCardButtonVCC;

    @AndroidFindBy(id = "at.vienna.ivie.dev:id/redeemCardBtn")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Redeem Code\"]")
    private WebElement redeemCodeButtonVCC;
}
