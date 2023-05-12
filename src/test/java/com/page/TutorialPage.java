package com.page;

import com.page.home.HomeHighLightsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.helpers.helperActions.Action.Direction.LEFT;
import static com.helpers.helperActions.Action.swipeInsideHorizontalAction;

public class TutorialPage extends BasePage {

//    @AndroidFindBy(id = "animation_view")
//    @iOSXCUITFindBy(id = "animation_view2")
    @FindBy(id = "animation_view")
    private WebElement tutorialImage;

//    @AndroidFindBy(id = "skip_button")
//    @iOSXCUITFindBy(id = "")
    @FindBy(id = "skip_button")
    private WebElement skipButton;



    public boolean isTutorialImageDisplayed() {
        return tutorialImage.isDisplayed();
    }

    public void tutorialImageSwipeLeft()  {
        swipeInsideHorizontalAction(tutorialImage, LEFT);
    }

    public HomeHighLightsPage toHomePage() {
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        skipButton.click();
        return  new HomeHighLightsPage();
    }

}
