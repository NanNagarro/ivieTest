package com.Test.RegressionTest;

import com.page.BasePage;
import com.page.TutorialPage;
import org.testng.annotations.Test;

public class TutorialPageTest extends BasePage {
    @Test
    public void testLogin() {
        TutorialPage tp = new TutorialPage();
        tp.toHomePage();
    }


}
