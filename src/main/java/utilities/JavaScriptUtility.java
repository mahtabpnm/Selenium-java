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
}
