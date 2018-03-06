package Midterm;

/**
 * The Class Node.
 * 
 * @author Walker Reynolds
 * @version 022416
 */
public class Node {

    /** The next. */
    private Node next;

    /** The element. */
    private Object element;

    /**
     * Instantiates a new node.
     *
     * @param next
     *            the next
     * @param element
     *            the element
     */
    public Node(Node next, Object element) {
        this.next = next;
        this.element = element;
    }

    /**
     * Instantiates a new node.
     *
     * @param next
     *            the next
     */
    public Node(Node next) {
        this.next = next;
        this.element = null;
    }

    /**
     * Gets the next.
     *
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next.
     *
     * @param next
     *            the new next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Gets the element.
     *
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * Sets the element.
     *
     * @param element
     *            the new element
     */
    public void setElement(Object element) {
        this.element = element;
    }
}
