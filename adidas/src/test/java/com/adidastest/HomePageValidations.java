package com.adidastest;

import com.adidas.TestBase;
import com.adidas.data.SearchDataProviders;
import com.adidas.pages.CreatorsClubPage;
import com.adidas.pages.HomePage;
import com.adidas.pages.LoginPage;
import com.adidas.pages.ShopMenPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {


    @Test(dataProviderClass = SearchDataProviders.class, dataProvider = "searchData")
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

    @Test(groups = "regression")
    public void validateUserBeingAbleLoginAndSignInUpForFreeButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.clickOnLogIn();
        loginPage.clickOnSignUpForFreeBtn();
        loginPage.typeOnEmailFieldOnSignUpForFreeBtn();
        loginPage.typeOnPasswordFieldOnSignUpForFreeBtn();
        loginPage.clickOnCheckBoxFieldOnSignUpForFreeBtn();
    }

    @Test(dataProviderClass = CreatorsClubPage.class, dataProvider = "dataCredentials", enabled = false)
    public void validateUserBeingAbleToClickCreatorsClubButton(String firstName, String lastName, String email) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CreatorsClubPage creatorsClubPage = PageFactory.initElements(driver, CreatorsClubPage.class);

        homePage.clickOnCreatorsClubBtn();
        creatorsClubPage.validateCloseButton();
        creatorsClubPage.clickJoinForFreeBtn();
        //creatorsClubPage.typeOnFirstNameField(firstName);
        // creatorsClubPage.typeOnLastNameField(lastName);
        // creatorsClubPage.clickOnGenderBtn();

    }

    @Test(groups = "smoke")
    public void validateUserBeingAbleToClickShopMenPage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ShopMenPage shopMenPage = PageFactory.initElements(driver, ShopMenPage.class);
        homePage.clickOnShopMen();
        shopMenPage.closeAddButton();
        shopMenPage.dropDownGenderBtn();
        shopMenPage.chooseCheckBox();
        shopMenPage.clickStanSmithShoes();
        //shopMenPage.selectSizeAndAddToBag();

    }


}
