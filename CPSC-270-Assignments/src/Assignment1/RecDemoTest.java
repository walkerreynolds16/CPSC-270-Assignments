package Assignment1;
import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class RecDemoTest.
 * 
 * @author Walker
 * @version 02/5/16
 */
public class RecDemoTest {

    /**
     * Test factorial.
     */
    @Test
    public void testFactorial() {

        int n = 10;
        int expected = 1;

        for (int i = 1; i <= n; i++) {
            expected *= i;
        }

        int actual = RecDemo.factorial(n);

        assertEquals(expected, actual);

    }

    /**
     * Test fibonacci.
     */
    @Test
    public void testFibonacci() {
        int n = 20;
        int expected = 0;
        int count = 2;
        int temp1 = 1;
        int temp2 = 1;

        while (count < n) {
            expected = temp1 + temp2;
            temp2 = temp1;
            temp1 = expected;
            count++;
        }

        int actual = RecDemo.fibonacci(n);
        assertEquals(expected, actual);

    }

    /**
     * Test is pal true.
     */
    @Test
    public void testIsPalTrue() {
        String pal = "cbabc";

        boolean actual = RecDemo.isPal(pal);

        assertEquals(true, actual);

    }

    /**
     * Test is pal false.
     */
    @Test
    public void testIsPalFalse() {
        String pal = "abcde";

        boolean actual = RecDemo.isPal(pal);

        assertEquals(false, actual);
    }

    /**
     * Test is pal0.
     */
    @Test
    public void testIsPal0() {
        String pal = "";

        boolean actual = RecDemo.isPal(pal);

        assertEquals(true, actual);
    }

    /**
     * Test mk pal.
     */
    @Test
    public void testMkPal() {
        String expected = "xxxx$xxxx";

        String actual = RecDemo.mkPal(4);

        assertEquals(expected, actual);
    }

}
