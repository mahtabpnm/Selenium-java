package part3_4.com.demoqa.tests.part4.screenshot;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenShotTest extends BaseTest {
    @Test
    public void testClickingSubmitButtonWithoutJSExecutor(){

        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
        //test will fail until you scroll to the element
        Assert.assertTrue(practiceFormPage.isFormSubmittedSuccessfully(),
                "Form was not submitted - submit button was not scrolled into view");
    }
}
