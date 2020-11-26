package com.adidastest;

import com.HomePage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test
    public static void validateUserBeingAbleToClickToLogIn(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickLogIn();
    }
}
