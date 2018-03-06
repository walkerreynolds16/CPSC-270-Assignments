package Midterm;

public class Midterm1 implements Slist {

    /** The Head Node */
    private Node head;

    /** The Current Node */
    private Node curr;

    /** The Tail Node */
    private Node tail;

    /** The List Size */
    private int listSize;

    /**
     * Creates a new Midterm1 object and runs the clear method
     * 
     */
    public Midterm1() {
        clear();
    }

    /**
     * Makes the tail a null Node and sets head and curr equal to the tail. It
     * also sets the listSize equal to 0
     * 
     */
    public void clear() {
        tail = new Node(null);
        head = tail;
        curr = tail;
        listSize = 0;
    }

    /**
     * Adds the parameter item after the current element
     * 
     * @param item
     *            element
     */
    @Override
    public void addAfter(Object item) {
        if (curr == head && curr == tail) {
            head.setNext(new Node(tail, item));
            curr = head.getNext();

        }
        else if (curr == tail) {
            Node temp = new Node(tail, item);
            tail = temp.getNext();
            curr.setNext(temp);
            curr = curr.getNext();

        }
        else {
            Node temp = new Node(curr.getNext(), item);
            curr.setNext(temp);
            curr = curr.getNext();
        }

        listSize++;
    }

    /**
     * Sets the current element to the next element in the list
     * 
     */
    @Override
    public void next() {
        curr = curr.getNext();

    }

    /**
     * Sets the current element to the previous element in the list
     * 
     */
    @Override
    public void prev() {
        Node temp = head.getNext();

        while (temp.getNext() != curr) {
            temp = temp.getNext();
        }

        curr = temp;

    }

    /**
     * Sets the current element to the first element of the list
     * 
     */
    @Override
    public void mkFirstTheCurrent() {
        if (listSize == 0) {
            return;
        }
        else {
            curr = head.getNext();
        }

    }

    /**
     * Returns the current element. If the list is empty, it throws an
     * IllegalStateException
     * 
     * @return current value
     */
    @Override
    public Object getValue() throws IllegalStateException {
        if (listSize == 0) {
            throw new IllegalStateException();
        }
        else {
            return curr.getElement();
        }
    }

    /**
     * Returns list size
     * 
     * @return list size
     */
    public int getListSize() {
        return listSize;
    }

}
