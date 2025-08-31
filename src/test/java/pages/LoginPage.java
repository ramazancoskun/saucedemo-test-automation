package pages;

import base.BasePage;
import constants.PageTitles;
import driver.DriverFactory;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v121.input.Input;
import pageElements.LoginPageElements;
import utils.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void verifyPageTitle() {
        String actualPageTitle = LabelUtils.getText(driver, LoginPageElements.LBL_pageTitle);
        Assert.assertEquals("Sayfa başlığı beklenenden farklı!",PageTitles.LOGIN_PAGE_TITLE, actualPageTitle);
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
    public void verifyHomePageItem() {
        LabelUtils.waitUntilVisible(driver,LoginPageElements.LBL_homePageTitle,defaultWait);
    }
    public void verifyInvalidMessageVisible() {
        LabelUtils.waitUntilVisible(driver,LoginPageElements.LBL_invalidLoginErrorMessage,defaultWait);
    }
    public void verifyInvalidMessageText() {
       String actualText = LabelUtils.getText(driver,LoginPageElements.LBL_invalidLoginErrorMessage);

       String expectedText = MessageReader.getProperty("invalidLoginMessage");
       Assert.assertEquals(expectedText,actualText);
    }
    public void requiredUsernameMessageText() {
        String actualText = LabelUtils.getText(driver,LoginPageElements.LBL_invalidLoginErrorMessage);
        String expectedText = MessageReader.getProperty("emptyUsernameMessage");
        Assert.assertEquals(expectedText,actualText);
    }
    public void requiredPasswordMessageText() {
        String actualText = LabelUtils.getText(driver,LoginPageElements.LBL_invalidLoginErrorMessage);
        String expectedText = MessageReader.getProperty("emptyPasswordMessage");
        Assert.assertEquals(expectedText,actualText);
    }

}
