package algorithams.list;

import algorithams.calculator.iterable.Iterable;

/**
 * Implement List interface
 * 
 * @author cefothe
 * 
 */
public interface List<T> extends Iterable<T> {

    /**
     * 
     * @param value
     */
    public void add(T value);

    /**
     * Insert element into list
     * 
     * @param index
     *            - position that insert element
     * @param value
     *            - element
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, T value) throws IndexOutOfBoundsException;

    /**
     * Delete element to list
     * 
     * @param index
     *            - position on delete element
     * @throws IndexOutOfBoundsException
     */
    public void delete(int index) throws IndexOutOfBoundsException;

    /**
     * Get element
     * 
     * @param index
     *            - position on element
     * @return - Element on position equals to index
     * @throws IndexOutOfBoundsException
     */
    public T get(int index) throws IndexOutOfBoundsException;

    /**
     * 
     * @return size on list
     */
    public int size();

    /**
     * Set element to custom position
     * 
     * @param index
     *            - position on new element
     * @param value
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, T value) throws IndexOutOfBoundsException;

    /**
     * 
     * @param value
     *            - Delete first element equals that value
     * @return
     */
    public boolean delete(T value);

    /**
     * Check value is exist
     * 
     * @param value
     * @return
     */
    public boolean contains(T value);

    /**
     * 
     * @param value
     * @return - position on element that equals on value
     */
    public int indexOf(Object value);

    /**
     * Check element is empty
     * 
     * @return
     */
    public boolean isEmpty();

    /**
     * Clear all element on list
     */
    public void clear();
}
