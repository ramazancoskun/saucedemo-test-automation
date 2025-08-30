package utils;

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
    public static void selectByVisibleText(WebElement dropdown, String visibleText) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
    }

    /**
     * Dropdown’da value attribute’a göre seçim yapar.
     */
    public static void selectByValue(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    /**
     * Dropdown’da index numarasına göre seçim yapar.
     */
    public static void selectByIndex(WebElement dropdown, int index) {
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }

    /**
     * Dropdown’da seçili olan option’ı döner.
     */
    public static WebElement getSelectedOption(WebElement dropdown) {
        Select select = new Select(dropdown);
        return select.getFirstSelectedOption();
    }

    /**
     * Dropdown’daki tüm option’ları listeler.
     */
    public static java.util.List<WebElement> getAllOptions(WebElement dropdown) {
        Select select = new Select(dropdown);
        return select.getOptions();
    }

    /**
     * Dropdown görünür olana kadar bekler ve seçimi yapar.
     */
    public static void waitUntilVisibleAndSelect(WebDriver driver, WebElement dropdown, String visibleText, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, dropdown, timeoutInSeconds);
        selectByVisibleText(dropdown, visibleText);
    }
}
