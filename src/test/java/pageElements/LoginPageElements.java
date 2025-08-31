package pageElements;

import org.openqa.selenium.By;

public class LoginPageElements {

    public static final By LBL_pageTitle = By.xpath("//div[@class='login_logo']");
    public static final By INPT_username = By.id("user-name");
    public static final By INPT_password = By.id("password");
    public static final By BTN_login = By.id("login-button");
    public static final By LBL_loginCredential = By.id("login_credentials");
    public static final By LBL_homePageTitle = By.xpath("//span[@data-test='title' and text()='Products']");

}
