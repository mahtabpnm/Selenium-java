package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

import static utilities.DropDownUtility.getAllSelectedOptions;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown(){

        var selectMenuePage = homePage.goToWidgets().clickSelectMenu();
        selectMenuePage.setStandardMultiSelect("Volvo");
        selectMenuePage.setStandardMultiSelect(1);
        selectMenuePage.setStandardMultiSelect("Audi");
        selectMenuePage.setStandardMultiSelect(2);

        selectMenuePage.deselectStandardMulti("saab");
       List<String> actualSelectedOptions =
               selectMenuePage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));

    }


}
