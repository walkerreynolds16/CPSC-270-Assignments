package Assignment2;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * The Class LslistTest.
 * 
 * @author Walker
 * 
 * @version 02/14/16
 */
public class LslistTest {

    /**
     * Test clear.
     */
    @Test
    public void isListEmptyFromConstructor() {
        Lslist list = new Lslist();
        assertEquals(0, list.length());
    }

    @Test
    public void testClear() {
        Lslist list = new Lslist();
        assertEquals(0, list.length());
    }

    /**
     * Test add after.
     */
    @Test
    public void testAddAfter() {
        int expected = 30;

        Lslist list = new Lslist();
        list.addAfter(new Integer(10));
        list.addAfter(new Integer(20));
        list.addAfter(new Integer(30));

        assertEquals(expected, list.getValue());
    }

    /**
     * Test add before.
     */
    @Test
    public void testAddBefore() {
        int expected = 30;

        Lslist list = new Lslist();
        list.addBefore(new Integer(10));
        list.addBefore(new Integer(20));
        list.addBefore(new Integer(30));

        assertEquals(expected, list.getValue());
    }

    /**
     * Test remove.
     */
    @Test
    public void testRemove() {
        Lslist list = new Lslist();

        int expected = 30;

        list.addAfter(new Integer(10));
        list.addAfter(new Integer(20));
        list.addAfter(new Integer(30));
        list.addBefore(new Integer(40));

        list.remove();

        assertEquals(list.getValue(), expected);
    }

    /**
     * Test prev.
     */
    @Test
    public void nextEqualsTail() {
        Lslist list = new Lslist();

        boolean expected = false;

        list.addAfter(new Integer(10));
        list.addAfter(new Integer(20));
        list.addAfter(new Integer(30));

        assertEquals(expected, list.next());
    }

    /**
     * Test next.
     */
    @Test
    public void testNext() {
        Lslist list = new Lslist();

        int expected = 30;

        list.addAfter(new Integer(10));
        list.addAfter(new Integer(20));
        list.addAfter(new Integer(30));
        list.addBefore(new Integer(40));
        list.next();

        assertEquals(expected, list.getValue());
    }

    /**
     * Test length.
     */
    @Test
    public void testLength() {
        Lslist list = new Lslist();

        int expected = 4;

        list.addAfter(new Integer(10));
        list.addAfter(new Integer(20));
        list.addAfter(new Integer(30));
        list.addBefore(new Integer(40));

        assertEquals(expected, list.length());
    }

    /**
     * Test get value.
     */
    @Test
    public void testGetValue() {
        Lslist list = new Lslist();

        int expected = 20;

        list.addAfter(new Integer(10));
        list.addAfter(new Integer(20));

        assertEquals(expected, list.getValue());

    }

    @Test(expected = IllegalStateException.class)
    public void testGetValueException() {
        Lslist list = new Lslist();

        assertEquals(false, list.getValue());

    }

}
