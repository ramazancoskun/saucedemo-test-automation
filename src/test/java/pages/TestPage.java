package pages;

import base.BasePage;
import org.junit.Assert;
import pageElements.PageElements;
import utils.BrowserUtils;
import utils.ButtonUtils;
import utils.TextInputUtils;
import org.openqa.selenium.WebDriver;

public class TestPage extends BasePage {

    WebDriver driver;


    public TestPage(WebDriver driver){
    super(driver);
    this.driver = driver;
}
    public void searchByText(String search){

        TextInputUtils.enterText(driver,PageElements.INPT_SearchBox, search);
        ButtonUtils.clickButton(driver,PageElements.BTN_Search);
        String pageName = BrowserUtils.getPageTitle(driver);
        Assert.assertTrue(pageName.contains(search));
}
}

