package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * FrameUtils sınıfı, iframe ve frame geçişlerini kolaylaştıran yardımcı metodlar içerir.
 */
public class FrameUtils {

    /**
     * Index numarasına göre frame’e geçer.
     */
    public static void switchToFrameByIndex(WebDriver driver, int index) {
        driver.switchTo().frame(index);
    }

    /**
     * Name veya ID kullanarak frame’e geçer.
     */
    public static void switchToFrameByNameOrId(WebDriver driver, String nameOrId) {
        driver.switchTo().frame(nameOrId);
    }

    /**
     * WebElement olarak verilen frame’e geçer.
     */
    public static void switchToFrameByElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        driver.switchTo().frame(element);
    }

    /**
     * Ana sayfaya geri döner.
     */
    public static void switchToDefaultContent(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

    /**
     * Parent frame’e geri döner.
     */
    public static void switchToParentFrame(WebDriver driver) {
        driver.switchTo().parentFrame();
    }
}
