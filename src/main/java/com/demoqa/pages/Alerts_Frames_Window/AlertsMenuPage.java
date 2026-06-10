package com.demoqa.pages.Alerts_Frames_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsMenuPage extends Alerts_Frames_WindowPage {

     private By informationAlertsButton = By.id("alertButton");
     private By confirmationAlertsButton = By.id("confirmButton");
     private By confirmationResult = By.id("confirmResult");

     public void clickInformationAlertsButton(){
         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(informationAlertsButton));
         click(informationAlertsButton);
     }

     public void clickConfirmationAlertsButton(){
         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(confirmationAlertsButton));
            click(confirmationAlertsButton);
     }

     public String getConfirmationResult(){
         return find(confirmationResult).getText();
     }
    }

