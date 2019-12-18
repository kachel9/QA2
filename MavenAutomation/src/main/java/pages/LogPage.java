package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPage extends BasePage {
    public LogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='username']")
    private WebElement logName;

    @Step("Enter username to search input {username}")
    public LogPage inputUsername(String username) {
        logName.sendKeys(username);
        return this;
    }

    @FindBy(xpath = "//*[@id='password']")
    private WebElement logPassw;

    @Step("Enter password to search input {password}")
    public LogPage inputPassword(String password) {
        logPassw.sendKeys(password);
        return this;
    }

    @FindBy(xpath = "//*[@class='login-submit']")
    private WebElement logInButton;

    @Step("Click Log In Button")
    public LogPage clickLogInButton() {
        logInButton.click();
        return this;
    }


}
