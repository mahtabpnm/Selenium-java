package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlerts(){

        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFrameWindowCard()
                .clickAlertsMenuItem();

        alertsPage.clickInformationAlertsButton();  // trigger the alert first

        Assert.assertEquals(getAlertsText(), expectedAlertText, "\n Actual and expected messages do  not match");
        acceptAlerts();// fixed: getAlertsText() + semicolon
    }
}
