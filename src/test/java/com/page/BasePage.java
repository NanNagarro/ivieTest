package com.page;

import com.helpers.init.driver.MobileDriverInit;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage extends MobileDriverInit {

    public BasePage() {
        initElements();
    }

    public void initElements(){
        System.out.println("Binding page with driver" + this);
        PageFactory.initElements(
                new AppiumFieldDecorator(
                        driver,
                        Duration.ofSeconds(
                                Long.parseLong(configuration.getPropertyValues(
                                        "config.properties","PAGE_LOAD_TIMEOUT_SECONDS"))
                        )),
                this);
    }

    public void webElementsAreDisplayed(WebElement[] webElements){
        for (WebElement webElement : webElements) {
           webElement.isDisplayed();
        }
    }


}
