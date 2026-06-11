package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC15_SingleFileUploadTest extends BaseTest {

	 @Test(priority = 15)
    public void TC15_VerifySingleFileUpload() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.uploadSingleFile();

        System.out.println(
                "TC15_VerifySingleFileUpload PASSED");
    }
}