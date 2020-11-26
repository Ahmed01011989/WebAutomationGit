package com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(name="reebok")
    private WebElement name;

    public void clickLogIn(){
        name.click();
    }
}
