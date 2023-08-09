package Day6;

import Utilities.BaseDriver;
import Utilities.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class loginTest extends BaseDriver {
    LoginPage_POM lp;

    @Test
    void test1(){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        lp=new LoginPage_POM();
        Parent.sendKeysFunction(lp.getUsername(),"Admin");
        Parent.sendKeysFunction(lp.getPassword(), "Admin123");
        Parent.clickFunction(lp.getLocationList().get(0));
        Parent.clickFunction(lp.getLoginBtn());
    }
}
