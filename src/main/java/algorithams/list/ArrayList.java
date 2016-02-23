package algorithams.list;

import org.apache.commons.lang.Validate;

import algorithams.iterator.ArrayIterator;
import algorithams.iterator.Iterator;
import algorithams.iterator.IteratorOutBoundsException;

/**
 * 
 * @author cefothe
 *
 * @param <T>
 */
public class ArrayList<T> implements List<T> {

    private final static int DEFAULT_INITIAL_CAPACITY = 20;

    private T[] _array;
    private int _size;
    private final int _initialCapacity;

    public ArrayList() {
	this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayList(int initialCapasity) {
	if (initialCapasity < 0) {
	    throw new IllegalArgumentException("Initial capasity must be >0");
	}
	_initialCapacity = initialCapasity;
	clear();
    }

    /**
     * 
     */
    public Iterator<T> iterator() {
	return new ArrayIterator<T>(_array, 0, _size);
    }

    /**
     * 
     * @param index
     * @param value
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, T value) throws IndexOutOfBoundsException {
	Validate.notNull(value);
	if (index < 0 || index > _size) {
	    throw new IteratorOutBoundsException();
	}
	ensureCapacity(_size + 1);
	System.arraycopy(_array, index, _array, index + 1, _size);
	_array[index] = value;
	++_size;
    }

    /**
     * Reduce array size
     * 
     * @param capacity
     */
    @SuppressWarnings("unchecked")
    private void ensureCapacity(int capacity) {
	Validate.notNull(capacity);
	if (_array.length < capacity) {
	    T[] copy = (T[]) new Object[capacity + capacity / 2];
	    System.arraycopy(_array, 0, copy, 0, _size);
	    _array = copy;
	}

    }

    /**
     * Delete element by index
     * 
     * @param index
     */
    public void delete(int index) throws IndexOutOfBoundsException {
	checkOutOfBounds(index);
	int copyFromIndex = index + 1;
	if (copyFromIndex < _size) {
	    System.arraycopy(_array, copyFromIndex, _array, index, _size - copyFromIndex);
	}
	_array[--_size] = null;

    }

    public T get(int index) throws IndexOutOfBoundsException {
	// TODO Auto-generated method stub
	return null;
    }

    public int size() {
	return _size;
    }

    public void set(int index, T value) throws IndexOutOfBoundsException {
	// TODO Auto-generated method stub

    }

    public boolean delete(T value) {
	// TODO Auto-generated method stub
	return false;
    }

    /**
     * 
     */
    public boolean contains(T value) {
	return indexOf(value) != -1;
    }

    /**
     * 
     */
    public int indexOf(Object value) {
	Validate.notNull(value);
	for (int i = 0; i < _size; ++i) {
	    if (value.equals(_array[i])) {
		return i;
	    }
	}
	return -1;
    }

    public boolean isEmpty() {
	return this._size == 0;
    }

    /**
     * Clear all element in array
     */
    @SuppressWarnings("unchecked")
    public void clear() {
	this._array = (T[]) new Object[_initialCapacity];
	this._size = 0;

    }

    /**
     * Add the element on last position
     */
    public void add(T value) {
	insert(_size, value);
    }

    private void checkOutOfBounds(int index) {
	if (isOutOfBounds(index)) {
	    throw new IndexOutOfBoundsException();
	}
    }

    private boolean isOutOfBounds(int index) {
	return index < 0 || index > _size;
    }
}
