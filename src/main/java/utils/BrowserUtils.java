package utils;

import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;


public class BrowserUtils {

    /**
     Belirtilen saniye kadar sabit bekleme yapar.
     */
    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     Sayfanın en altına kaydırma yapar.
     */
    public static void scrollToBottom(WebDriver driver) {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        }
    /**
     Sayfanın en üstüne kaydırma yapar.
     */
    public static void scrollToTop(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
    }

    public static void takeScreenshot(WebDriver driver, String fileName) {
        //** WebDriver'ı TakesScreenshot olarak cast et */
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Screenshot'u File olarak alır.
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        // Dosyayı kaydeder.
        try {
            File destFile = new File("screenshots/" + fileName + ".png");
            org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        //Alert kabul eder.
        public static void acceptAlert(WebDriver driver) {
            driver.switchTo().alert().accept();
        }

        //Alert reddeder.
        public static void dismissAlert(WebDriver driver) {
            driver.switchTo().alert().dismiss();
        }

        //Bulunulan sayfayı yeniler (refresh).
        public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }
        /**
         * Sayfanın başlığını döndürür.
         */
        public static String getPageTitle(WebDriver driver) {
            return driver.getTitle();
        }
    }











