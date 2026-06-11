package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC20_PaginationTableTest extends BaseTest {

	 @Test(priority = 20)
    public void TC20_VerifyPaginationTable() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.verifyPaginationTable();

        System.out.println(
                "TC20_VerifyPaginationTable PASSED");
    }
}