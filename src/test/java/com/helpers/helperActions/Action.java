package com.helpers.helperActions;

import com.page.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static java.util.Collections.singletonList;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;


public class Action extends BasePage {

    public enum Direction {
        LEFT,
        RIGHT,
        // UP ,DOWN
    }

    private static Dimension screenSize = null;


    public static void swipeInsideHorizontalAction(WebElement  element , Direction direction) {
        Dimension elementDimension = element.getSize();
        int elementWidth = elementDimension.getWidth();

        Point elementLocation = element.getLocation();
        int elementY = elementLocation.getY();

        Point pointOptionStart= new Point(0, 0);
        Point pointOptionEnd = new Point(0, 0);

        if (direction == Direction.LEFT){
            pointOptionStart.x = (int)(elementWidth * 0.9);
            pointOptionEnd.x = (int)(elementWidth * 0.1);
        }
        else {
            pointOptionStart.x = (int)(elementWidth * 0.1);
            pointOptionEnd.x = (int)(elementWidth * 0.9);
        }
        pointOptionStart.y = elementY;
        pointOptionEnd.y = elementY;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(ofMillis(0), viewport(), pointOptionStart.getX(), pointOptionStart.getY()))
                .addAction(finger.createPointerDown(LEFT.asArg()))
                .addAction(finger.createPointerMove(ofMillis(500), viewport(), pointOptionEnd.getX(), pointOptionEnd.getY()))
                .addAction(finger.createPointerUp(LEFT.asArg()));
        driver.perform(singletonList(swipe));
    }

    public static void swipeOutsideHorizontalAction(WebElement  element , Direction direction , int percentage) {
        Point elementLocation = element.getLocation();
        int elementX = elementLocation.getX();
        int elementY = elementLocation.getY();

        int screenWidth = getScreenSize().width;

        Point pointOptionStart= new Point(elementX, elementY);
        Point pointOptionEnd = new Point(0, 0);

        if (direction == Direction.LEFT){
            pointOptionEnd.x = pointOptionEnd.x -  (percentage/100*screenWidth) ;
        }
        else {
            pointOptionEnd.x =  pointOptionEnd.x + (percentage/100*screenWidth);
        }


        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(ofMillis(0), viewport(), pointOptionStart.getX(), pointOptionStart.getY()))
                .addAction(finger.createPointerDown(LEFT.asArg()))
                .addAction(finger.createPointerMove(ofSeconds(1), viewport(), pointOptionEnd.getX(), pointOptionEnd.getY()))
                .addAction(finger.createPointerUp(LEFT.asArg()));
        driver.perform(singletonList(swipe));
    }



    public static Dimension getScreenSize() {
        if (screenSize == null) {
            screenSize = driver.manage().window().getSize();
        }
        return screenSize;
    }

    // TODO: 08.05.2023 Maybe change to swipe up,down to one function? scroll not works with 4.8 version
    public static void swipeUp(Boolean partialFlag) {
        Dimension windowSize = getScreenSize();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
        Sequence swipe = new Sequence(finger, 1);

        if(partialFlag){
            swipe.addAction(
                            finger.createPointerMove(
                                    ofSeconds(0), viewport(), windowSize.getWidth()/2 ,  windowSize.getHeight()/ 8 * 7))
                    .addAction(finger.createPointerDown(LEFT.asArg()))
                    .addAction(new Pause(finger, ofMillis(500)))
                    .addAction(finger.createPointerMove(
                            ofSeconds(2), viewport(), windowSize.getWidth()/2, windowSize.getHeight()/ 8 * 3))
                    .addAction(finger.createPointerUp(LEFT.asArg()));
        }
        else {
            swipe.addAction(
                            finger.createPointerMove(
                                    ofSeconds(0), viewport(), windowSize.getWidth()/2 ,  windowSize.getHeight()/ 8 * 7))
                    .addAction(finger.createPointerDown(LEFT.asArg()))
                    .addAction(new Pause(finger, ofMillis(500)))
                    .addAction(finger.createPointerMove(
                            ofSeconds(2), viewport(), windowSize.getWidth()/2, windowSize.getHeight()/ 8 * 1))
                    .addAction(finger.createPointerUp(LEFT.asArg()));
        }
        driver.perform(singletonList(swipe));

    }

    public static void swipeUpOut(WebElement webElement) {
        int xStart = webElement.getLocation().x;
        int yStart = webElement.getLocation().y;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(
                        finger.createPointerMove(
                                ofSeconds(0), viewport(), xStart ,  yStart)
                )
                .addAction(finger.createPointerDown(LEFT.asArg()))
                .addAction(new Pause(finger, ofMillis(500)))
                .addAction(finger.createPointerMove(
                        ofMillis(200), viewport(), xStart,yStart - getScreenSize().getWidth()/6))
                .addAction(finger.createPointerUp(LEFT.asArg()));
        driver.perform(singletonList(swipe));

    }
}
