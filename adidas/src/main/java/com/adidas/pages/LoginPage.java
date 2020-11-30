package com.adidas.pages;

import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    @FindBy(id = "login-email")
    private WebElement emailField;

    @FindBy(id = "login-password")
    private WebElement passwordField;

    @FindBy(linkText = "Log in")
    private WebElement logInButton;

    @FindBy(linkText = "JOIN THE CLUB")
    private WebElement joinTheClubBtn;

    @FindBy(linkText = "facebook")
    private WebElement faceBookLink;

    @FindBy(xpath = "//span[text()='facebook']")
    private WebElement continueFacebookAs;

    @FindBy(linkText = "google")
    private WebElement googleLink;

    @FindBy(linkText = "yahoo")
    private WebElement yahooLink;

    @FindBy(xpath = "//span[text()='SIGN UP FOR FREE']")
    private WebElement signUpForFreeBtn;

    @FindBy(id = "registration-email-field")
    private WebElement emailFieldSignUpForFree;

    @FindBy(id = "registration-password-field")
    private WebElement passwordFieldSignUpForFree;

    @FindBy(id = "minimalRegistration-registration-ageconfirmation-field")
    private WebElement checkBoxFieldSignUpForFree;

    @FindBy(linkText = " Register")
    private WebElement clickOnSignUpForFreeButton;


    public void typeOnEmailField(String userName) {
        emailField.sendKeys(userName);
        ExtentTestManager.log("Email credential typed");
    }

    public void typeOnPasswordField(String password) {
        emailField.sendKeys(password);
        ExtentTestManager.log("Password credential typed");
    }

    public void clickOnLogInButton() {
        emailField.click();
        ExtentTestManager.log("Clicked on Log In Button");
    }

    public void clickJoinTheClubBtn() {
        joinTheClubBtn.click();
        ExtentTestManager.log("Join The Club Button is Clicked");
    }

    public void clickFacebookBtn() {
        faceBookLink.click();
    }

    public void clickContinueFacebookAsBtn() {
        continueFacebookAs.click();
    }

    public void clickGoogleBtn() {
        googleLink.click();
    }

    public void clickYahooBtn() {
        yahooLink.click();
    }

    public void clickOnSignUpForFreeBtn() {
        signUpForFreeBtn.click();
        ExtentTestManager.log("Clicked on  SIGN UP FOR FREE Button");
    }

    public void typeOnEmailFieldOnSignUpForFreeBtn() {
        emailFieldSignUpForFree.sendKeys("testEmail@gmail.com");
        ExtentTestManager.log("Typed on Email Field SIGN UP FOR FREE Button");
    }


    public void typeOnPasswordFieldOnSignUpForFreeBtn() {
        passwordFieldSignUpForFree.sendKeys("testPassword");
        ExtentTestManager.log("Typed on Password  Field SIGN UP FOR FREE Button");
    }

    public void clickOnCheckBoxFieldOnSignUpForFreeBtn() {
        checkBoxFieldSignUpForFree.click();
        ExtentTestManager.log("Clicked on Check Box");
    }

    public void clickOnSignUpForFreeButton() {
        clickOnSignUpForFreeButton.click();
        ExtentTestManager.log("Clicked on SIGN UP FOR FREE Button");
    }


}
