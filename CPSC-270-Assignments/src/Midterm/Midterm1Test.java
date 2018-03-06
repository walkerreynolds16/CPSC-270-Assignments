package Midterm;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class Midterm1Test.
 * 
 * @author Walker Reynolds
 * @version 022416
 */
public class Midterm1Test {

    /**
     * Checks if is midterm1 empty when instantiated.
     */
    @Test
    public void isMidterm1EmptyWhenInstantiated() {
        Midterm1 list = new Midterm1();

        assertEquals(0, list.getListSize());
    }

    /**
     * Adds the after1.
     */
    @Test
    public void addAfter1() {
        Midterm1 list = new Midterm1();

        list.addAfter(new Integer(1));
        list.addAfter(new Integer(2));
        list.addAfter(new Integer(3));

        assertEquals(new Integer(3), list.getValue());
    }

    /**
     * Adds the after2.
     */
    @Test
    public void addAfter2() {
        Midterm1 list = new Midterm1();

        list.addAfter(new Integer(1));

        assertEquals(new Integer(1), list.getValue());
    }

    /**
     * Adds the after3.
     */
    @Test
    public void addAfter3() {
        Midterm1 list = new Midterm1();

        list.addAfter(new Integer(1));
        list.addAfter(new Integer(2));

        assertEquals(new Integer(2), list.getValue());
    }

    /**
     * Test next.
     */
    @Test
    public void testNext() {
        Midterm1 list = new Midterm1();

        list.addAfter(new Integer(1));
        list.addAfter(new Integer(2));
        list.addAfter(new Integer(3));

        list.mkFirstTheCurrent();
        list.next();

        assertEquals(new Integer(2), list.getValue());
    }

    /**
     * Test prev.
     */
    @Test
    public void testPrev() {
        Midterm1 list = new Midterm1();

        list.addAfter(new Integer(1));
        list.addAfter(new Integer(2));
        list.addAfter(new Integer(3));

        list.prev();

        assertEquals(new Integer(2), list.getValue());
    }

    /**
     * Test mk first the current is empty.
     */
    @Test
    public void testMkFirstTheCurrentIsEmpty() {
        Midterm1 list = new Midterm1();
        list.mkFirstTheCurrent();

    }

    @Test(expected = IllegalStateException.class)
    public void testGetValueException() {
        Midterm1 list = new Midterm1();

        assertEquals(false, list.getValue());
    }

}
