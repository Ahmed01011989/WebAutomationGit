package com.adidas.pages;

import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.xml.xpath.XPath;

public class ShopMenPage {

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement closeAdd;

    @FindBy(xpath = "//span[@class='gl-label gl-label--l gl-label--bold']")
    private WebElement gender;

    @FindBy(xpath = "//input[@name='Men']")
    private WebElement checkBox;

    @FindBy(xpath = "(//div[@class='gl-product-card__details'])[1]")
    private WebElement stanSmithShoes;

    @FindBy(xpath ="")
    private WebElement size;

    @FindBy(xpath = "//button[@class='gl-cta gl-cta--primary gl-cta--full-width']")
    private WebElement sizeAddToBag;

    //input[@name='Men']

    public void closeAddButton(){
        closeAdd.click();
        ExtentTestManager.log("Add closed");
    }

    public void dropDownGenderBtn(){
        gender.click();
        ExtentTestManager.log("Clicked Gender button");
    }

    public void chooseCheckBox(){
        gender.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(checkBox.isSelected());
        ExtentTestManager.log("Clicked on Check Box");
        softAssert.assertAll();
    }

    public void clickStanSmithShoes(){
        stanSmithShoes.click();
        Assert.assertTrue(stanSmithShoes.isDisplayed());
        ExtentTestManager.log("Clicked on Stan Smith Shoes");
    }

    public void selectSizeAndAddToBag(){

        size.click();
        ExtentTestManager.log("Clicked on Size");

    }

}
