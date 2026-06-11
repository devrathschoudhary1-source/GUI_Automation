package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC13_DoubleClickTest extends BaseTest {

	 @Test(priority = 13)
    public void TC13_VerifyDoubleClickAction() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.performDoubleClickAction();

        System.out.println(
                "TC13_VerifyDoubleClickAction PASSED");
    }
}