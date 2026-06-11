package utilities;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtility {

    public static String captureScreenshot(
            WebDriver driver,
            String testName)
            throws IOException {

        File source =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.FILE);

        String destination =
                "screenshots/"
                        + testName
                        + ".png";

        FileUtils.copyFile(
                source,
                new File(destination));

        return destination;
    }
}