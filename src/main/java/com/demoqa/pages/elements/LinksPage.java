package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage {
    //lets inspect bad request
    private final By badRequestLink = By.id("bad-request");
    private final By responseLink = By.id("linkResponse");

    // we click the link and we get the response
    public void clickBadRequestLink() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(badRequestLink));
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    // we can respond

    public String getResponseLink() {
        // there is a delay for response to show up

        delay(2000);
        return find(responseLink).getText();
    }

}
