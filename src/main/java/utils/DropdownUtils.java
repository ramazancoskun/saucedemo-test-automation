package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * DropdownUtils sınıfı, <select> elementleri ile çalışmayı kolaylaştıran yardımcı metodlar içerir.
 */
public class DropdownUtils {

    /**
     * Dropdown’da görünen metne göre seçim yapar.
     */
    public static void selectByVisibleText(WebDriver driver, By locator, String visibleText) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    /**
     * Dropdown’da value attribute’a göre seçim yapar.
     */
    public static void selectByValue(WebDriver driver, By locator, String value) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /**
     * Dropdown’da index numarasına göre seçim yapar.
     */
    public static void selectByIndex(WebDriver driver, By locator, int index) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /**
     * Dropdown’da seçili olan option’ı döner.
     */
    public static WebElement getSelectedOption(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        return select.getFirstSelectedOption();
    }

    /**
     * Dropdown’daki tüm option’ları listeler.
     */
    public static java.util.List<WebElement> getAllOptions(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        Select select = new Select(element);
        return select.getOptions();
    }

    /**
     * Dropdown görünür olana kadar bekler ve seçimi yapar.
     */
    public static void waitUntilVisibleAndSelect(WebDriver driver, By locator, String visibleText, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, locator, timeoutInSeconds);
        selectByVisibleText(driver,locator, visibleText);
    }
}
