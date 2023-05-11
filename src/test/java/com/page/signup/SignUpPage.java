package com.page.signup;

import com.page.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    @AndroidFindBy(id = "Register")
    @iOSXCUITFindBy(id = "")
    private WebElement register;

    @AndroidFindBy(id = "email_edit_text")
    @iOSXCUITFindBy(id = "")
    private WebElement email_edit_text;

    @AndroidFindBy(id = "password_edit_text")
    @iOSXCUITFindBy(id = "")
    private WebElement password_edit_text;

    @AndroidFindBy(id = "login_btn")
    @iOSXCUITFindBy(id = "")
    private WebElement login_btn;

    @AndroidFindBy(id = "show_hide_password_button")
    @iOSXCUITFindBy(id = "")
    private WebElement show_hide_password_button;

    @AndroidFindBy(id = "forgot_password_btn")
    @iOSXCUITFindBy(id = "")
    private WebElement forgot_password_btn;

    @AndroidFindBy(id = "facebook_btn")
    @iOSXCUITFindBy(id = "")
    private WebElement facebook_btn;

    @AndroidFindBy(id = "google_btn")
    @iOSXCUITFindBy(id = "")
    private WebElement google_btn;

    public SignUpPage inputEmail(String email)  {
        email_edit_text.sendKeys(email);
        return this;
    }

    public SignUpPage inputPassword(String password)  {
        password_edit_text.sendKeys(password);
        return this;
    }

    public SignUpPage login()  {
        login_btn.click();
        return this;
    }

    public BasePage facebookLogin() {
        facebook_btn.click();
        return this;
    }

    public  BasePage googleLogin() {
        google_btn.click();
        return this;
    }

}
