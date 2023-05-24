package com.page.hamburgerPage;

import com.page.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class PageWithMenuButton extends BasePage {
    @AndroidFindBy(id = "menuButton")
    @iOSXCUITFindBy(id = "id")
    private WebElement menuButton;

    @AndroidFindBy(id = "homeLayout")
    @iOSXCUITFindBy(id = "id")
    private WebElement homeLayout;

    public PageWithMenuButton clickMenuButton()  {
        menuButton.click();
        return this;
    }

    public PageWithMenuButton clickHomeLayout()  {
        homeLayout.click();
        return this;
    }

}
