package com.util.init;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Action extends MobileDriverInit {
    public static void swipeToLeftAction(WebElement  element) throws InterruptedException {
        Thread.sleep(10000);

        Dimension elementLocation = element.getSize();
        int elementWidth = elementLocation.getWidth();
        int elementHeight = elementLocation.getHeight();

        Point pointOptionStart = new Point(0, 0);
        pointOptionStart.x = (int)(elementWidth * 0.9);
        System.out.println("pointOptionStart startPointX:" + pointOptionStart.x);
        pointOptionStart.y = elementHeight;
        System.out.println("pointOptionStart height:" + pointOptionStart.y);

        Point pointOptionEnd = new Point(0, 0);
        pointOptionEnd.x = (int)(elementWidth * 0.1);
        pointOptionEnd.y = elementHeight;
        System.out.println("pointOptionEnd startPointX:" + pointOptionEnd.x);
        System.out.println("pointOptionEnd height:" + pointOptionEnd.y);

        TouchAction swipe = new TouchAction(driver);
        swipe.longPress(pointOptionStart.x, pointOptionStart.y)
                .moveTo(pointOptionEnd.x, pointOptionEnd.y).release();

        MultiTouchAction multiAction = new MultiTouchAction(driver);
        multiAction.add(swipe).perform();
    }
}
