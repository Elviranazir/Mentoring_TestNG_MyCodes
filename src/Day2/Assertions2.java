package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions2 {


    @Test
    public void Test1() {


        //  Assert.assertNotEquals(2,3);  // It is passing if parameters not equal


        // assertNull : It is asserting whethere given is null or not.

        String str =  null;
        //   Assert.assertNull(str);   // It will fail.

        Assert.assertNotNull(str);

    }
}