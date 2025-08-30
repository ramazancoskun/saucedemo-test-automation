package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import driver.DriverFactory;

import java.time.Duration;

public class Hooks {
    @Before
    public void setUp(){
        //Tarayıcıyı başlat
        DriverFactory.getDriver().get(ConfigReader.getProperty("baseURL"));
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Tarayıcı başlatıldı.");
    }

    @After
    public void tearDown(){
        // Tarayıcıyı kapat
        DriverFactory.quitDriver();
        System.out.println("Tarayıcı kapatıldı.");
    }
}
