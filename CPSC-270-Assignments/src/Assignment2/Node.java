package Assignment2;

// TODO: Auto-generated Javadoc
/**
 * The Class Node.
 * 
 * @author Walker
 * 
 * @version 02/14/2016
 */
public class Node {

    /** The obj. */
    private Object obj;

    /** The next. */
    private Node next;

    /**
     * Instantiates a new node.
     *
     * @param next
     *            the next
     */
    public Node(Node next) {
        this.setNext(next);
        setObj(null);
    }

    /**
     * Instantiates a new node.
     *
     * @param obj
     *            the obj
     * @param next
     *            the next
     */
    public Node(Object obj, Node next) {
        this.setObj(obj);
        this.setNext(next);
    }

    /**
     * Gets the obj.
     *
     * @return the obj
     */
    public Object getObj() {
        return obj;
    }

    /**
     * Sets the obj.
     *
     * @param obj
     *            the new obj
     */
    public void setObj(Object obj) {
        this.obj = obj;
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

}
