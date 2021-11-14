package com.amazon.pages;

import com.amazon.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends TestBase {
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    private By selectedProduct = By.cssSelector(".sc-list-item");

    public String getSelectedProductValue(){
        return driver.findElement(selectedProduct).getAttribute("data-asin");
    }
}
