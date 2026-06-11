package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AutomationPracticePage;

public class TC14_DragAndDropTest extends BaseTest {

	 @Test(priority = 14)
    public void TC14_VerifyDragAndDropAction() {

        AutomationPracticePage page =
                new AutomationPracticePage(driver);

        page.performDragAndDropAction();

        System.out.println(
                "TC14_VerifyDragAndDropAction PASSED");
    }
}