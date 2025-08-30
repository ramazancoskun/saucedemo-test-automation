package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ButtonUtils {

    /**
     * Verilen WebElement'e tıklar.
     */
    public static void clickButton(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    /**
     * Element görünür olana kadar bekler ve ardından tıklar.
     */
    public static void waitUntilVisibleAndClick(WebDriver driver, By locator, int timeoutInSeconds) {
        WaitUtils.waitForElementVisible(driver, locator, timeoutInSeconds);
        clickButton(driver,locator);
    }

    /**
     * JavaScript kullanarak verilen WebElement'e tıklar.
     */
    public static void clickButtonWithJS(WebDriver driver, By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", locator);
    }

    /**
     * Element tıklanabilir olana kadar bekler ve ardından tıklar.
     */
    public static void waitUntilClickableAndClick(WebDriver driver, By locator, int seconds) {
        WaitUtils.waitForElementClickable(driver, locator, seconds);
        clickButton(driver,locator);
    }

    /**
     * WebElement üzerinde mouse hover yapar ve ardından tıklar.
     */
    public static void hoverAndClick(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    /**
     * WebElement'in görünür olup olmadığını kontrol eder.
     */
    public static boolean isButtonVisible(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.isDisplayed();
    }

    /**
     * WebElement'in enable durumunu kontrol eder.
     */
    public static boolean isButtonEnabled(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.isEnabled();
    }

    /**
     * WebElement'in metninin beklenen metinle eşleşip eşleşmediğini kontrol eder.
     */
    public static boolean doesButtonHaveText(WebDriver driver, By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        return element.getText().equals(expectedText);
    }
}
