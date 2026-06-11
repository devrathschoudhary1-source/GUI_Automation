package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC11_BrowserTabTest extends BaseTest {

	 @Test(priority = 11)
    public void TC11_VerifyBrowserTabHandling() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.handleBrowserTab();

        System.out.println(
                "TC11_VerifyBrowserTabHandling PASSED");
    }
}