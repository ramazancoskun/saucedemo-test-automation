package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElements {

    public static final By INPT_SearchBox = By.xpath("//textarea[@name='q']");
    public static final By BTN_Search = By.xpath("//input[@name='btnK' and @type='submit'][1]");
    public static final By LBL_firstResult = By.cssSelector("h3");



}
