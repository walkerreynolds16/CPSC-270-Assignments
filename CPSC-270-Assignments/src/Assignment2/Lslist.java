package Assignment2;

/**
 * The Class Lslist.
 * 
 * @author Walker
 * 
 * @version 02/14/2016
 */
public class Lslist {

    /** The head. */
    private Node head;

    /** The tail. */
    private Node tail;

    /** The curr. */
    private Node curr;

    /** The list size. */
    private int listSize;

    /**
     * Instantiates a new lslist.
     */
    public Lslist() {
        clear();
    }

    /**
     * Remove all elements from this list so it is once again empty.
     */
    public void clear() {
        tail = new Node(null);
        curr = tail;
        head = tail;
        listSize = 0;
    }

    /**
     * Add the specified object to this list. The object is added AFTER the
     * current element in this list, and BECOMES the current element. The
     * previous current element, if any, is found immediately BEFORE the newly
     * added element.
     *
     * @param item
     *            the item
     */
    public void addAfter(Object item) {
        if (tail == curr) {
            Node temp = new Node(item, tail);

            head = temp;
            curr = temp;
        }
        else {
            Node temp = new Node(item, curr.getNext());
            curr.setNext(temp);
            curr = temp;
        }
        listSize++;
    }

    /**
     * Add the specified object to this list. The object is added BEFORE the
     * current element in this list, and BECOMES the current element. The
     * previous current element, if any, is found immediately AFTER the newly
     * added element..
     *
     * @param item
     *            the item
     */
    public void addBefore(Object item) {
        Node temp = new Node(item, curr);

        if (prev()) {
            curr.setNext(temp);
            curr = temp;

        }
        else {
            head = temp;
            curr = temp;
        }

        listSize++;
    }

    /**
     * Remove the current element from this list. The element after the removed
     * element becomes the new current element. If there is no element after,
     * then the element before becomes the new current element.
     */
    public void remove() {

        if (curr.getNext() == tail) {
            if (prev()) {
                curr.setNext(tail);
            }
            else {
                head = tail;
                curr = tail;

            }
        }
        else if (prev()) {
            curr.setNext(curr.getNext().getNext());
            curr = curr.getNext();
        }
        else {
            head = head.getNext();
            curr = head;
        }

        listSize--;
    }

    /**
     * Make the element immediately before the current element, the new current
     * element. No change is made if the current element is the first element.
     *
     * @return true, if successful
     */
    public boolean prev() {
        if (head == curr) {
            return false;
        }
        else {
            Node temp = head;

            while (temp.getNext() != curr) {
                temp = temp.getNext();
            }

            curr = temp;
            return true;
        }
    }

    /**
     * Make the element immediately after the current element, the new current
     * element. No change is made if the current element is the last element.
     *
     * @return true, if successful
     */
    public boolean next() {
        if (curr.getNext() == tail) {
            return false;
        }
        else {
            curr = curr.getNext();
            return true;
        }
    }

    /**
     * Determine the number of elements in this list.
     *
     * @return the int
     */
    public int length() {
        return listSize;
    }

    /**
     * Get the current element. If the list is empty, throw an
     * IllegalStateException.
     *
     * @return the value
     * @throws IllegalStateException
     *             the illegal state exception
     */
    public Object getValue() throws IllegalStateException {
        if (head == tail) {
            throw new IllegalStateException();
        }
        else {
            return curr.getObj();
        }
    }
}
