package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {

    // Radio button locators
    private final By femaleRadioLabel = By.cssSelector("label[for='gender-radio-2']"); // click
    private final By femaleRadioInput = By.id("gender-radio-2");                       // isSelected()

    // Checkbox locators
    private final By sportsHobbyLabel  = By.cssSelector("label[for='hobbies-checkbox-1']");
    private final By readingHobbyLabel = By.cssSelector("label[for='hobbies-checkbox-2']");
    private final By musicHobbyLabel   = By.cssSelector("label[for='hobbies-checkbox-3']");
    private final By sportsHobbyInput  = By.id("hobbies-checkbox-1");
    private final By readingHobbyInput = By.id("hobbies-checkbox-2");
    private final By musicHobbyInput   = By.id("hobbies-checkbox-3");
    private final By submitButton = By.cssSelector("button[type='submit']");
    private final By successModal = By.cssSelector(".modal-content");

    private void waitForElement(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Radio button methods
    public void clickFemaleRadioButton() {
        waitForElement(femaleRadioLabel);
        scrollToElementJS(femaleRadioLabel);
        clickJS(femaleRadioLabel);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioInput).isSelected();
    }

    // Checkbox methods
    public void clickSportsHobbyCheckbox() {
        waitForElement(sportsHobbyLabel);
        if (!find(sportsHobbyInput).isSelected()) {
            scrollToElementJS(sportsHobbyLabel);
            clickJS(sportsHobbyLabel);
        }
    }

    public void clickReadingHobbyCheckbox() {
        waitForElement(readingHobbyLabel);
        if (!find(readingHobbyInput).isSelected()) {
            scrollToElementJS(readingHobbyLabel);
            clickJS(readingHobbyLabel);
        }
    }

    public void clickmusicHobbyCheckbox() {
        waitForElement(musicHobbyLabel);
        if (!find(musicHobbyInput).isSelected()) {
            scrollToElementJS(musicHobbyLabel);
            clickJS(musicHobbyLabel);
        }
    }

    public void unclickReadingHobbyCheckbox() {
        waitForElement(readingHobbyLabel);
        if (find(readingHobbyInput).isSelected()) {
            scrollToElementJS(readingHobbyLabel);
            clickJS(readingHobbyLabel);
        }
    }

    public boolean isreadingHobbySelected() {
        return find(readingHobbyInput).isSelected();
    }

    public void clickSubmitButton() {
        click(submitButton);
    }

    public boolean isFormSubmittedSuccessfully() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.visibilityOfElementLocated(successModal));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}