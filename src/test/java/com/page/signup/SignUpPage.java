package com.page.signup;

import com.page.BasePage;
import com.page.hamburgerPage.PageWithMenuButton;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import static com.helpers.helperActions.Action.DIRECTION.UP;
import static com.helpers.helperActions.Action.START_HORIZONTAL.LEFT;
import static com.helpers.helperActions.Action.swipeVertical;

public class SignUpPage extends PageWithMenuButton {

    @AndroidFindBy(id = "Register")
    @iOSXCUITFindBy(id = "id")
    private WebElement register;

    @AndroidFindBy(id = "email_edit_text")
    @iOSXCUITFindBy(id = "id")
    private WebElement email_edit_text;

    @AndroidFindBy(id = "password_edit_text")
    @iOSXCUITFindBy(id = "id")
    private WebElement password_edit_text;

    @AndroidFindBy(id = "login_btn")
    @iOSXCUITFindBy(id = "id")
    private WebElement login_btn;

    @AndroidFindBy(id = "show_hide_password_button")
    @iOSXCUITFindBy(id = "id")
    private WebElement show_hide_password_button;

    @AndroidFindBy(id = "forgot_password_btn")
    @iOSXCUITFindBy(id = "id")
    private WebElement forgot_password_btn;

    @AndroidFindBy(id = "facebook_btn")
    @iOSXCUITFindBy(id = "id")
    private WebElement facebook_btn;

    @AndroidFindBy(id = "google_btn")
    @iOSXCUITFindBy(id = "id")
    private WebElement google_btn;

    @AndroidFindBy(id = "com.google.android.gms:id/container")
    @iOSXCUITFindBy(id = "id")
    private WebElement googleAccount;

    public SignUpPage inputEmail(String email)  {
        email_edit_text.sendKeys(email);
        return this;
    }

    public SignUpPage inputPassword(String password)  {
        password_edit_text.sendKeys(password);
        return this;
    }

    public UserProfilePage login()  {
        login_btn.click();
        return new UserProfilePage();
    }

    public BasePage facebookLogin() {
        facebook_btn.click();
        return this;
    }

    public SignUpPage googleLogin() {
        swipeVertical(LEFT, UP);
        google_btn.click();
        return this;
    }

    public UserProfilePage selectGoogleAccount() {
        googleAccount.click();
        return new UserProfilePage();
    }

}
