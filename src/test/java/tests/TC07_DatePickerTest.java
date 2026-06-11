package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticePage;

public class TC07_DatePickerTest extends BaseTest {

	 @Test(priority = 7)
    public void verifyDatePicker() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.handleDatePickers();
        System.out.println(
                "TC07_DatePickerTest PASSED");
    }
}