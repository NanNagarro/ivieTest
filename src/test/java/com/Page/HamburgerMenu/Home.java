package com.Page.HamburgerMenu;

import com.util.init.MobileDriverInit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Home extends MobileDriverInit {
    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSFindBy(id = "")
    private WebElement acceptCookies;

    @AndroidFindBy(id = "menu_button")
    @iOSFindBy(id = "")
    private WebElement menuButton;

    public Home(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 1000, TimeUnit.MILLISECONDS), this);
    }

    public void acceptCookies() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("coick");
        acceptCookies.click();
    }

    public void menuButtonClick(){
        menuButton.click();
    }

    public void t1() {

    }
}
