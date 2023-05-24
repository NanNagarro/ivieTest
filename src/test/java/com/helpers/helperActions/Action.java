package com.helpers.helperActions;

import com.page.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import static com.helpers.helperActions.Action.DIRECTION.UP;
import static com.helpers.helperActions.Action.START_HORIZONTAL.MIDDLE;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static java.util.Collections.singletonList;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;


public class Action extends BasePage {

    public enum DIRECTION {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }

    public enum START_HORIZONTAL {
        LEFT,
        RIGHT,
        MIDDLE
    }

    private static Dimension screenSize = null;

    public static void swipeInsideHorizontalAction(WebElement container, WebElement webElement, DIRECTION direction) {
        Dimension elementDimension = container.getSize();
        int elementWidth = elementDimension.getWidth();

        Point elementLocation = container.getLocation();
        int elementY = elementLocation.getY();

        Point pointOptionStart = new Point(0, 0);
        Point pointOptionEnd = new Point(0, 0);

        if (direction == DIRECTION.LEFT) {
            pointOptionStart.x = (int) (elementWidth * 0.9);
            pointOptionEnd.x = (int) (elementWidth * 0.1);
        } else {
            pointOptionStart.x = (int) (elementWidth * 0.1);
            pointOptionEnd.x = (int) (elementWidth * 0.9);
        }
        pointOptionStart.y = elementY;
        pointOptionEnd.y = elementY;

        boolean componentIsDisplayed = isElementDisplayed(webElement);
        if (!componentIsDisplayed) {
            do {
                PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
                Sequence swipe = new Sequence(finger, 1);
                swipe.addAction(finger.createPointerMove(ofMillis(0), viewport(), pointOptionStart.getX(), pointOptionStart.getY()))
                        .addAction(finger.createPointerDown(LEFT.asArg()))
                        .addAction(finger.createPointerMove(ofMillis(500), viewport(), pointOptionEnd.getX(), pointOptionEnd.getY()))
                        .addAction(finger.createPointerUp(LEFT.asArg()));
                driver.perform(singletonList(swipe));
                componentIsDisplayed = isElementDisplayed(webElement);
            } while (!componentIsDisplayed);
        }
    }

    public static boolean isElementDisplayed(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void swipeInsideHorizontalAction(WebElement container, DIRECTION direction) {
        Dimension elementDimension = container.getSize();
        int elementWidth = elementDimension.getWidth();

        Point elementLocation = container.getLocation();
        int elementY = elementLocation.getY();

        Point pointOptionStart = new Point(0, 0);
        Point pointOptionEnd = new Point(0, 0);

        if (direction == DIRECTION.LEFT) {
            pointOptionStart.x = (int) (elementWidth * 0.9);
            pointOptionEnd.x = (int) (elementWidth * 0.1);
        } else {
            pointOptionStart.x = (int) (elementWidth * 0.1);
            pointOptionEnd.x = (int) (elementWidth * 0.9);
        }
        pointOptionStart.y = elementY;
        pointOptionEnd.y = elementY;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(ofMillis(0), viewport(), pointOptionStart.getX(), pointOptionStart.getY()))
                .addAction(finger.createPointerDown(LEFT.asArg()))
                .addAction(finger.createPointerMove(ofMillis(500), viewport(), pointOptionEnd.getX(), pointOptionEnd.getY()))
                .addAction(finger.createPointerUp(LEFT.asArg()));
        driver.perform(singletonList(swipe));

    }

    public static Dimension getScreenSize() {
        if (screenSize == null) {
            screenSize = driver.manage().window().getSize();
        }
        return screenSize;
    }

    public static void swipeVertical(START_HORIZONTAL startX, DIRECTION direction) {
        Dimension windowSize = getScreenSize();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);
        int startXCoordinate = 0;
        int width = windowSize.getWidth();

        switch (startX) {
            case LEFT:
                startXCoordinate = width / 3;
                break;

            case RIGHT:
                startXCoordinate = width / 3 * 2;
                break;

            case MIDDLE:
                startXCoordinate = width / 2;
                break;

        }

        switch (direction) {
            case UP: {
                swipe.addAction(
                                finger.createPointerMove(
                                        ofSeconds(0), viewport(), startXCoordinate, windowSize.getHeight() / 8 * 7))
                        .addAction(finger.createPointerDown(LEFT.asArg()))
                        .addAction(new Pause(finger, ofMillis(500)))
                        .addAction(finger.createPointerMove(
                                ofSeconds(2), viewport(), startXCoordinate, windowSize.getHeight() / 8 * 3))
                        .addAction(finger.createPointerUp(LEFT.asArg()));
                break;
            }
            case DOWN: {
                swipe.addAction(
                                finger.createPointerMove(
                                        ofSeconds(0), viewport(), windowSize.getWidth() / 2, windowSize.getHeight() / 8 * 3))
                        .addAction(finger.createPointerDown(LEFT.asArg()))
                        .addAction(new Pause(finger, ofMillis(500)))
                        .addAction(finger.createPointerMove(
                                ofSeconds(2), viewport(), windowSize.getWidth() / 2, windowSize.getHeight() / 8 * 7))
                        .addAction(finger.createPointerUp(LEFT.asArg()));
                break;
            }
        }
        driver.perform(singletonList(swipe));

    }

    public static void swipeVerticalWithElement(WebElement webElement, DIRECTION direction) {
        int xStart = webElement.getLocation().x;
        int yStart = webElement.getLocation().y;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        switch (direction) {
            case UP: {
                swipe.addAction(
                                finger.createPointerMove(
                                        ofSeconds(0), viewport(), xStart, yStart)
                        )
                        .addAction(finger.createPointerDown(LEFT.asArg()))
                        .addAction(new Pause(finger, ofMillis(500)))
                        .addAction(finger.createPointerMove(
                                ofMillis(200), viewport(), xStart, yStart - getScreenSize().getWidth() / 4))
                        .addAction(finger.createPointerUp(LEFT.asArg()));
                break;
            }
            case DOWN: {
                swipe.addAction(
                                finger.createPointerMove(
                                        ofSeconds(0), viewport(), xStart, yStart)
                        )
                        .addAction(finger.createPointerDown(LEFT.asArg()))
                        .addAction(new Pause(finger, ofMillis(500)))
                        .addAction(finger.createPointerMove(
                                ofMillis(200), viewport(), xStart, yStart + getScreenSize().getWidth() / 4))
                        .addAction(finger.createPointerUp(LEFT.asArg()));
                break;
            }

        }
        driver.perform(singletonList(swipe));
    }

    public static void clickScreen(int xPercentage, int yPercentage) {
        Dimension dimension = getScreenSize();
        int x = dimension.getWidth() * xPercentage / 100;
        int y = dimension.getHeight() * yPercentage / 100;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tapSeq = new Sequence(finger, 1);
        tapSeq.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), x, y));
        tapSeq.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tapSeq.addAction(finger.createPointerMove(ofMillis(50),
                PointerInput.Origin.viewport(), x, y));
        tapSeq.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(singletonList(tapSeq));
    }

    public static Boolean swipeVerticalToFindComponent(WebElement webElement) {
        boolean componentIsDisplayed = isElementDisplayed(webElement);
        int count = 0;
        if (!componentIsDisplayed) {
            do {
                swipeVertical(MIDDLE, UP);
                count++;
                if (count>10){
                    break;
                }
                componentIsDisplayed = isElementDisplayed(webElement);
            } while (!componentIsDisplayed);
        }
        return  componentIsDisplayed;
    }

}
