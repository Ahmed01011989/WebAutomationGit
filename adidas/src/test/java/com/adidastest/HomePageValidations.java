package com.adidastest;

import com.adidas.data.SearchDataProviders;
import com.adidas.pages.HomePage;
import com.adidas.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.adidas.pages.LoginPage;

public class HomePageValidations extends TestBase {

    private static Logger LOGGER = Logger.getLogger(HomePageValidations.class);

    @Test(dataProviderClass = SearchDataProviders.class, dataProvider = "searchData",enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.clickOnSearchBtn();

    }

    @Test(dataProviderClass = SearchDataProviders.class, dataProvider = "credentials")
    public void validateUserBeingAbleLogin(String userName, String password) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.clickOnLogIn();
        loginPage.typeOnEmailField(userName);
        loginPage.typeOnPasswordField(password);
        loginPage.clickOnLogInButton();

    }

    @Test(enabled = false)
    public void validateUserBeingAbleLoginWithOtherWebSitesCredentials() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    }


}
