package com.test.base;

import com.page.hamburgerPage.home.HomeHighLightsPage;
import com.page.hamburgerPage.HamburgerMenuIndexPage;
import com.page.TutorialPage;
import com.page.BasePage;
import com.helpers.init.config.Configuration;

import java.util.Objects;

public class InitialRobot extends BasePage {

    public HamburgerMenuIndexPage toHamburgerMenuIndexPage()  {
        Configuration configuration = new Configuration();
        String platform_name = configuration.getPropertyValues("config.properties","platformName");

        TutorialPage tp = new TutorialPage();

        if (Objects.equals(platform_name, "iOS")){
            return tp.toMainPage()
                .acceptCookies()
                .acceptNoTrackingOnIOS()
                .menuButtonClick();
        }
        else{
            return tp.toMainPage()
                    .acceptCookies()
                    .menuButtonClick();
        }
    }

    public HomeHighLightsPage toHomePage()  {
        Configuration configuration = new Configuration();
        String platform_name = configuration.getPropertyValues("config.properties","platformName");

        TutorialPage tp = new TutorialPage();

        if (Objects.equals(platform_name, "IOS")){
            return tp.toMainPage()
                    .acceptCookies()
                    .acceptNoTrackingOnIOS();
        }
        else{
            return tp.toMainPage()
                    .acceptCookies();
        }
    }
}
