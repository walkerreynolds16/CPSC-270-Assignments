package Assignment3;

/**
 * The Class Bst.
 * 
 * @author Walker
 * @version 4092016
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Bst {

    /** The root. */
    private Node root;

    /** The size. */
    private int size;

    /**
     * Instantiates a new bst.
     */
    public Bst() {
        root = null;
        size = 0;
    }

    /**
     * Insert.
     *
     * @param item
     *            the item
     */
    public void insert(Comparable item) {
        if (elementWithKey(item) == null) {// if the item isn't in the tree
            root = insertHelper(root, item);
            size++;
        }
    }

    /**
     * Element with key.
     *
     * @param key
     *            the key
     * @return the comparable
     */
    public Comparable elementWithKey(Comparable key) {
        boolean result = elementWithKeyHelper(root, key); //boolean result. If true, key is in the tree. Else it isn't
        if (result) {
            return key;
        }
        else {
            return null;
        }
    }

    /**
     * Removes the element with key.
     *
     * @param key
     *            the key
     */
    public void removeElementWithKey(String key) {
        boolean temp = elementWithKeyHelper(root, key); //check if element is in the tree
        if (temp) {
            root = removeHelper(root, key);
            size--;
        }
    }

    /**
     * Preorder string.
     *
     * @return the string
     */
    public String preorderString() {
        if (root == null) { //if tree equals null
            return "{}";
        }
        else {
            String result = preorderStringHelper(root); //gets comma separated list of nodes
            result = result.substring(0, result.length() - 2); // gets rid of last to characters (comma and space).
            result = "{" + result + "}"; //adds brackets
            return result;
        }

    }

    /**
     * Maximum element.
     *
     * @return the comparable
     */
    public Comparable maximumElement() {
        return maximumElementHelper(root);
    }

    /**
     * Height.
     *
     * @return the int
     */
    public int height() {
        return heightHelper(root);
    }

    /**
     * Size.
     *
     * @return the int
     */
    public int size() {
        return size;
    }

    /**
     * Insert helper.
     *
     * @param rt
     *            the rt
     * @param item
     *            the item
     * @return the node
     */
    private Node insertHelper(Node rt, Comparable item) {
        if (rt == null) {//if root is null, return a new node containing item
            return new Node(item);
        }
        if (rt.getValue().compareTo(item) < 0) {//if item is greater than root
            rt.setRight(insertHelper(rt.getRight(), item)); //must set root equal to insertHelper of right node
        }
        else { //if item is less than root
            rt.setLeft(insertHelper(rt.getLeft(), item)); //must set root equal to insertHelper of left node
        }

        return rt;
    }

    /**
     * Element with key helper.
     *
     * @param rt
     *            the rt
     * @param item
     *            the item
     * @return the comparable
     */
    private boolean elementWithKeyHelper(Node rt, Comparable item) {
        if (rt == null) { //if root is null, item isn't in the tree
            return false;
        }

        if (rt.getValue().equals(item)) { //if it finds the item in the tree, return true
            return true;
        }
        else { //look on the left and right for item, if one of them find it, return true
            return elementWithKeyHelper(rt.getLeft(), item) || elementWithKeyHelper(rt.getRight(), item);
        }

    }

    /**
     * Removes the helper.
     *
     * @param rt
     *            the rt
     * @param key
     *            the key
     * @return the node
     */
    private Node removeHelper(Node rt, Comparable key) {
        
        if (rt.getValue().compareTo(key) > 0) { //if root is greater than key
            rt.setLeft(removeHelper(rt.getLeft(), key)); //set root equal to removeHelper of the left root
        }
        else if (rt.getValue().compareTo(key) < 0) { //if root is less than key
            rt.setRight(removeHelper(rt.getRight(), key)); //set root equal to removeHelper of the right root
        }
        else {
            if (rt.getLeft() == null) { //if root get left is null, return root get right
                return rt.getRight();
            }
            else if (rt.getRight() == null) { //if root get right is null, return root get left
                return rt.getLeft();
            }
            else {
                Node temp = getMaxHelper(rt.getLeft()); //get max of the two nodes of the left side
                rt.setValue(temp.getValue()); //set root equal
                rt.setLeft(deleteMaxHelper(rt.getLeft())); //set the root equal to root without the max node
            }
        }

        return rt;
    }

    /**
     * Gets the max helper.
     *
     * @param rt
     *            the rt
     * @return the max helper
     */
    private Node getMaxHelper(Node rt) {
        if (rt.getRight() == null) {//if the right node equals null, return root
            return rt;
        }
        else { //if there is another right node, keep going
            return getMaxHelper(rt.getRight());
        }

    }

    /**
     * Delete max helper.
     *
     * @param rt
     *            the rt
     * @return the node
     */
    private Node deleteMaxHelper(Node rt) {
        if (rt.getRight() == null) {
            return rt.getLeft();
        }
        rt.setRight(deleteMaxHelper(rt.getRight()));
        return rt;
    }

    /**
     * Preorder string helper.
     *
     * @param rt
     *            the rt
     * @return the string
     */
    private String preorderStringHelper(Node rt) {

        String left = "";
        String right = "";

        if (rt.getLeft() != null) {
            left = preorderStringHelper(rt.getLeft());
        }
        if (rt.getRight() != null) {
            right = preorderStringHelper(rt.getRight());
        }

        return rt.getValue() + ", " + left + right;
    }

    /**
     * Maximum element helper.
     *
     * @param rt
     *            the rt
     * @return the comparable
     */
    private Comparable maximumElementHelper(Node rt) {
        Comparable result = null;
        if (rt == null) {
            return null;
        }
        if (rt.getRight() != null) {
            result = maximumElementHelper(rt.getRight());
        }
        else {
            result = rt.getValue();
        }
        return result;
    }

    /**
     * Height helper.
     *
     * @param rt
     *            the rt
     * @return the int
     */
    private int heightHelper(Node rt) {
        if (rt == null) {
            return 0;
        }
        else {
            return 1 + Math.max(heightHelper(rt.getLeft()),
                    heightHelper(rt.getRight()));
        }

    }

}
