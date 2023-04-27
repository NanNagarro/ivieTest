package com.Test;

import com.Page.TutorialPage;
import com.util.init.MobileDriverInit;
import org.testng.annotations.Test;

public class TutorialPageTest extends MobileDriverInit {
    @Test
    public void testLogin() {
        TutorialPage tp = new TutorialPage(driver);
        tp.toMainPage();
    }


}
