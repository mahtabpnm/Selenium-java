package utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static WebDriver driver;
    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

    // this utility class can also include generate randome number
    // or return string to upperCase

    //we can organize our classes into diffrent subclasses


}
