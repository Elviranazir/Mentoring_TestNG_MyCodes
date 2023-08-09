package Day6;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static Utilities.BaseDriver.driver;

public class HardSoftAssertions extends BaseDriver {
//    @Test
//    void hardAssertionTest(){
//        driver.get("https://demo.openmrs.org/openmrs/login.htm");
//        WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
//        username.sendKeys("Admin");
//        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
//        password.sendKeys("Admin123");
//        String text= "pasword";
//        Assert.assertTrue(text.contains("cankut"));
//        List<WebElement> locations=driver.findElements(By.xpath("//ul[@id='sessionLocation']/li"));
//        System.out.println(locations.size());
//        locations.get(2).click();
//        WebElement logInBtn=driver.findElement(By.xpath("//input[@id='loginButton']"));
//        logInBtn.click();
//    }

    @Test
    void softAssertionTest(){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Admin123");
        String text= "pasword";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(text.contains("cankut"));
        List<WebElement> locations=driver.findElements(By.xpath("//ul[@id='sessionLocation']/li"));
        System.out.println(locations.size());
        locations.get(2).click();
        WebElement logInBtn=driver.findElement(By.xpath("//input[@id='loginButton']"));
        logInBtn.click();

        softAssert.assertAll();
    }
}
