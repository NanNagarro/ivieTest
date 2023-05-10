package com.page.HamburgerMenu;

import com.page.util.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.util.helpers.Action.swipeUp;
import static java.lang.Boolean.TRUE;
import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WalksAndGuidePage extends BasePage {

    @AndroidFindBy(id = "spinner_item_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Top Walks\"]")
    private WebElement sortedBy;

    // TODO: 05.05.2023 sort by items id are all the same.
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    @iOSXCUITFindBy(xpath = "")
    private WebElement sortedByTopWalks;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    @iOSXCUITFindBy(xpath = "")
    private WebElement sortedByAlphabetical;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    @iOSXCUITFindBy(xpath = "")
    private WebElement sortedByMyInterests;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]")
    @iOSXCUITFindBy(id = "Walks")
    private WebElement filterWalksButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[3]")
    @iOSXCUITFindBy(id = "Guides")
    private WebElement filterGuidesButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[4]")
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

    public void goOnAAudio() {
        filterAudioButton.click();
    }

    public WalksAndGuidePage findWalkKeywords() {
        goOnAWalk();
        swipeUp(TRUE);
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

    public WalksAndGuidePage findGuideKeywords() {
        goOnAGuide();

        List<WebElement> textFinder;
        Set<String> guideSet = new HashSet<>();

        boolean ResultContainsKeyWordFlag = TRUE;
        boolean containsKeyWordFlag;

        // Swipe 5 times to iterate all Guide entries
        for (int i =0; i<4; i++){
            textFinder =driver.findElements(By.id("locationName"));
            for (WebElement element: textFinder) {
                containsKeyWordFlag = element.getText().matches(".*Guide*");
                if(containsKeyWordFlag){
                    guideSet.add(element.getText());
                }
            }
            swipeUp(TRUE);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
