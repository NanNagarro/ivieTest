package com.page.util;

import com.page.HamburgerMenu.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.util.helpers.Action.swipeToLeftAction;

public class TutorialPage extends BasePage {

//    @AndroidFindBy(id = "animation_view")
//    @iOSFindBy(id = "animation_view2")
    @FindBy(id = "animation_view")
    private WebElement tutorialImage;

//    @AndroidFindBy(id = "skip_button")
//    @iOSFindBy(id = "")
    @FindBy(id = "skip_button")
    private WebElement skipButton;



    public boolean isTutorialImageDisplayed() {
        return tutorialImage.isDisplayed();
    }

    public void tutorialImageSwipeLeft()  {
        swipeToLeftAction(tutorialImage);
    }

    public HomePage toHomePage() {
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        tutorialImageSwipeLeft();
        skipButton.click();
        HomePage hp = new HomePage();
        return  hp;
    }

}
