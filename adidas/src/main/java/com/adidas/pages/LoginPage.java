package com.adidas.pages;

import com.adidas.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage {


    @FindBy(id="login-email")
    private WebElement emailField;

    @FindBy(id="login-password")
    private WebElement passwordField;

    @FindBy( linkText="Log in")
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




    public void typeOnEmailField(String userName){
        emailField.sendKeys(userName);
        ExtentTestManager.log("Email credential typed");
    }

    public void typeOnPasswordField(String password){
        emailField.sendKeys(password);
        ExtentTestManager.log("Password credential typed");
    }

    public void clickOnLogInButton(){
        emailField.click();
        ExtentTestManager.log("Clicked on Log In Button");
    }

    public void clickJoinTheClubBtn(){
        joinTheClubBtn.click();
        ExtentTestManager.log("Join The Club Button is Clicked");
    }

    public void clickFacebookBtn(){
        faceBookLink.click();
    }

    public void clickContinueFacebookAsBtn(){
        continueFacebookAs.click();
    }

    public void  clickGoogleBtn(){
        googleLink.click();
    }

    public void  clickYahooBtn(){
        yahooLink.click();
    }





}
