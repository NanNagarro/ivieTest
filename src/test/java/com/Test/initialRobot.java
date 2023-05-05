package com.Test;

import com.page.util.HamburgerMenuIndexPage;
import com.page.util.TutorialPage;
import com.page.util.BasePage;
import com.util.init.PLATFORM_NAME;
import com.util.init.config.Configuration;

public class initialRobot extends BasePage {

    public HamburgerMenuIndexPage toHamburgerMenuIndexPage()  {
        TutorialPage tp = new TutorialPage();
        Configuration configuration = new Configuration();
        PLATFORM_NAME platform_name = PLATFORM_NAME.valueOf(configuration.getPropertyValues("platformName"));

        if (platform_name==PLATFORM_NAME.IOS){
            return tp.toHomePage()
                .acceptCookies()
                .acceptNoTrackingOnIOS()
                .menuButtonClick();
        }
        else{
            return tp.toHomePage()
                    .acceptCookies()
                    .menuButtonClick();
        }
    }
}
