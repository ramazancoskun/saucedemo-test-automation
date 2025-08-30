package pages;

import base.BasePage;
import org.junit.Assert;
import pageElements.PageElements;
import utils.ButtonUtils;
import utils.LabelUtils;
import utils.TextInputUtils;
import org.openqa.selenium.WebDriver;

public class TestPage extends BasePage {

    public TestPage(WebDriver driver){
    super(driver);

}
        public void enterSearchText(String search) {
            TextInputUtils.waitUntilVisibleAndEnterText(driver, PageElements.INPT_SearchBox, search, defaultWait);
        }
            public void clickSearchButton() {
            ButtonUtils.waitUntilVisibleAndClick(driver, PageElements.BTN_Search, defaultWait);
        }
        public void verifyFirstResult(String search) {
            String actualText = LabelUtils.getText(driver, PageElements.LBL_firstResult);
            Assert.assertEquals(
                    "İlk arama sonucu beklenen metni içermiyor!",
                    search.toLowerCase(),
                    actualText.toLowerCase());
        }
}

