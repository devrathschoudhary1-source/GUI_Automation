package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC01_UserInformationTest extends BaseTest {

    @Test(priority = 1)
    public void verifyUserInformation() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.fillUserInformation();
        System.out.println(
                "TC01_UserInformationTest PASSED");
    }
}