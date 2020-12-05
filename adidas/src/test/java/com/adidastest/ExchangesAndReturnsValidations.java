package com.adidastest;

import com.adidas.TestBase;
import com.adidas.pages.ExchangesAndReturns;
import com.adidas.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExchangesAndReturnsValidations extends TestBase {

    @Test(enabled = false)
    public static void validateUserAbleToClickToExchangesAndReturns(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ExchangesAndReturns exchangesAndReturns =PageFactory.initElements(driver,ExchangesAndReturns.class);
        homePage.clickExchangesAndReturns();
        exchangesAndReturns.clickCloseAdBtn();
        exchangesAndReturns.clickFreeSizeExchange();
    }

    @Test(enabled = true)
    public static void validateUserAbleClickStartYourReturnButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ExchangesAndReturns exchangesAndReturns = PageFactory.initElements(driver, ExchangesAndReturns.class);
        homePage.clickExchangesAndReturns();
        exchangesAndReturns.clickCloseAdBtn();
        exchangesAndReturns.clickStartYourReturnBtn();
        exchangesAndReturns.validateOrderStatusPageURL();
    }



}
