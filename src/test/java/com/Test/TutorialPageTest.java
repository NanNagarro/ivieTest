package com.Test;

import com.Page.BasePage;
import com.Page.TutorialPage;
import com.util.init.MobileDriverInit;
import org.testng.annotations.Test;

public class TutorialPageTest extends BasePage {
    @Test
    public void testLogin() throws InterruptedException {
        TutorialPage tp = new TutorialPage(driver);
        tp.toMainPage();
        Thread.sleep(100000);
    }


}
