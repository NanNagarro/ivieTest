import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumBaseTest {

    protected AppiumDriver driver;

    @BeforeClass
    public void setupAppium() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "RFCR310WZXT");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", " at.vienna.ivie.dev");
        capabilities.setCapability("appActivity", "com.example.app.MainActivity");
        capabilities.setCapability("noReset", "true");

        URL serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(serverUrl, capabilities);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDownAppium() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}
