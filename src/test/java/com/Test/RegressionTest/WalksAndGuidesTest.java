package com.Test.RegressionTest;

import com.Test.base.InitialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;

public class WalksAndGuidesTest extends BasePage {

    @Test
    public void testGoOnAWalk()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findWalkKeywords();
    }

    @Test
    public void testGoOnAGuide()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findGuideKeywords();
    }

    @Test
    public void testGoOnAudio()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findAudioIcon();
    }

    @Test
    public void testSortByIsClickable()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .testSortByIsClickable();
    }
}