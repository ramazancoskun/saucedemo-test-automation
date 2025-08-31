package pages;

import base.BasePage;
import driver.DriverFactory;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v121.input.Input;
import pageElements.LoginPageElements;
import utils.BrowserUtils;
import utils.ButtonUtils;
import utils.LabelUtils;
import utils.TextInputUtils;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Step 1: Alt metodlar, senin yazdığın kontrolleri koruyor
    public void verifyPageTitle() {
        String actualPageTitle = LabelUtils.getText(driver, LoginPageElements.LBL_pageTitle);
        Assert.assertEquals("Swag Labs", actualPageTitle);
    }

    public void verifyUsernameField() {
        TextInputUtils.isEnabled(driver, LoginPageElements.INPT_username);
    }

    public void verifyPasswordField() {
        TextInputUtils.isEnabled(driver, LoginPageElements.INPT_password);
    }

    public void verifyLoginButton() {
        ButtonUtils.isButtonEnabled(driver, LoginPageElements.BTN_login);
    }

    public void verifyLoginCredentialLabel() {
        LabelUtils.isVisible(driver, LoginPageElements.LBL_loginCredential);
    }

    public void verifyLoginPageItems() {
        verifyPageTitle();
        verifyUsernameField();
        verifyPasswordField();
        verifyLoginButton();
        verifyLoginCredentialLabel();
    }
    public void enterUsername(String username) {
        TextInputUtils.enterText(driver,LoginPageElements.INPT_username,username);
    }
    public void enterPassword(String password) {
        TextInputUtils.enterText(driver,LoginPageElements.INPT_password,password);
    }
    public void clickLogin() {
        ButtonUtils.waitUntilVisibleAndClick(driver,LoginPageElements.BTN_login, defaultWait);
    }
    public void verifyHomePage() {
        LabelUtils.waitUntilVisible(driver,LoginPageElements.LBL_homePageTitle,defaultWait);
    }

}
