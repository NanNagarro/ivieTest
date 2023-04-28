package com.Test.RegressionTest;

import com.Page.util.BasePage;
import com.Page.util.TutorialPage;
import org.testng.annotations.Test;

public class TutorialPageTest extends BasePage {
    @Test
    public void testLogin() throws InterruptedException {
        TutorialPage tp = new TutorialPage(driver);
        tp.toMainPage();
        Thread.sleep(100000);
    }


}
