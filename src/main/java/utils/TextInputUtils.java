package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TextInputUtils {

    /**
     * Textbox’a metin girer (önceki metni temizler).
     */
    public static void enterText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Textbox’a mevcut metnin sonuna ekleme yapar.
     */
    public static void appendText(WebElement element, String text) {
        element.sendKeys(text);
    }

    /**
     * Textbox’ı temizler.
     */
    public static void clearText(WebElement element) {
        element.clear();
    }

    /**
     * Textbox’taki mevcut metni alır.
     */
    public static String getText(WebElement element) {
        return element.getAttribute("value");
    }

    /**
     * Textbox aktif mi kontrol eder.
     */
    public static boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    /**
     * Textbox görünür olana kadar bekler ve metni girer.
     */
    public static void waitUntilVisibleAndEnterText(WebDriver driver, WebElement element, String text, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, element, timeoutInSeconds);
        enterText(element, text);
    }
}
