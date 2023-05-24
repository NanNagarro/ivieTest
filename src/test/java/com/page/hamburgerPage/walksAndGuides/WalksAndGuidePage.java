package com.page.hamburgerPage.walksAndGuides;

import com.page.hamburgerPage.PageWithMenuButton;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

import static com.helpers.helperActions.Action.DIRECTION.UP;
import static com.helpers.helperActions.Action.START_HORIZONTAL.MIDDLE;
import static com.helpers.helperActions.Action.swipeVertical;
import static com.helpers.helperActions.Action.swipeVerticalToFindComponent;
import static java.lang.Boolean.TRUE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WalksAndGuidePage extends PageWithMenuButton {

    @AndroidFindBy(id ="back")
    @iOSXCUITFindBy(id = "id")
    private WebElement back;

    @AndroidFindBy(id = "spinner_item_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Top Walks\"]")
    private WebElement sortedBy;

    // TODO: 05.05.2023 sort by items id are all the same.
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Top Walks']")
    @iOSXCUITFindBy(xpath = "id")
    private WebElement sortedByTopWalks;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Alphabetical']")
    @iOSXCUITFindBy(xpath = "id")
    private WebElement sortedByAlphabetical;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='My interests']")
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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Beethoven Walk']")
    @iOSXCUITFindBy(id = "Beethoven Walk")
    private WebElement beethovenWalk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ringstrasse Walk']")
    @iOSXCUITFindBy(id = "Ringstrasse Walk")
    private WebElement ringstrasseWalk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Viennese Modernism Guide']")
    @iOSXCUITFindBy(id = "vienneseModernismGuide")
    private WebElement vienneseModernismGuide;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Curious Museums Guide']")
    @iOSXCUITFindBy(id = "Curious Museums Guide")
    private WebElement curiousMuseumsGuide;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rotes Wien Guide']")
    @iOSXCUITFindBy(id = "Curious Museums Guide")
    private WebElement redViennaGuide;

    public WalksAndGuidePage clickBackButton()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        back.click();
        return this;
    }

    public WalksAndGuidePage goOnAWalk()  {
       filterWalksButton.click();
       return this;
    }

    public WalksAndGuidePage goOnAGuide() {
        filterGuidesButton.click();
        return this;
    }

    public WalksAndGuidePage clickSortedByAlphabetical(){
        sortedByAlphabetical.click();
        return this;
    }


    public WalksAndGuidePage clickSortedBy(){
        sortedBy.click();
        return this;
    }

    public void goOnAAudio() {
        filterAudioButton.click();
    }

    public WalksAndGuidePage SelectCuriousMuseumsGuide(){
        curiousMuseumsGuide.click();
        return this;
    }

    public WalksAndGuidePage findWalkKeywords() {
        goOnAWalk();
        swipeVertical(MIDDLE,UP);
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
            swipeVertical(MIDDLE, UP);
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
            swipeVertical(MIDDLE, UP);
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

    public WalksAndGuidePage goToCuriousMuseumsGuide() {
        swipeVerticalToFindComponent(curiousMuseumsGuide);
        curiousMuseumsGuide.click();
        return this;
    }

    public WalksAndGuidePage goToRedViennaGuide() {
        swipeVerticalToFindComponent(redViennaGuide);
        redViennaGuide.click();
        return this;
    }

    public WalksAndGuidePage checkLocationNameIsDisplayed() {
        assertTrue(swipeVerticalToFindComponent(beethovenWalk));
        assertTrue(swipeVerticalToFindComponent(ringstrasseWalk));
        assertTrue(swipeVerticalToFindComponent(vienneseModernismGuide));
        return this;
    }

    public WalksAndGuidePage checkLocationNameIsDisplayedByAlphabetical() {
        assertTrue(swipeVerticalToFindComponent(beethovenWalk));
        assertTrue(swipeVerticalToFindComponent(curiousMuseumsGuide));
        assertTrue(swipeVerticalToFindComponent(vienneseModernismGuide));
        return this;
    }

}
