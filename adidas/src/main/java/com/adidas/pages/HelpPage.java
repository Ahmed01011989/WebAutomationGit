package com.adidas.pages;

import com.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpPage {

    @FindBy(xpath = "(//input[@name='q'])[2]")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@class='help-search-button button-ctn adi-gradient-blue button-forward']")
    private WebElement searchButton;

    public void typeOnSearchBar(){
        searchBar.sendKeys("Can I cancel my online order?");
        ExtentTestManager.log("Keys send it to help Search bar");
    }

    public void clickOnSearchButton(){
        searchButton.click();
        ExtentTestManager.log("Clicked on Search button");
    }



}
