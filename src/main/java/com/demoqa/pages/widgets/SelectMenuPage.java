package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiSelect = By.id("cars");


    public void setStandardMultiSelect(String text) {

        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }
// creating overloaded class

    public void setStandardMultiSelect(int value) {

        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, value);
    }

    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);

    }

    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }

}
