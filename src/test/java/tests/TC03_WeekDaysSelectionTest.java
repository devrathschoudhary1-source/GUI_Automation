package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticePage;

public class TC03_WeekDaysSelectionTest extends BaseTest {

	 @Test(priority = 3)
    public void verifyWeekDaysSelection() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectWeekDays();
        System.out.println(
                "TC03_WeekDaysSelectionTest PASSED");
    }
}