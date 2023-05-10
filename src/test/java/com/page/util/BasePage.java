package com.page.util;

import com.util.init.Driver.MobileDriverInit;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class BasePage extends MobileDriverInit {

    public BasePage() {
        initElements();
    }

    public void initElements(){
        System.out.println("Binding page with driver" + this);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }



    public void webElementsAreDisplayed(WebElement[] webElements){
        for (WebElement webElement : webElements) {
           webElement.isDisplayed();
        }
    }


}
