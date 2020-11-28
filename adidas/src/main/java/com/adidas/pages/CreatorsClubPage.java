package com.adidas.pages;

import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatorsClubPage {

    @FindBy(xpath = "(//a[@class='gl-cta gl-cta--primary'])[1]")
    private WebElement joinForFreeBtn;

    @FindBy(id="registration-firstname-field")
    private WebElement firstName;

    @FindBy(id="registration-lastname-field")
    private WebElement lastNameField;

    @FindBy(xpath = "//span[text()='Male']")
    private WebElement chooseGender;




    public void clickJoinForFreeBtn(){
        joinForFreeBtn.click();
    }

    public void typeOnFirstNameField(){
        firstName.sendKeys("Ansar");
        ExtentTestManager.log("First name is Displayed");
    }

    public void typeOnLastNameField(){
        lastNameField.sendKeys("Rakhmankulov");
        ExtentTestManager.log("Lastname is Displayed");
    }

    public void clickOnGenderBtn(){
        chooseGender.click();
        ExtentTestManager.log("Clicked on Gender Circle");
    }
}
