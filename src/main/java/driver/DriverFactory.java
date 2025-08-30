package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.ConfigReader;

public class DriverFactory {
 public static WebDriver driver;

         private DriverFactory() {
 // Constructor private -> dışarıdan new yapılmasını engeller
 }

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser"); //bu sayede tarayıcı bilgileri .properties dosyasından çekilir.
            switch (browser.toLowerCase()) {
                 case "chrome":
                     WebDriverManager.chromedriver().setup();
                     ChromeOptions chromeOptions = new ChromeOptions();
                     chromeOptions.addArguments("--incognito");
                     driver = new ChromeDriver(chromeOptions);
                     chromeOptions.addArguments("--ignore-certificate-errors");
                     chromeOptions.addArguments("--allow-running-insecure-content");
                     break;

                 case "firefox":
                     WebDriverManager.firefoxdriver().setup();
                     driver = new FirefoxDriver();
                     FirefoxOptions firefoxOptions = new FirefoxOptions();
                     firefoxOptions.addArguments("--ignore-certificate-errors");
                     firefoxOptions.addArguments("--allow-running-insecure-content");
                     break;

                 case "edge":
                     WebDriverManager.edgedriver().setup();
                     driver = new EdgeDriver();
                     EdgeOptions edgeOptions = new EdgeOptions();
                     edgeOptions.addArguments("--ignore-certificate-errors");
                     edgeOptions.addArguments("--allow-running-insecure-content");
                     break;

                 default:
                    throw new RuntimeException("Desteklenmeyen tarayıcı: " + browser);
            }

            driver.manage().window().maximize();
    }
    return driver;
 }

         public static void quitDriver() {
            if (driver != null) {
            driver.quit();
            driver = null;
       }
    }
}
