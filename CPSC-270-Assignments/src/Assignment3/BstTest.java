package Assignment3;
import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class BstTest.
 * 
 * @author Walker
 * @version 4092016
 */
public class BstTest {

    /**
     * Test size.
     */
    @Test
    public void testSize() {
        Bst b = new Bst();
        b.insert('a');
        b.insert('b');
        b.insert('c');
        int actual = b.size();
        assertEquals(3, actual);
    }

    /**
     * Test insert fail.
     */
    @Test
    public void testInsertFail() {
        Bst b = new Bst();
        b.insert('a');
        b.insert('b');
        b.insert('a');
        String actual = b.preorderString();
        String expected = "{a, b}";
        assertEquals(expected, actual);
    }

    /**
     * Test size after intialization.
     */
    @Test
    public void testSizeAfterIntialization() {
        Bst b = new Bst();
        assertEquals(0, b.size());
    }

    /**
     * Test element with key null.
     */
    @Test
    public void testElementWithKeyNull() {
        Bst b = new Bst();
        String key = null;
        assertNull(b.elementWithKey(key));

    }

    /**
     * Test element with key a.
     */
    @Test
    public void testElementWithKeyA() {
        Bst b = new Bst();
        b.insert('a');
        b.insert('b');
        b.insert('c');
        assertEquals('c', b.elementWithKey('c'));
    }

    /**
     * Removes the root is null.
     */
    @Test
    public void removeRootIsNull() {
        Bst b = new Bst();
        b.removeElementWithKey(null);
        assertEquals(0, b.size());
    }

    /**
     * Test height.
     */
    @Test
    public void testHeight1() {
        Bst b = new Bst();
        b.insert(1);
        b.insert(2);
        b.insert(3);
        int actual = b.height();
        assertEquals(3, actual);
    }

    /**
     * Test m height2.
     */
    @Test
    public void testMHeight2() {
        Bst b = new Bst();
        b.insert("f");
        b.insert("b");
        b.insert("a");
        b.insert("d");
        b.insert("c");
        b.insert("e");
        b.insert("g");
        b.insert("i");
        b.insert("h");
        int height = b.height();
        assertEquals(4, height);
    }

    /**
     * Test preorder string.
     */
    @Test
    public void testPreorderString() {
        Bst b = new Bst();
        b.insert("f");
        b.insert("b");
        b.insert("a");
        b.insert("d");
        b.insert("c");
        b.insert("e");
        b.insert("g");
        b.insert("i");
        b.insert("h");
        String actual = b.preorderString();
        String expected = "{f, b, a, d, c, e, g, i, h}";
        assertEquals(expected, actual);
    }

    /**
     * Test remove1.
     */
    @Test
    public void testRemove1() {
        Bst b = new Bst();
        b.insert("f");
        b.insert("b");
        b.insert("a");
        b.insert("d");
        b.insert("c");
        b.insert("e");
        b.insert("g");
        b.insert("i");
        b.insert("h");
        b.removeElementWithKey("c");
        String actual = b.preorderString();
        String expected = "{f, b, a, d, e, g, i, h}";
        assertEquals(expected, actual);
    }

    /**
     * Test preorder string null.
     */
    @Test
    public void testPreorderStringNull() {
        Bst b = new Bst();
        String actual = b.preorderString();
        assertEquals("{}", actual);
    }

    /**
     * Test maximum element.
     */
    @Test
    public void testMaximumElement() {
        Bst b = new Bst();
        b.insert("f");
        b.insert("b");
        b.insert("a");
        b.insert("d");
        b.insert("c");
        b.insert("e");
        b.insert("g");
        b.insert("i");
        b.insert("h");
        String actual = (String) b.maximumElement();
        assertEquals("i", actual);
    }

    /**
     * Test maximum element null.
     */
    @Test
    public void testMaximumElementNull() {
        Bst b = new Bst();
        String actual = (String) b.maximumElement();
        assertEquals(null, actual);
    }

    /**
     * Test remove2.
     */
    @Test
    public void testRemove2() {
        Bst b = new Bst();
        b.insert("f");
        b.insert("b");
        b.insert("a");
        b.insert("d");
        b.insert("c");
        b.insert("e");
        b.insert("g");
        b.insert("i");
        b.insert("h");
        b.removeElementWithKey("e");
        String actual = b.preorderString();
        String expected = "{f, b, a, d, c, g, i, h}";
        assertEquals(expected, actual);
    }

    /**
     * Test remove3.
     */
    @Test
    public void testRemove3() {
        Bst b = new Bst();
        b.insert("f");
        b.insert("b");
        b.insert("a");
        b.insert("d");
        b.insert("c");
        b.insert("e");
        b.insert("g");
        b.insert("i");
        b.insert("h");
        b.removeElementWithKey("d");
        String actual = b.preorderString();
        String expected = "{f, b, a, c, e, g, i, h}";
        assertEquals(expected, actual);
    }

    /**
     * Test remove4.
     */
    @Test
    public void testRemove4() {
        Bst b = new Bst();
        b.insert("f");
        b.insert("b");
        b.insert("a");
        b.insert("d");
        b.insert("c");
        b.insert("e");
        b.insert("g");
        b.insert("i");
        b.insert("h");
        b.removeElementWithKey("f");
        String actual = b.preorderString();
        String expected = "{e, b, a, d, c, g, i, h}";
        assertEquals(expected, actual);
    }

}
