package com.page.util;

import com.util.init.MobileDriverInit;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage extends MobileDriverInit {

    public BasePage() {
        initElements();
    }

    public void initElements(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
    }

}
