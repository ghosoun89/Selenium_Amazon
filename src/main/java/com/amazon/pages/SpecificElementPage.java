package com.amazon.pages;

import com.amazon.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecificElementPage extends TestBase {
    WebDriver driver;
    public SpecificElementPage(WebDriver driver){
        this.driver = driver;
    }
    private By addToCartButton = By.id("add-to-cart-button");

    public Homepage addProductToCart(){
        driver.findElement(addToCartButton).click();
        return new Homepage(driver);
    }
}
