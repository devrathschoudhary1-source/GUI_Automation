package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.AutomationPracticePage;

public class TC06_AnimalDropdownTest extends BaseTest {

	 @Test(priority = 6)
    public void verifyAnimalDropdown() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.selectAnimalFromSortedList();
        System.out.println(
                "TC06_AnimalDropdownTest PASSED");
    }
}