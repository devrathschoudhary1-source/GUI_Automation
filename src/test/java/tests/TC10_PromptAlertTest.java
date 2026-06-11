package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticePage;

public class TC10_PromptAlertTest extends BaseTest {

	 @Test(priority = 10)
    public void verifyPromptAlert() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.handlePromptAlert();
        System.out.println(
                "verifyPromptAlert PASSED");
    }
}