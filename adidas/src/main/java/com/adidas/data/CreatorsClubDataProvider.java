package com.adidas.data;

import org.testng.annotations.DataProvider;

public class CreatorsClubDataProvider {
    @DataProvider(name = "dataCredentials")
    public Object[][] getCreatorsClubData() {
        return new Object[][]{{"Ansar"}, {"Rakhmankulov"}, {"ansarjon1989@gmail.com"}};
    }

}
