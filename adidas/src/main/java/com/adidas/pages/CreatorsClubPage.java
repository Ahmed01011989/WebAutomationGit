package com.adidas.pages;

import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CreatorsClubPage {

    @FindBy(xpath = "//button[@aria-label=\"Close\"]")
    private WebElement closeBtn;

    @FindBy(xpath = "//span[text()='JOIN FOR FREE'])[1]")
    private WebElement joinForFreeBtn;

    @FindBy(xpath = "//input[@aria-labelledby='registration-firstname-field_label']")
    private WebElement firstNameField;


    @FindBy(id = "registration-lastname-field")
    private WebElement lastNameField;

    @FindBy(xpath = "//span[text()='Male']")
    private WebElement chooseGender;


    public void validateCloseButton() {
        closeBtn.click();
        ExtentTestManager.log("Pup up page is closed");
    }


    public void clickJoinForFreeBtn() {
        joinForFreeBtn.click();
        Assert.assertTrue(joinForFreeBtn.isDisplayed());
        ExtentTestManager.log("Clicked Join For Free button");
    }

    public void typeOnFirstNameField(String firstName) {
        lastNameField.sendKeys(firstName);
        ExtentTestManager.log("First name is Displayed");
    }

    public void typeOnLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
        String actualData = lastNameField.getAttribute("value");
        String expectedData = "Last Name";

        Assert.assertEquals(actualData, expectedData);
        Assert.assertTrue(lastNameField.isDisplayed());
        ExtentTestManager.log("Lastname is Displayed");
    }

    public void clickOnGenderBtn() {
        chooseGender.click();
        ExtentTestManager.log("Clicked on Gender Circle");
    }


}
