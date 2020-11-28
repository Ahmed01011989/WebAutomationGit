package com.adidas.data;

import org.testng.annotations.DataProvider;

public class SearchDataProviders {

    @DataProvider(name = "searchData")
    public Object[] getSearchData(){
        return  new Object[]{"Mens Shoes","Women Shoes","Kids Shoes"};
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials (){
        return  new Object[][] {{"testuser001@gmail.com","abcd1234"},{"testuser002@gmail.com","abcd1234"},{"testuser003@gmail.com","abcd1234"}};
    }
}
