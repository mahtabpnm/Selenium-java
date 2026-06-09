package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsPage extends HomePage {

    private final By webTablesMenuItem = By.xpath("//span[text()='Web Tables']");
    private final By linksMenuItem = By.xpath("//span[text()='Links']");

    public WebTablesPage clickWebTables(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(webTablesMenuItem));
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    // links page is page object name and clickLinks is method name
    public LinksPage clickLinks(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(linksMenuItem));
        click(linksMenuItem);
        return new LinksPage();
    }
}
