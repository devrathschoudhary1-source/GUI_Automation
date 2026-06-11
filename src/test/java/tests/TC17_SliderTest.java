package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC17_SliderTest extends BaseTest {

	 @Test(priority = 17)
    public void TC17_VerifySliderFunctionality() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.moveSlider();

        System.out.println(
                "TC17_VerifySliderFunctionality PASSED");
    }
}