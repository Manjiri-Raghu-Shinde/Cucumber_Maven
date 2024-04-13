package Selenium.FinalAssignment;

import org.testng.Assert;
import org.testng.annotations.Test;



public class OEPTest {
   
    @Test
    public void testOdd() {
        String result = OEP.play(3);
        System.out.println("Result for 3: " + result); // Add this line
        Assert.assertEquals("ODD", result);
        result = OEP.play(5);
        System.out.println("Result for 9: " + result); // Add this line
        Assert.assertEquals("ODD", result);
        result = OEP.play(7);
        System.out.println("Result for 15: " + result); // Add this line
        Assert.assertEquals("ODD", result);
    }

    @Test
    public void testEven() {
    	Assert.assertEquals("EVEN", OEP.play(2));
    	Assert.assertEquals("EVEN", OEP.play(4));
    	Assert.assertEquals("EVEN", OEP.play(6));
    }

    @Test
    public void testPrime() {
    	Assert.assertEquals("PRIME", OEP.play(11));
    	Assert.assertEquals("PRIME", OEP.play(13));
    	Assert.assertEquals("PRIME", OEP.play(17));
    }
}

