package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticePage;

public class TC05_ColorMultiSelectTest extends BaseTest {

	 @Test(priority = 5)
    public void verifyColorMultiSelect() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectColorsFromMultiSelect();
        System.out.println(
                "TC05_ColorMultiSelectTest PASSED");
    }
}