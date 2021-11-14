package com.amazon.pages;

import com.amazon.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage extends TestBase {
    WebDriver driver;
    public ResultPage(WebDriver driver){
        this.driver = driver;
    }
    private By searchResult = By.cssSelector("[data-component-type=\"s-search-result\"]");

    public String getAttributeValue(){
        List<WebElement> results = driver.findElements(searchResult);
        return results.get(0).getAttribute("data-asin");
    }

    public SpecificElementPage selectProduct(int num){
        List<WebElement> results = driver.findElements(searchResult);
        results.get(num).click();
        return new SpecificElementPage(driver);
    }
}
