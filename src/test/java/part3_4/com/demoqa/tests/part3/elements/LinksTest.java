package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {
     // we want to click the bad request link and verify the response
   @Test

    public void testLink() {
        var Linkspage = homePage.goToElements().clickLinks();
        Linkspage.clickBadRequestLink();
        String actualResponse = Linkspage.getResponseLink();
        Assert.assertTrue(actualResponse.contains("400")
                && actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse +
                ") \n Does Not Contain 400 and Bad Request");
     }
}
