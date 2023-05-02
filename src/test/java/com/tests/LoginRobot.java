package com.tests;

import com.page.util.HamburgerMenuIndexPage;
import com.page.util.TutorialPage;
import com.page.util.BasePage;

public class LoginRobot extends BasePage {

    public HamburgerMenuIndexPage toHamburgerMenuIndexPage()  {
        TutorialPage tp = new TutorialPage();
        return tp.toHomePage()
                .acceptCookies()
                .menuButtonClick();
    }
}
