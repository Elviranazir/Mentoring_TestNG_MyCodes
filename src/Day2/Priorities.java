package Day2;
import Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/*
Create 3 tests; test1,test2, test3.  Executes the test3 first, test 2 second, and test 1 the last.
test 1 will only print "Hello"
test 2 will only go to the "amazon.com"
test 3 will go to "google.com" and, get the title and assert that title is "Google"
 */



public class Priorities  extends BaseDriver {

    @Test (priority = 3)
    public void test1() {

        System.out.println("Hello");
    }

    @Test (priority = 2)
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
        driver.get("https://www.amazon.com");
        driver.close();

    }

    @Test (priority = 1)
    public void test3() {
        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();

    }

}