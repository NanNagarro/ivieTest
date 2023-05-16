package com.page.hamburgerPage;

import com.page.BasePage;
import com.page.signup.SignUpPage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class PageWithMenuButton extends BasePage {
    @AndroidFindBy(id = "menuButton")
    @iOSXCUITFindBy(id = "")
    private WebElement menuButton;

    public PageWithMenuButton clickMenuButton()  {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        menuButton.click();
        return this;
    }

}
