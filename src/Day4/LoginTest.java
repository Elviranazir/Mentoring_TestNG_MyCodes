package Day4;

import Utilities.ParametersDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends ParametersDriver {
    @Test
    @Parameters({"username","password"})
    public static void test1(String username,String password){
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointmentBtn=driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentBtn.click();
        WebElement username1 = driver.findElement(By.id("txt-username"));
        username1.sendKeys(username);
        WebElement password1=driver.findElement(By.id("txt-password"));
        password1.sendKeys(password);
        driver.findElement(By.id("btn-login")).click();
    }
}
