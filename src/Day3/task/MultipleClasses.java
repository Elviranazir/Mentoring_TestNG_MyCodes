package Day3.task;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleClasses extends BaseDriver {
    @Test
    public static void Test1() {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointmentBtn=driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentBtn.click();
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");
        WebElement password=driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

    }
}
