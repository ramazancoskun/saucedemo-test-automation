package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ButtonUtils {

    /**
     * Verilen WebElement'e tıklar.
     */
    public static void clickButton(WebElement element) {
        element.click();
    }

    /**
     * Element görünür olana kadar bekler ve ardından tıklar.
     */
    public static void waitUntilVisibleAndClick(WebDriver driver, WebElement element, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, element, timeoutInSeconds);
        element.click();
    }

    /**
     * JavaScript kullanarak verilen WebElement'e tıklar.
     */
    public static void clickButtonWithJS(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    /**
     * Element tıklanabilir olana kadar bekler ve ardından tıklar.
     */
    public static void waitUntilClickableAndClick(WebDriver driver, WebElement element, int seconds) {
        WaitUtils.waitForElementClickable(driver, element, seconds);
        element.click();
    }

    /**
     * WebElement üzerinde mouse hover yapar ve ardından tıklar.
     */
    public static void hoverAndClick(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    /**
     * WebElement'in görünür olup olmadığını kontrol eder.
     */
    public static boolean isButtonVisible(WebElement element) {
        return element.isDisplayed();
    }

    /**
     * WebElement'in enable durumunu kontrol eder.
     */
    public static boolean isButtonEnabled(WebElement element) {
        return element.isEnabled();
    }

    /**
     * WebElement'in metninin beklenen metinle eşleşip eşleşmediğini kontrol eder.
     */
    public static boolean doesButtonHaveText(WebElement element, String expectedText) {
        return element.getText().equals(expectedText);
    }
}
