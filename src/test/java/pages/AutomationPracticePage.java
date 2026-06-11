package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticePage {

    private WebDriver driver;

    public AutomationPracticePage(WebDriver driver) {

        this.driver = driver;
    }

    private void pause() {

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    // ==========================
    // USER INFORMATION
    // ==========================

    public void fillUserInformation() {

        driver.findElement(By.id("name"))
                .sendKeys("Devrath Singh choudhary");
        pause();

        driver.findElement(By.id("email"))
                .sendKeys("devrath@gmail.com");
        pause();

        driver.findElement(By.id("phone"))
                .sendKeys("9876543210");
        pause();

        driver.findElement(By.id("textarea"))
                .sendKeys("Dhanbad Jharkhand");
        pause();
    }

    // ==========================
    // RADIO BUTTON
    // ==========================

    public void selectGender() {

        driver.findElement(By.id("male"))
                .click();

        pause();
    }

    // ==========================
    // CHECKBOX
    // ==========================

    public void selectWeekDays() {

        driver.findElement(By.id("monday"))
                .click();
        pause();

        driver.findElement(By.id("tuesday"))
                .click();
        pause();

        driver.findElement(By.id("friday"))
                .click();
        pause();
    }

    // ==========================
    // COUNTRY DROPDOWN
    // ==========================

    public void selectCountryFromDropdown() {

        Select countryDropdown =
                new Select(driver.findElement(By.id("country")));

        countryDropdown.selectByVisibleText("India");

        pause();
    }

    // ==========================
    // COLORS MULTI SELECT
    // ==========================

    public void selectColorsFromMultiSelect() {

        Select colorDropdown =
                new Select(driver.findElement(By.id("colors")));

        colorDropdown.selectByVisibleText("Red");
        pause();

        colorDropdown.selectByVisibleText("Blue");
        pause();
    }

    // ==========================
    // ANIMAL DROPDOWN
    // ==========================

    public void selectAnimalFromSortedList() {

        Select animalDropdown =
                new Select(driver.findElement(By.id("animals")));

        animalDropdown.selectByVisibleText("Dog");

        pause();
    }

    // ==========================
    // DATE PICKERS
    // ==========================

    public void handleDatePickers() {

        driver.findElement(By.id("datepicker"))
                .sendKeys("06/15/2026");

        pause();

        driver.findElement(By.id("txtDate"))
                .sendKeys("15/06/2026");

        pause();
    }

    // ==========================
    // SIMPLE ALERT
    // ==========================

    public void handleSimpleAlert() {

        driver.findElement(By.id("alertBtn"))
                .click();

        Alert alert =
                driver.switchTo().alert();

        alert.accept();

        pause();
    }

    // ==========================
    // CONFIRM ALERT
    // ==========================

    public void handleConfirmationAlert() {

        driver.findElement(By.id("confirmBtn"))
                .click();

        Alert alert =
                driver.switchTo().alert();

        alert.accept();

        pause();
    }

    // ==========================
    // PROMPT ALERT
    // ==========================

    public void handlePromptAlert() {

        driver.findElement(By.id("promptBtn"))
                .click();

        Alert alert =
                driver.switchTo().alert();

        alert.sendKeys("Automation");

        alert.accept();

        pause();
    }
    
    // ==========================
    // BROWSER TAB
    // ==========================

    public void handleBrowserTab() {

        String parentWindow =
                driver.getWindowHandle();

        driver.findElement(
                By.xpath("//button[contains(text(),'New Tab')]"))
                .click();

        pause();

        Set<String> windows =
                driver.getWindowHandles();

        for (String win : windows) {

            if (!win.equals(parentWindow)) {

                driver.switchTo().window(win);

                pause();

                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);

        pause();
    }

    // ==========================
    // MOUSE HOVER
    // ==========================

    public void performMouseHover() {

        WebElement hoverButton =
                driver.findElement(
                        By.xpath("//button[contains(text(),'Point Me')]"));

        Actions actions =
                new Actions(driver);

        actions.moveToElement(hoverButton)
                .perform();

        pause();
    }

    // ==========================
    // DOUBLE CLICK
    // ==========================

    public void performDoubleClickAction() {

        WebElement copyButton =
                driver.findElement(
                        By.xpath("//button[text()='Copy Text']"));

        Actions actions =
                new Actions(driver);

        actions.doubleClick(copyButton)
                .perform();

        pause();
    }

    // ==========================
    // DRAG AND DROP
    // ==========================

    public void performDragAndDropAction() {

        WebElement sourceElement =
                driver.findElement(By.id("draggable"));

        WebElement targetElement =
                driver.findElement(By.id("droppable"));

        Actions actions =
                new Actions(driver);

        actions.dragAndDrop(
                sourceElement,
                targetElement)
                .perform();

        pause();
    }

    // ==========================
    // SINGLE FILE UPLOAD
    // ==========================

    public void uploadSingleFile() {

        driver.findElement(By.id("singleFileInput"))
                .sendKeys("D:\\sample.txt.txt");

        pause();
    }

    // ==========================
    // MULTIPLE FILE UPLOAD
    // ==========================

    public void uploadMultipleFiles() {

        String file1 = "D:\\sample.txt.txt";
        String file2 = "D:\\multiple.txt";

        driver.findElement(By.id("multipleFilesInput"))
                .sendKeys(file1 + "\n" + file2);

        pause();
    }

    // ==========================
    // SLIDER
    // ==========================

    public void moveSlider() {

        try {

            WebElement slider =
                    driver.findElement(
                            By.xpath("//span[contains(@class,'ui-slider-handle')]"));

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].scrollIntoView(true);",
                            slider);

            pause();

            Actions action =
                    new Actions(driver);

            action.clickAndHold(slider)
                    .moveByOffset(80, 0)
                    .release()
                    .perform();

            pause();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // ==========================
    // STATIC TABLE
    // ==========================

    public void verifyStaticWebTable() {

        List<WebElement> rows =
                driver.findElements(
                        By.xpath("//table[@name='BookTable']//tr"));

        System.out.println(
                "Static Table Rows = "
                        + rows.size());

        pause();
    }

    // ==========================
    // DYNAMIC TABLE
    // ==========================

    public void verifyDynamicWebTable() {

        String cpuLoad =
                driver.findElement(
                        By.xpath("//*[contains(text(),'CPU load')]"))
                        .getText();

        System.out.println(cpuLoad);

        pause();
    }

    // ==========================
    // PAGINATION TABLE
    // ==========================

    public void verifyPaginationTable() {

        List<WebElement> pages =
                driver.findElements(
                        By.xpath("//ul[@id='pagination']//a"));

        for (WebElement page : pages) {

            page.click();

            pause();

            System.out.println(
                    "Opened Page : "
                            + page.getText());
        }
    }

    // ==========================
    // SCROLL TO BOTTOM=
    // ==========================

    public void scrollToBottom() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0,document.body.scrollHeight)");

        pause();
    }

    // ==========================
    // SCROLL TO TOP
    // ==========================

    public void scrollToTop() {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0,0)");

        pause();
    }
}