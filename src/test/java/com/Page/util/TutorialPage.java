package com.page.util;

import com.page.HamburgerMenu.HomePage;
import com.util.init.MobileDriverInit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.util.helpers.Action.swipeToLeftAction;

public class TutorialPage extends MobileDriverInit {

//    @AndroidFindBy(id = "animation_view")
//    @iOSFindBy(id = "animation_view2")
    @FindBy(id = "animation_view")
    private WebElement tutorialImage;

//    @AndroidFindBy(id = "skip_button")
//    @iOSFindBy(id = "")
    @FindBy(id = "skip_button")
    private WebElement skipButton;


    public TutorialPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, 1000, TimeUnit.MILLISECONDS), this);
    }


    public boolean isTutorialImageDisplayed() {
        return tutorialImage.isDisplayed();
    }

    public void tutorialImageSwipeLeft() throws InterruptedException {
        swipeToLeftAction(tutorialImage);
    }

    public HomePage toHomePage() throws InterruptedException {
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        Thread.sleep(2000);
        skipButton.click();
        HomePage hp = new HomePage(driver);
        return  hp;
    }

}
