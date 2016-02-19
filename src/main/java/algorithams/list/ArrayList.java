package algorithams.list;

import org.apache.commons.lang.Validate;

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

    public Iterator<T> iterator() {
	// TODO Auto-generated method stub
	return null;
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

    public void delete(int index) throws IndexOutOfBoundsException {
	// TODO Auto-generated method stub

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

    public boolean contains(T value) {
	// TODO Auto-generated method stub
	return false;
    }

    public int indexOf(Object value) {
	// TODO Auto-generated method stub
	return 0;
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

}
