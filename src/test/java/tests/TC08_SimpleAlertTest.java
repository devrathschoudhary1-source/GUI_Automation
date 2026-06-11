package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticePage;

public class TC08_SimpleAlertTest extends BaseTest {

	 @Test(priority = 8)
    public void verifySimpleAlert() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.handleSimpleAlert();
        System.out.println(
                "TC08_SimpleAlertTest PASSED");
    }
}