package Midterm;

public interface Slist {
    /**
     * Adds the parameter item after the current element
     * 
     * @param item
     *            element
     */
    public void addAfter(Object item);

    /**
     * Sets the current element to the next element in the list
     * 
     */
    public void next();

    /**
     * Sets the current element to the previous element in the list
     * 
     */
    public void prev();

    /**
     * Sets the current element to the first element of the list
     * 
     */
    public void mkFirstTheCurrent();

    /**
     * Returns the current element. If the list is empty, it throws an
     * IllegalStateException
     * 
     * @return current value
     */
    public Object getValue() throws IllegalStateException;
}
