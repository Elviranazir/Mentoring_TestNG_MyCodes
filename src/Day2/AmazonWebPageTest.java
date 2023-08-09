package Day2;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonWebPageTest  extends BaseDriver {



    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);


        WebElement amazon = driver.findElement(By.id("nav-logo-sprites"));
        String textOfAmazon = amazon.getText();

        System.out.println(textOfAmazon);


        // Assert.assertNotNull(textOfAmazon);   // There is sth written on the webelement

        // This test means If we have a text with weblement Test Will Pass











    }








}