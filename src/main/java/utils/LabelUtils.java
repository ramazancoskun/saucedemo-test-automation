package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * LabelUtils sınıfı, element elementleri için yardımcı metodlar içerir.
 */
public class LabelUtils {

    /**
     * element’in metnini döner.
     */
    public static String getText(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    /**
     * element’in görünür olup olmadığını kontrol eder.
     */
    public static boolean isVisible(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.isDisplayed();
    }

    /**
     * element metninin beklenen metinle eşleşip eşleşmediğini kontrol eder.
     */
    public static boolean verifyTextEquals(WebDriver driver, By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        return element.getText().equals(expectedText);
    }

    /**
     * element metninin belirli bir metni içerip içermediğini kontrol eder.
     */
    public static boolean verifyTextContains(WebDriver driver, By locator, String text) {
        WebElement element = driver.findElement(locator);
        return element.getText().contains(text);
    }

    /**
     * element görünür olana kadar bekler.
     */
    public static void waitUntilVisible(WebDriver driver, By locator, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, locator, timeoutInSeconds);
    }
}
