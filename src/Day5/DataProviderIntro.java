package Day5;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderIntro extends BaseDriver {
    @Test(dataProvider = "getData")
    public static void loginTest(String uName, String psswrd){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys(uName);
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(psswrd);
        List<WebElement> locations=driver.findElements(By.xpath("//ul[@id='sessionLocation']/li"));
        int randomNumber = (int) (Math.random()*locations.size());

        locations.get(randomNumber).click();
        WebElement logInBtn=driver.findElement(By.xpath("//input[@id='loginButton']"));
        logInBtn.click();

        if (!uName.equalsIgnoreCase("Admin") || !psswrd.equalsIgnoreCase("Admin123")){
            WebElement errorMessage = driver.findElement(By.id("error-message"));
            Assert.assertTrue(errorMessage.getText().contains("Invalid"));
            System.out.println(errorMessage.getText());
        }else {
            WebElement logOut = driver.findElement(By.xpath("//a[@href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\"]"));
            logOut.click();
        }
    }

    @DataProvider
    public Object[][] generateData (){
        Object [][] list = new Object[2][2];
        list[0]=new Object[]{"Admin","Admin123"};
        list[1]=new Object[]{"Admin","Admin123"};
        return list;
    }
    @DataProvider
    private Iterator<Object[]> getData () {
        List<Object[]> credentialList = new ArrayList<>();
        credentialList.add(new Object[]{"Admin","Admin123"});
        credentialList.add(new Object[]{"Admin","Admin123"});
        credentialList.add(new Object[]{"Admsdfsdin","Admin123"});
        credentialList.add(new Object[]{"Admin","Admin123"});
        credentialList.add(new Object[]{"Admin","45"});
        credentialList.add(new Object[]{"Admin","Admin123"});
        credentialList.add(new Object[]{"Admin",""});
        credentialList.add(new Object[]{"Admin","Admin123"});
        credentialList.add(new Object[]{"","Admin123"});
        credentialList.add(new Object[]{"Admin","Admin123"});
        credentialList.add(new Object[]{"Admin","Admin123"});
        return credentialList.iterator();
    }
}
