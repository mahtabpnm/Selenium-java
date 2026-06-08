package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;

    private String DEMOQA_URL = "https://www.demoqa.com";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @BeforeMethod
    //project will load application before each method

    public void loadApplication(){
        driver.get(DEMOQA_URL);
        //create an instanse for base page
        basePage = new BasePage();
        // seting driver
        basePage.setDriver(driver);

        // every page must go home page
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
