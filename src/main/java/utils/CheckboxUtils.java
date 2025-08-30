package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * CheckboxUtils sınıfı, checkbox elementleri için yardımcı metodlar içerir.
 */
public class CheckboxUtils {

    /**
     * Checkbox işaretli değilse işaretler.
     */
    public static void check(WebElement element) {
        if (!element.isSelected()) {
            element.click();
        }
    }

    /**
     * Checkbox işaretli ise işareti kaldırır.
     */
    public static void uncheck(WebElement element) {
        if (element.isSelected()) {
            element.click();
        }
    }

    /**
     * Checkbox’ın durumunu tersine çevirir.
     */
    public static void toggle(WebElement element) {
        element.click();
    }

    /**
     * Checkbox işaretli mi kontrol eder.
     */
    public static boolean isChecked(WebElement element) {
        return element.isSelected();
    }

    /**
     * Checkbox görünür olana kadar bekler ve işaretler.
     */
    public static void waitUntilVisibleAndCheck(WebDriver driver, WebElement element, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, element, timeoutInSeconds);
        check(element);
    }
}
