package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {
    private final By femaleRadioButton = By.cssSelector("label[for='gender-radio-2']");

    public void clickFemaleRadioButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(femaleRadioButton));
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }
}
