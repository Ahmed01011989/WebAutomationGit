package com.adidas.pages;

import com.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement logInBtn;

    @FindBy(xpath = "(//a[text()='Creators club'])[1]")
    private WebElement creatorsClubBtn;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchBar;

    @FindBy(xpath = "//input[@name= 'q']")
    private WebElement searchBtn;

    @FindBy(linkText = "SHOP MEN")
    private WebElement shopMen;


    public void clickOnLogIn() {
        logInBtn.click();
        ExtentTestManager.log("Clicked on Log in Button");
    }

    public void clickOnCreatorsClubBtn() {
        creatorsClubBtn.click();
        ExtentTestManager.log("Clicked on Creators Club Button");
    }

    public void typeOnSearchBar(String data) {
        searchBar.sendKeys(data);
        ExtentTestManager.log("Key typed on Search Bar:" + data);
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
        ExtentTestManager.log("Search Button Clicked");
    }


    public void clickOnShopMen() {
        shopMen.click();
        ExtentTestManager.log("Clicked on Shop Men page");
    }


}


