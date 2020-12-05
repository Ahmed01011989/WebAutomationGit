package com.adidas.pages;

import com.adidas.TestBase;
import com.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ExchangesAndReturns {

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement closeButton;

    @FindBy(linkText = "FREE SIZE EXCHANGE")
    private WebElement freeSizeExchange;

    @FindBy(xpath = "//h3[text()='Order status']")
    private WebElement orderStatus;

    @FindBy(linkText = "START YOUR RETURN")
    private WebElement startYourReturn;

    @FindBy(xpath = "//h3[text()='Order status']")
    private WebElement checkURL;

    @FindBy(xpath = "//input[@name='orderNo']")
    private WebElement orderNumber;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@class='gl-cta gl-cta--primary order-tracker__submit___4cre-']")
    private WebElement findOrderButton;

    public void clickCloseAdBtn() {
        Assert.assertTrue(closeButton.isDisplayed());
        ExtentTestManager.log("Add page is Displayed");
        closeButton.click();
        ExtentTestManager.log("Add page is Closed");
    }

    public void clickFreeSizeExchange() {
        Assert.assertTrue(freeSizeExchange.isDisplayed());
        ExtentTestManager.log("FREE SIZE EXCHANGE page is Displayed");
        freeSizeExchange.click();
        ExtentTestManager.log("Clicked on FREE SIZE EXCHANGE button");

        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.adidas.com/us/order-tracker";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated :" + actualURL);
    }

    public void clickStartYourReturnBtn() {
        startYourReturn.click();
        ExtentTestManager.log("Clicked on Start Your Return button");

    }

    public void typeOrderNumber() {
        orderNumber.sendKeys("adidas 10");
        ExtentTestManager.log("key typed to Order Number box");
        Assert.assertTrue(orderNumber.isDisplayed());
        ExtentTestManager.log("Order Number page is Displayed");
    }
    public void typeOnEmailField() {
       emailField.sendKeys("test@gmail.com");
        ExtentTestManager.log("Typed on Email field");
        Assert.assertTrue(emailField.isDisplayed());
        ExtentTestManager.log("Email page is Displayed");
    }

    public void validateFindOrderButton() {
        findOrderButton.click();
        ExtentTestManager.log("Clicked on Find Order Butten");
        Assert.assertTrue(emailField.isDisplayed());
        ExtentTestManager.log("Email page is Displayed");
    }






}
