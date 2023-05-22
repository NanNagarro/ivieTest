package com.test.RegressionTest;

import com.test.base.InitialRobot;
import com.page.BasePage;
import org.testng.annotations.Test;

public class WalksAndGuidesTest extends BasePage {

    //Logged out
    //
    //Open App
    //
    //go to Walks and Guides
    //
    //Select one filter option:
    //
    //Walks: have Walk in the name
    public void testGoOnAWalk()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findWalkKeywords();
    }

    //guides: have Guide in the name
    //@Test(retryAnalyzer = Retry.class)
    public void testGoOnAGuide()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findGuideKeywords();
    }

    @Test(description = "Audio: on the teaser it says “Audio” on the picture (check if there is a property)")
    public void testGoOnAudio()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .findAudioIcon();
    }

    //Select one option each
    //
    //select one sorting option (are they clickable)
    @Test
    public void testSortByIsClickable()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .testSortByIsClickable();
    }

    //Alphabetical (logic from location in highlights on map)- if it is too complicated, just check if the correct call is sent with sort parameters?!
    @Test
    public void testSortAlphabetical()  {
        new InitialRobot()
                .toHamburgerMenuIndexPage()
                .goToWalksAndGuidePage()
                .ClickSortedBy()
                .ClickSortedByAlphabetical()
                .findIfSortedByAlphabetical();
    }

    //my interests- teaser for personalisation start is displayed
    //
    //login- teasers for walks are displayed?
}