package com.adidas.pages;

import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement logInBtn;

    @FindBy(xpath = "(//a[text()='Creators club'])[1]")
    private WebElement creatorsClubBtn;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchBar;

    @FindBy(xpath = "//input[@name= 'q']")
    private WebElement searchBtn;




    public void clickOnLogIn() {
        logInBtn.click();
    }

    public void clickOnCreatorsClubBtn() {
        creatorsClubBtn.click();
        ExtentTestManager.log("Clicked on Creators Club Button");
    }

    public void typeOnSearchBar(String data){
        searchBar.sendKeys(data);
        ExtentTestManager.log("Key typed on Search Bar:"+data);
    }

    public void clickOnSearchBtn(){
        searchBtn.click();
        ExtentTestManager.log("Search Button Clicked");
    }



}


