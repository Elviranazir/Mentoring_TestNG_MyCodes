package Day7;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NopeCommerceElements {
    public NopeCommerceElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(id = "Email")
    private WebElement email;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(css = "button[type=submit]")
    private WebElement logInBtn;
    @FindBy(xpath = "//div[@class=\"content-header\"]/h1")
    private WebElement dashboardText;

    @FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
    private WebElement customersMenu;
    @FindBy(xpath="//p[text()=\" Customers\"]")
    private WebElement customer;
    @FindBy(xpath="//a[normalize-space()='Add new']")
    private WebElement addNew;

    @FindBy(id="Email")
    private WebElement emailAdd;

    @FindBy(id="Password")
    private WebElement passwordNew;

    @FindBy(id="FirstName")
    private WebElement firstName;
    @FindBy(id="LastName")
    private WebElement lastName;

    @FindBy(id="Gender_Female")
    private WebElement genderFemale;
    @FindBy(css="")
    private WebElement webElement;

    @FindBy(xpath="//button[@name='save']")
    private WebElement saveBtn;


    @FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
    private WebElement successMessage;

    @FindBy(id="SearchEmail")
    private WebElement searchEmail;
    @FindBy(id="search-customers")
    private WebElement searchBtn;
    @FindBy(xpath="//tbody/tr[1]/td[7]/a[1]")
    private WebElement editBtn;


    public WebElement getSearchEmail() {
        return searchEmail;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getEditBtn() {
        return editBtn;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getEmailAdd() {
        return emailAdd;
    }

    public WebElement getPasswordNew() {
        return passwordNew;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getGenderFemale() {
        return genderFemale;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public WebElement getCustomersMenu() {
        return customersMenu;
    }

    public WebElement getCustomer() {
        return customer;
    }

    public WebElement getAddNew() {
        return addNew;
    }

    public WebElement getEmail() {
        return email;
    }
    public WebElement getPassword() {
        return password;
    }
    public WebElement getLogInBtn() {
        return logInBtn;
    }
    public WebElement getDashboardText() {
        return dashboardText;
    }
}