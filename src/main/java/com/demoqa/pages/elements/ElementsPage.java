package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsPage extends HomePage {

    private final By webTablesMenuItem = By.xpath("//span[text()='Web Tables']");

    public WebTablesPage clickWebTables(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(webTablesMenuItem));
        click(webTablesMenuItem);
        return new WebTablesPage();
    }
}
