package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.clickJS;

public class DatePickerMenuPage extends WidgetsPage {

    // we make these private because we do not need our test return back to it

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.cssSelector(".react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");
    private By dayValue(String day){
        return By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day){
//        By dayValue = By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='2']");
//        click(dayValue);
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day){
//        By dayValue = By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='2']");
//        return find(dayValue).isDisplayed();
        return find(dayValue(day)).isDisplayed();
    }

    //we should get the field and pick it
    public void clickSelectDate(){
        clickJS(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");// for date we have to write atribute to get
    }


    public void selectMonth(String month){
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown, year);
    }
}
