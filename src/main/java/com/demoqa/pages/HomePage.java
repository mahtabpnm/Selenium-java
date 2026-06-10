package com.demoqa.pages;

import com.demoqa.pages.Alerts_Frames_Window.Alerts_Frames_WindowPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='root']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='root']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='root']//h5[text()='Widgets']");
    private By alertsFrameWindowCard = By.xpath("//div[@id='root']//h5[text()='Alerts, Frame & Windows']");


    // this is where we found it
    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();

    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets(){
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public Alerts_Frames_WindowPage goToAlertsFrameWindowCard(){
        scrollToElementJS(alertsFrameWindowCard);
        click(alertsFrameWindowCard);
        return new Alerts_Frames_WindowPage();
    }
}
