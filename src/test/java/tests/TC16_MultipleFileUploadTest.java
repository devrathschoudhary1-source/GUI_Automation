package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC16_MultipleFileUploadTest extends BaseTest {

	 @Test(priority = 16)
    public void TC16_VerifyMultipleFileUpload() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.uploadMultipleFiles();

        System.out.println(
                "TC16_VerifyMultipleFileUpload PASSED");
    }
}