package com.demoqa.pages.Alerts_Frames_Window;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowPage extends HomePage {
    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");

    public FramesPage clickFrames(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(framesMenuItem));
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public ModalDialogsPage clickModalDialogs(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(modalDialogsMenuItem));
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsMenuPage clickAlertsMenuItem(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(alertsMenuItem));
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsMenuPage();
    }
}
