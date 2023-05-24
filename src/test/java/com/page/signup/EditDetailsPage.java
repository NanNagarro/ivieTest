package com.page.signup;

import com.page.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class EditDetailsPage extends BasePage {

    @AndroidFindBy(id = "backButton")
    @iOSXCUITFindBy(id = "id")
    private WebElement backButton;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "id")
    private WebElement name;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "id")
    private WebElement surName;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "id")
    private WebElement country;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "id")
    private WebElement gender;

    @AndroidFindBy(id = "id")
    @iOSXCUITFindBy(id = "id")
    private WebElement ageRange;

    @AndroidFindBy(id = "saveBtn")
    @iOSXCUITFindBy(id = "id")
    private WebElement saveButton;

    public UserProfilePage clickSaveButton(){
        saveButton.click();
        return new UserProfilePage();
    }
}
