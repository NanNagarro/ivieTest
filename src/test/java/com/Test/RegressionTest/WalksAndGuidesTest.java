package com.Test.RegressionTest;

import com.Test.util.initialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;

public class WalksAndGuidesTest extends BasePage {

    @Test
    public void testGoOnAWalk()  {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findWalkKeywords();
    }

    @Test
    public void testGoOnAGuide()  {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findGuideKeywords();
    }

    @Test
    public void testGoOnAudio()  {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findAudioIcon();
    }

    @Test
    public void testSortByIsClickable()  {
        new initialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .testSortByIsClickable();
    }
}
