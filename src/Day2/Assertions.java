package Day2;

import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions extends BaseDriver {


    // AssertEqual

    @Test
    public void test1() {


        // Assert.assertEquals(2,3);
        //   Assert.assertEquals(2+3,4);
        // AssertTrue
        // Assert.assertTrue(2==2);      // As parameter We will pass condition.If it is true test will pass. if not will fail
        // You will go to google.com If title is not equal to "Google" You will fail.


        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();


        if (!actualTitle.equals("Google1")) {
            Assert.fail();
        }
    }
}
