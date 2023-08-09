package Day7;

import Utilities.BaseDriver;
import Utilities.Parent;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NopeCommerceTest extends BaseDriver {
    NopeCommerceElements np;
    String email;
    String name;

    @Test(priority = 1)
    void loginTest() {
        driver.get("https://admin-demo.nopcommerce.com/login?");
        np = new NopeCommerceElements();
        Parent.sendKeysFunction(np.getEmail(), "admin@yourstore.com");
        Parent.sendKeysFunction(np.getPassword(), "admin");
        Parent.clickFunction(np.getLogInBtn());
        String text = np.getDashboardText().getText();
        Assert.assertTrue(text.toLowerCase().contains("dashboard"));
        Assert.assertTrue(np.getDashboardText().isDisplayed());
    }

    @Test(dependsOnMethods = "loginTest", priority = 2)
    void createCustomer() {
        email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
        name = RandomStringUtils.randomAlphabetic(6);
        np = new NopeCommerceElements();
        Parent.clickFunction(np.getCustomersMenu());
        Parent.clickFunction(np.getCustomer());
        Parent.clickFunction(np.getAddNew());
        Parent.sendKeysFunction(np.getEmailAdd(), email);
        Parent.sendKeysFunction(np.getPasswordNew(), "qazwsx");
        Parent.sendKeysFunction(np.getFirstName(), name);
        Parent.sendKeysFunction(np.getLastName(), "wqeqwdas");
        Parent.clickFunction(np.getGenderFemale());
        Parent.clickFunction(np.getSaveBtn());
        Parent.verifySuccessMsg(np.getSuccessMessage(), "successfully");


    }

    @Test(dependsOnMethods = "createCustomer", priority = 3)
    void editTest() {
        Parent.waitFunc(3);
        np = new NopeCommerceElements();
        Parent.clickFunction(np.getCustomersMenu());
        Parent.clickFunction(np.getCustomer());
        np.getSearchEmail().clear();
        Parent.sendKeysFunction(np.getSearchEmail(), email);
        Parent.clickFunction(np.getSearchBtn());
        Parent.clickFunction(np.getEditBtn());
        email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
        Parent.sendKeysFunction(np.getSearchEmail(), email);
        Parent.clickFunction(np.getSaveBtn());
        Parent.verifySuccessMsg(np.getSuccessMessage(), "successfully");
    }
}