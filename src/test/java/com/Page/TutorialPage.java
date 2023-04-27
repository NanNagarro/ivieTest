package com.Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.util.init.Action.swipeToLeftAction;

public class TutorialPage {

    @AndroidFindBy(id = "animation_view")
    @iOSFindBy(id = "")
    private WebElement tutorialImage;

    @AndroidFindBy(id = "skip_button")
    @iOSFindBy(id = "")
    private WebElement skipButton;


    public TutorialPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 1000, TimeUnit.MILLISECONDS), this);
    }


    public boolean isTutorialImageDisplayed() {
        return tutorialImage.isDisplayed();
    }

    public void tutorialImageSwipeLeft(){
        swipeToLeftAction(tutorialImage);
    }

    public void toMainPage() {
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        skipButton.click();
    }

}
