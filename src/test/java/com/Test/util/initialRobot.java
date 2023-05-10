package com.Test.util;

import com.page.home.HomeHighLightsPage;
import com.page.HamburgerMenuIndexPage;
import com.page.TutorialPage;
import com.page.BasePage;
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


    public HomeHighLightsPage toHomePage()  {
        TutorialPage tp = new TutorialPage();
        Configuration configuration = new Configuration();
        PLATFORM_NAME platform_name = PLATFORM_NAME.valueOf(configuration.getPropertyValues("platformName"));

        if (platform_name==PLATFORM_NAME.IOS){
            return tp.toHomePage()
                    .acceptCookies()
                    .acceptNoTrackingOnIOS();
        }
        else{
            return tp.toHomePage()
                    .acceptCookies();
        }
    }
}