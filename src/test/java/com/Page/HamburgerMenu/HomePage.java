package com.page.HamburgerMenu;

import com.util.init.MobileDriverInit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends MobileDriverInit {
    @AndroidFindBy(id = "btn_accept_cookies")
    @iOSFindBy(id = "")
    private WebElement acceptCookies;

    @AndroidFindBy(id = "menu_button")
    @iOSFindBy(id = "")
    private WebElement menuButton;

    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 1000, TimeUnit.MILLISECONDS), this);
    }

    public HomePage acceptCookies() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("click");
        acceptCookies.click();
        return this;
    }

    public HomePage menuButtonClick(){
        menuButton.click();
        return this;
    }

    public void t1() {

    }
}
