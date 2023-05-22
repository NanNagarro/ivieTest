package com.page.hamburgerPage.walksAndGuides;

import com.page.hamburgerPage.PageWithMenuButton;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

import static com.helpers.helperActions.Action.Direction.UP;
import static com.helpers.helperActions.Action.swipeVertical;
import static java.lang.Boolean.TRUE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WalksAndGuidePage extends PageWithMenuButton {

    @AndroidFindBy(id = "spinner_item_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Top Walks\"]")
    private WebElement sortedBy;

    // TODO: 05.05.2023 sort by items id are all the same.
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Top Walks']")
    @iOSXCUITFindBy(xpath = "id")
    private WebElement sortedByTopWalks;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alphabetical']")
    @iOSXCUITFindBy(xpath = "id")
    private WebElement sortedByAlphabetical;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My interests']")
    @iOSXCUITFindBy(xpath = "id")
    private WebElement sortedByMyInterests;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Walks']")
    @iOSXCUITFindBy(id = "Walks")
    private WebElement filterWalksButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Guides']")
    @iOSXCUITFindBy(id = "Guides")
    private WebElement filterGuidesButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Audio']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Audio\"])[1]")
    private WebElement filterAudioButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridView/android.view.ViewGroup[4]/android.widget.ImageView")
    @iOSXCUITFindBy(id = "Beethoven Walk")
    private WebElement selectWalkAndAudioBeethoven;

    @AndroidFindBy(id = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridView/android.view.ViewGroup[3]/android.widget.ImageView")
    @iOSXCUITFindBy(id = "Curious Museums Guide")
    private WebElement selectGuideCuriousMuseums;


    public WalksAndGuidePage goOnAWalk()  {
       filterWalksButton.click();
       return this;
    }

    public WalksAndGuidePage goOnAGuide() {
        filterGuidesButton.click();
        return this;
    }

    public WalksAndGuidePage ClickSortedByAlphabetical(){
        sortedByAlphabetical.click();
        return this;
    }


    public WalksAndGuidePage ClickSortedBy(){
        sortedBy.click();
        return this;
    }

    public void goOnAAudio() {
        filterAudioButton.click();
    }

    public WalksAndGuidePage findWalkKeywords() {
        goOnAWalk();
        swipeVertical(UP);
        List<WebElement> textFinder =driver.findElements(By.id("locationName"));
        assertEquals(textFinder.size(),5);

        boolean containsKeyWordFlag;
        boolean ResultContainsKeyWordFlag = TRUE;

        for (WebElement element: textFinder) {
            containsKeyWordFlag = element.getText().matches(".*Walk*");
            ResultContainsKeyWordFlag = ResultContainsKeyWordFlag && containsKeyWordFlag;
        }
        assertEquals(ResultContainsKeyWordFlag, TRUE);
        return this;
    }

    public WalksAndGuidePage findIfSortedByAlphabetical() {
        List<WebElement> textFinder;
        Boolean compareResult = true;

        // Swipe 5 times to iterate all Guide entries, in ios we need 5 times and id not works
        for (int i =0; i<5; i++){
            textFinder =driver.findElements(By.id("locationName"));
            List<String> strPreSorted = new ArrayList<>();
            List<String> strAfterSorted = new ArrayList<>();
            for (WebElement element: textFinder) {
                strPreSorted.add(element.getText());
                strAfterSorted.add(element.getText());
            }
            Collections.sort(strAfterSorted);
            compareResult = strPreSorted.equals(strAfterSorted) && compareResult;
            swipeVertical(UP);
        }
        assertTrue(compareResult);
        return this;
    }

    public WalksAndGuidePage findGuideKeywords() {
        goOnAGuide();

        List<WebElement> textFinder;
        Set<String> guideSet = new HashSet<>();

        boolean containsKeyWordFlag;

        // Swipe 5 times to iterate all Guide entries, in ios we need 5 times and id not works
        for (int i =0; i<5; i++){
            textFinder =driver.findElements(By.id("locationName"));
            for (WebElement element: textFinder) {
                containsKeyWordFlag = element.getText().matches(".*Guide*");
                if(containsKeyWordFlag){
                    guideSet.add(element.getText());
                }
            }
            swipeVertical(UP);
        }

        int size =  guideSet.size();
        assertEquals(size, 11);
        return this;
    }

    public WalksAndGuidePage findAudioIcon() {
        goOnAAudio();

        List<WebElement> audioIconFinder =driver.findElements(By.id("audioLabel"));
        List<WebElement> stopFinder =driver.findElements(By.id("walksStops"));

        assertEquals(audioIconFinder.size(), stopFinder.size());
        return this;
    }

    public WalksAndGuidePage testSortByIsClickable() {
        assertTrue(sortedBy.isEnabled());
        return this;
    }

}
