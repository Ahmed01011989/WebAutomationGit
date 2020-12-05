package com.adidastest;

import com.adidas.TestBase;
import com.adidas.pages.HelpPage;
import com.adidas.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HelpPageValidations extends TestBase {

    @Test(enabled = false)
    public static void validateUserAbleToClickHelpPage(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateHelpButton();
    }

    @Test
    public static void validateUserAbleToTypeOnSerachBar(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        homePage.validateHelpButton();
        helpPage.typeOnSearchBar();
        helpPage.clickOnSearchButton();
    }
}
