package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    private final By practiceFormMenuItem = By.xpath("//span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(practiceFormMenuItem));
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
