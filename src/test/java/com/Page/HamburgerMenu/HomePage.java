package com.page.HamburgerMenu;

import com.page.util.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {
    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSFindBy(id = "")
    private WebElement acceptCookies;

    @AndroidFindBy(id = "menu_button")
    @iOSFindBy(id = "")
    private WebElement menuButton;

    public HomePage acceptCookies()  {
        System.out.println("click");
        acceptCookies.click();
        return this;
    }

    public HomePage menuButtonClick(){
        menuButton.click();
        return this;
    }

}
