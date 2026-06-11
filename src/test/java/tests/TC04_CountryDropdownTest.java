package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticePage;

public class TC04_CountryDropdownTest extends BaseTest {

	 @Test(priority = 4)
    public void verifyCountryDropdown() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectCountryFromDropdown();
        System.out.println(
                "TC04_CountryDropdownTest PASSED");
    }
}