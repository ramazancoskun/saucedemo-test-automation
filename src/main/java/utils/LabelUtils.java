package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * LabelUtils sınıfı, element elementleri için yardımcı metodlar içerir.
 */
public class LabelUtils {

    /**
     * element’in metnini döner.
     */
    public static String getText(WebElement element) {
        return element.getText();
    }

    /**
     * element’in görünür olup olmadığını kontrol eder.
     */
    public static boolean isVisible(WebElement element) {
        return element.isDisplayed();
    }

    /**
     * element metninin beklenen metinle eşleşip eşleşmediğini kontrol eder.
     */
    public static boolean verifyTextEquals(WebElement element, String expectedText) {
        return element.getText().equals(expectedText);
    }

    /**
     * element metninin belirli bir metni içerip içermediğini kontrol eder.
     */
    public static boolean verifyTextContains(WebElement element, String text) {
        return element.getText().contains(text);
    }

    /**
     * element görünür olana kadar bekler.
     */
    public static void waitUntilVisible(WebDriver driver, WebElement element, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, element, timeoutInSeconds);
    }
}
