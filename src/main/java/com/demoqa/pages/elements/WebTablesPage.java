package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.JavaScriptUtility.*;

public class WebTablesPage extends ElementsPage {

    private final By registrationAgeField = By.id("age");
    private final By submitButton = By.id("submit");

    public void clickEdit(String email){
        By edit = By.xpath("//td[text()='"+ email +"']//following::span[@title='Edit']");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(edit));
        scrollToElementJS(edit);
        clickJS(edit);
    }

    public void setAge(String age){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(registrationAgeField));
        set(registrationAgeField, age);
    }

    public void clickSubmitButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(submitButton));
        click(submitButton);
    }

    public String getTableAge(String email){
        By tableAge = By.xpath("//td[text()='" + email + "']/preceding-sibling::td[1]");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(tableAge));
        return find(tableAge).getText();
    }
}
