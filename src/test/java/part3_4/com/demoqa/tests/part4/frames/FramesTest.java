package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test

    public void testFramesBigBox(){
       var framesPage =  homePage.goToAlertsFrameWindowCard().clickFrames();
       String actualBigBoxText = framesPage.getTextInBigFrame();
       String expectedBigBoxText = "This is a sample page";
       Assert.assertEquals(actualBigBoxText, expectedBigBoxText, "\n Actual & expected Text Do not match");

       String actualHeaderText = framesPage.getHeaderFramesText();
       String expectedHeaderText = "Frames";
       Assert.assertEquals(actualHeaderText, expectedHeaderText, "\nActual & expected Text Do not match");

    }
}
