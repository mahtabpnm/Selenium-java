package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import static utilities.SwitchToUtility.*;

@Test // when it comes before the class, every method in this class will become a test
public class AlertsTest extends BaseTest {

    public void testInformationAlerts(){

        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFrameWindowCard()
                .clickAlertsMenuItem();

        alertsPage.clickInformationAlertsButton();  // trigger the alert first

        Assert.assertEquals(getAlertsText(), expectedAlertText, "\n Actual and expected messages do  not match");
        acceptAlerts();// fixed: getAlertsText() + semicolon
    }

    public void testConfirmationAlerts(){

        String expectedConfirmationResult = "you selected cancellation";
        var alertsPage = homePage.goToAlertsFrameWindowCard().clickAlertsMenuItem();
        alertsPage.clickConfirmationAlertsButton();
        dismissAlert();
        // get confirmation result

        String actualConfirmationResult = alertsPage.getConfirmationResult();

        // lets compare actual and expected
        Assert.assertNotEquals(actualConfirmationResult, expectedConfirmationResult, "\n Actual and expected confirmation results should not match");

    }

    public void testPromptAlert(){
        String alertText = "Selenium with JAVA";
        String expectedResult = "You entered " + alertText;
        var alertsPage = homePage.goToAlertsFrameWindowCard().clickAlertsMenuItem();
        alertsPage.clickPromptAlertsButton();
        setAlertsText(alertText);
        acceptAlerts();
        String actualResult = alertsPage.getPromptAlertResult();
        Assert.assertEquals(actualResult, expectedResult, "\n Actual and expected prompt alert results do not match\n");

        // we clicked the value and get result now we have to inspect the result

    }


}
