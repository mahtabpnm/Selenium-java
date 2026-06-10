package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.JavaScriptUtility.clickJS;

public class WidgetsPage extends HomePage {

    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()=\"Select Menu\"]");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()=\"Date Picker\"]");

    public SelectMenuPage clickSelectMenu(){

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(selectMenuItem));
        scrollToElementJS(selectMenuItem);
        clickJS(selectMenuItem);

        return new SelectMenuPage();
    }


    public DatePickerMenuPage clickDatePicker(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(datePickerMenuItem));
        scrollToElementJS(datePickerMenuItem);
        clickJS(datePickerMenuItem);
        return new DatePickerMenuPage();
    }


}
