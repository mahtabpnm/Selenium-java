package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{
    public static void scrollToElementJS(By locator){

        // to find web element
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView(true);";

        // we type cast
        ( (JavascriptExecutor) driver).executeScript(jsScript, element);
    }

    // here for js executor
    // this is how we click element using javascript executor
    public static void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor  = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
