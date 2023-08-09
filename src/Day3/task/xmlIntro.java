package Day3.task;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class xmlIntro extends BaseDriver {
    @Test
    public static void loginTest(){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Admin123");

        List<WebElement> locations = driver.findElements(By.xpath("//ul[@id='sessionLocation']/li"));
        System.out.println(locations.size());
        locations.get(2).click();

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='loginButton']"));
        loginBtn.click();
    }

    @Test (dependsOnMethods = "loginTest")
    public static void goToMyAccount(){
        WebElement admin = driver.findElement(By.xpath("//li[@class=\"nav-item identifier\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(admin).build().perform();

        WebElement myAccount = driver.findElement(By.xpath("//a[normalize-space()='My Account']"));
        myAccount.click();
    }
}
