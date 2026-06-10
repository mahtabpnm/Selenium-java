package com.demoqa.pages.Alerts_Frames_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalDialogsPage extends Alerts_Frames_WindowPage {

    // ✅ By.id() takes the id value without #
    private By smallModalButton = By.id("showSmallModal");
    // ✅ modal body is found by xpath, not by id
    private By smallModalText   = By.xpath("//div[@class='modal-body']");
    // ✅ By.id() takes the id value without #
    private By closeButton      = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(smallModalButton));
        click(smallModalButton);
    }

    public String getSmallModalText() {
        // wait for the modal animation to finish
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(smallModalText));
        return find(smallModalText).getText();
    }

    public void clickCloseButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(closeButton));
        click(closeButton);
    }
}
