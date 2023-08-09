package Day6;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage_POM extends BaseDriver {
    public LoginPage_POM() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@id='username']")
    private WebElement username;
    @FindBy(xpath="//input[@id='password']")
    private WebElement password;
    @FindBy(xpath="//ul[@id='sessionLocation']/li")
    private List<WebElement> locationList;
    @FindBy(xpath="//input[@id='loginButton']")
    private WebElement loginBtn;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public List<WebElement> getLocationList() {
        return locationList;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}