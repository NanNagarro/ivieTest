package com.page.HamburgerMenu;

import com.page.util.BasePage;
import com.page.util.HamburgerMenuIndexPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSFindBy(id = "id")
    private WebElement acceptCookies;

    @AndroidFindBy(id = "menu_button")
    @iOSFindBy(id = "id")
    private WebElement menuButton;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement highLights;


    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement ForYou;

    @AndroidFindBy(id = "id")
    @iOSFindBy(id = "id")
    private WebElement detailButton;


    public HomePage acceptCookies()  {
        System.out.println("click");
        acceptCookies.click();
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
