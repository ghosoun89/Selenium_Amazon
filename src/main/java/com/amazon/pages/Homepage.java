package com.amazon.pages;

import com.amazon.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends TestBase {
    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver = driver;
    }
    private By searchInput = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");
    private By cartIcon = By.id("nav-cart-count");


    public ResultPage searchForProduct(String name){
        driver.findElement(searchInput).sendKeys(name);
        driver.findElement(searchButton).click();
        return new ResultPage(driver);
    }

    public String getValue(){
        return driver.findElement(cartIcon).getText();
    }

    public CartPage clickOnCart(){
        driver.findElement(cartIcon).click();
        return new CartPage(driver);
    }
}
