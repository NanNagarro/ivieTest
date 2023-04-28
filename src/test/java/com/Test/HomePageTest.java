package com.Test;

import com.Page.util.BasePage;
import com.Page.HamburgerMenu.Home;
import com.Page.util.TutorialPage;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @Test
    public void testLogin() throws InterruptedException {
        TutorialPage tp = new TutorialPage(driver);
        tp.toMainPage();

        Home hp = new Home(driver);
        hp.acceptCookies();
        hp.menuButtonClick();
        Thread.sleep(100000);

    }
}
