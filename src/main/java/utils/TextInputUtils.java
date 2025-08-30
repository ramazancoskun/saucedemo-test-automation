package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TextInputUtils {

    /**
     * Textbox’a metin girer (önceki metni temizler).
     */
    public static void enterText(WebDriver driver,By locator, String text) {
        WebElement element = driver.findElement(locator);
        WaitUtils.waitForElementVisible(driver, locator,10);
        element.sendKeys(text);
    }

    /**
     * Textbox’a mevcut metnin sonuna ekleme yapar.
     */
    public static void appendText(WebDriver driver,By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    /**
     * Textbox’ı temizler.
     */
    public static void clearText(WebDriver driver,By locator) {
        WebElement element = driver.findElement(locator);
        element.clear();
    }

    /**
     * Textbox’taki mevcut metni alır.
     */
    public static String getText(WebDriver driver,By locator) {
        WebElement element = driver.findElement(locator);
        return element.getAttribute("value");
    }

    /**
     * Textbox aktif mi kontrol eder.
     */
    public static boolean isEnabled(WebDriver driver,By locator) {
        WebElement element = driver.findElement(locator);
        return element.isEnabled();
    }

    /**
     * Textbox görünür olana kadar bekler ve metni girer.
     */
    public static void waitUntilVisibleAndEnterText(WebDriver driver, By locator, String text, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, locator, timeoutInSeconds);
        enterText(driver,locator, text);
    }
}
