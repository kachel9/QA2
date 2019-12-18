package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DBsourcePage extends BasePage {
    public DBsourcePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
