package com.page.HamburgerMenu;


import com.page.util.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    @AndroidFindBy(id = "email_edit_text")
    @iOSXCUITFindBy(id = "")
    private WebElement email_edit_text;

    @AndroidFindBy(id = "password_edit_text")
    @iOSXCUITFindBy(id = "")
    private WebElement password_edit_text;

    @AndroidFindBy(id = "login_btn")
    @iOSXCUITFindBy(id = "")
    private WebElement login_btn;

    @AndroidFindBy(id = "facebook_btn")
    @iOSXCUITFindBy(id = "")
    private WebElement facebook_btn;

    @AndroidFindBy(id = "google_btn")
    @iOSXCUITFindBy(id = "")
    private WebElement google_btn;

    public SignUpPage inputEmail()  {
        email_edit_text.sendKeys("test@abc.com");
        return this;
    }

    public SignUpPage inputPassword()  {
        password_edit_text.sendKeys("abc");
        return this;
    }

    public SignUpPage login()  {
        email_edit_text.click();
        return this;
    }

    public BasePage facebookLogin() throws InterruptedException {
        facebook_btn.click();
        Thread.sleep(100000);
        return this;
    }

    public  BasePage googleLogin() throws InterruptedException {
        google_btn.click();
        Thread.sleep(100000);
        return this;
    }

}
