import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumTest{

    AppiumDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "RFCR310WZXT");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("automationName", "Uiautomator2");
        capabilities.setCapability("app", "C:\\Software\\apk\\app-debug.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test
    public void testLogin() throws MalformedURLException {
        String androidID="animation_view";
        String IosID="animation_view";

        //WebElement element = driver.findElement(By.id("at.vienna.ivie.dev:id/animation_view"));
        swipeToLeftAction(androidID);
        swipeToLeftAction(androidID);
        swipeToLeftAction(androidID);
    }

    public void swipeToLeftAction(String entireScreenID) {
        WebElement element = driver.findElementById(entireScreenID);

//        Dimension dimensions = driver.manage().window().getSize();
//        int screenWidth = dimensions.getWidth();
//        int screenHeight = dimensions.getHeight();

        Dimension elementLocation = element.getSize();
        int elementWidth = elementLocation.getWidth();
        int elementHeight = elementLocation.getHeight();


        int startLocationX = (int) (elementWidth*0.9);
        int startLocationY = elementHeight;

        int endLocationX = (int) (elementWidth*0.10);
        int endLocationY = elementHeight;


        Point pointOptionStart = new Point(0, 0);
        pointOptionStart.x = startLocationX;
        System.out.println("pointOptionStart startPointX:" + pointOptionStart.x);
        pointOptionStart.y = startLocationY;
        System.out.println("pointOptionStart height:" + pointOptionStart.y);

        Point pointOptionEnd = new Point(0, 0);
        pointOptionEnd.x = endLocationX;
        pointOptionEnd.y = endLocationY;
        System.out.println("pointOptionEnd startPointX:" + pointOptionEnd.x);
        System.out.println("pointOptionEnd height:" + pointOptionEnd.y);

        TouchAction swipe = new TouchAction(driver);
        swipe.press(pointOptionStart.x, pointOptionStart.y)
                .moveTo(pointOptionEnd.x, pointOptionEnd.y).release();

        MultiTouchAction multiAction = new MultiTouchAction(driver);
        multiAction.add(swipe).perform();

    }

}
