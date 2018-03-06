package Assignment3;

/**
 * The Class Node.
 * 
 * @author Walker
 * @version 4092016
 */
public class Node {

    /** The value. */
    private Comparable value;

    /** The left. */
    private Node left;

    /** The right. */
    private Node right;

    /**
     * Instantiates a new node.
     *
     * @param value
     *            the value
     */
    public Node(Comparable value) {
        this.setValue(value);
        this.setLeft(null);
        this.setRight(null);
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public Comparable getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the new value
     */
    public void setValue(Comparable value) {
        this.value = value;
    }

    /**
     * Gets the left.
     *
     * @return the left
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Sets the left.
     *
     * @param left
     *            the new left
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Gets the right.
     *
     * @return the right
     */
    public Node getRight() {
        return right;
    }

    /**
     * Sets the right.
     *
     * @param right
     *            the new right
     */
    public void setRight(Node right) {
        this.right = right;
    }

}
