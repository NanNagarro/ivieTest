package com.Test;

import com.Page.BasePage;
import com.Page.HomePage;
import com.Page.TutorialPage;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {

    @Test
    public void testLogin() throws InterruptedException {
        TutorialPage tp = new TutorialPage(driver);
        tp.toMainPage();

        HomePage hp = new HomePage(driver);
        hp.acceptCookies();
        hp.menuButtonClick();
        Thread.sleep(100000);

    }
}
