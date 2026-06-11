package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {
    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    //writing for test class

    public static String getAlertsText() {
        return switchTo().alert().getText();
    }
    public static void acceptAlerts(){
        switchTo().alert().accept();// automatically click ok

    }

    public static void dismissAlert(){
        switchTo().alert().dismiss();
    }
    public static void setAlertsText(String text){
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrame(String frameId){
        switchTo().frame(frameId);
    }

    public static void switchToDefaultContent(){
        switchTo().defaultContent();
    }
}
