package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC18_StaticTableTest extends BaseTest {

	 @Test(priority = 18)
    public void TC18_VerifyStaticWebTable() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.verifyStaticWebTable();

        System.out.println(
                "TC18_VerifyStaticWebTable PASSED");
    }
}