package com.Test.RegressionTest;

import com.page.util.BasePage;
import com.page.util.TutorialPage;
import org.testng.annotations.Test;

public class TutorialPageTest extends BasePage {
    @Test
    public void testLogin() throws InterruptedException {
        TutorialPage tp = new TutorialPage(driver);
        tp.toHomePage();
        Thread.sleep(2000);
    }


}
