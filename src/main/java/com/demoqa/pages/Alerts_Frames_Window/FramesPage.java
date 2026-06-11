package com.demoqa.pages.Alerts_Frames_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowPage {

    // locator used INSIDE the frame context
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='root']//h1[text()='Frames']");
    private void switchToBigBox(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrameBigBox));
    }

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        switchToDefaultContent();
        System.out.println("Big Frame Text: " + bigFrameText);
        return bigFrameText;
    }
}
