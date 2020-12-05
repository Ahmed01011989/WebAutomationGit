package com.adidastest;

import com.adidas.TestBase;
import com.adidas.pages.BagPage;
import com.adidas.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BagPageValidations extends TestBase {

    @Test(enabled = false)
    public static void validateUserAbleToClickBagButton(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        BagPage bagPage = PageFactory.initElements(driver, BagPage.class);
        homePage.clickOnBagPage();

    }
}
