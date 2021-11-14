package com.amazon.testcases;

import com.amazon.base.TestBase;
import com.amazon.pages.CartPage;
import com.amazon.pages.ResultPage;
import com.amazon.pages.SpecificElementPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    public HomePageTest(){
        super();
    }
    ResultPage resultPage;
    SpecificElementPage specificElementPage;
    CartPage cartPage;

    @Test
    public void searchProductTest(){
         resultPage = homepage.searchForProduct("watch for men");
         String productBeforeAddToCartValue = resultPage.getAttributeValue();
         specificElementPage = resultPage.selectProduct(0);
         homepage = specificElementPage.addProductToCart();
         String productInCart = homepage.getValue();
        Assert.assertEquals(productInCart, "1");
        cartPage = homepage.clickOnCart();
        String productAfterSelectValue = cartPage.getSelectedProductValue();
        Assert.assertEquals(productBeforeAddToCartValue, productAfterSelectValue);
    }
}
