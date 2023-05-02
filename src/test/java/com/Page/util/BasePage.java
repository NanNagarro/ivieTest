package com.page.util;

import com.util.init.MobileDriverInit;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public abstract class BasePage extends MobileDriverInit {


    public BasePage() {
        initElements();
    }


    public void initElements(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }

    public void webElementsAreDisplayed(WebElement[] webElements){
        for (WebElement webElement : webElements) {
           webElement.isDisplayed();
        }
    }


}
