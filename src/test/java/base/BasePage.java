package base;

import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

public class BasePage {
    protected WebDriver driver;
    protected final int defaultWait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.defaultWait = ConfigReader.getIntProperty("defaultWaitTime");
    }
}
