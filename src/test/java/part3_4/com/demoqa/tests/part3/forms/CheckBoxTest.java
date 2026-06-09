package part3_4.com.demoqa.tests.part3.forms;

import com.demoqa.pages.forms.FormsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {
    @Test
    public void testCheckBox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickmusicHobbyCheckbox();
        formsPage.unclickReadingHobbyCheckbox();


        //verification
        boolean isReadingCheckBoxSelected = formsPage.isreadingHobbySelected();
        Assert.assertFalse(isReadingCheckBoxSelected, "\n Reading Hobby checkbox is selected \n");
    }
}
