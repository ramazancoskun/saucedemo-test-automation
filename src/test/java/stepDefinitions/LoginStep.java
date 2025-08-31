package stepDefinitions;

import driver.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

import java.util.Map;
import java.util.Objects;

public class LoginStep {

    private static final Logger log = LoggerFactory.getLogger(LoginStep.class);
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("Giriş ekranı açılır")
    public void verifyLoginPage(){
        loginPage.verifyLoginPageItems();
    }
    @When("Kullanıcı adı ve şifre giriir")
    public void enterUsernameAndPassword(DataTable table){
        Map<String, String> data = table.asMaps(String.class, String.class).getFirst();

        final String username = Objects.requireNonNullElse(data.get("username"),"");
        final String password = Objects.requireNonNullElse(data.get("password"),"");

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @And("Giriş yap butonuna tıklanır")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }
    @Then("Uygulamaya giriş yapıldığı doğrulanır")
    public void verifyHomePage(){
        loginPage.verifyHomePageItem();
    }
    @Then("Kullanıcı adı veya şifrenin hatalı olduğu doğrulanır")
    public void verifyLoginPageMessage(){
        loginPage.verifyInvalidMessageVisible();
        loginPage.verifyInvalidMessageText();
    }
    @Then("Kullanıcı adının boş bırakıldığı doğrulanır")
    public void requiredUserName(){
        loginPage.verifyInvalidMessageVisible();
        loginPage.requiredUsernameMessageText();
    }
    @Then("Şifrenin boş bırakıldığı doğrulanır")
    public void requiredPassword(){
        loginPage.verifyInvalidMessageVisible();
        loginPage.requiredUsernameMessageText();
    }

}

