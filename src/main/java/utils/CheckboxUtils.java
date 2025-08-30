package utils;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * CheckboxUtils sınıfı, checkbox elementleri için yardımcı metodlar içerir.
 */
public class CheckboxUtils {



    /**
     * Checkbox işaretli değilse işaretler.
     */
    public static void check(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        if (!element.isSelected()) {
            element.click();
        }
    }

    /**
     * Checkbox işaretli ise işareti kaldırır.
     */
    public static void uncheck(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        if (element.isSelected()) {
            element.click();
        }
    }

    /**
     * Checkbox’ın durumunu tersine çevirir.
     */
    public static void toggle(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    /**
     * Checkbox işaretli mi kontrol eder.
     */
    public static boolean isChecked(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.isSelected();

    }

    /**
     * Checkbox görünür olana kadar bekler ve işaretler.
     */
    public static void waitUntilVisibleAndCheck(WebDriver driver, By locator, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, locator, timeoutInSeconds);
        check(driver,locator);
    }
}
