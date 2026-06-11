package utilities;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

    private WebDriver driver;

    public WaitUtility(WebDriver driver) {

        this.driver = driver;
    }

    public void waitForElementToBeVisible(
            WebElement element) {

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(
            WebElement element) {

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.elementToBeClickable(element));
    }
}
