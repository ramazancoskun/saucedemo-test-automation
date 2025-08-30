package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TestPage;

public class TestStepDef {

    WebDriver driver = DriverFactory.getDriver();
    TestPage testPage = new TestPage(driver);

    @When("Tarayıcı üzerinden {string} aranır")
    public void search(String search){
        testPage.enterSearchText(search);
        testPage.clickSearchButton();
        testPage.verifyFirstResult(search);

    }
}
