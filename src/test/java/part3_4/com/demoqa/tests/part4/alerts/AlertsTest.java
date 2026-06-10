package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import static utilities.SwitchToUtility.*;

@Test// when it comes behind every method in this class will become test
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


}
