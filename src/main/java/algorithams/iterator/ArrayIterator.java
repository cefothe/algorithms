package algorithams.iterator;

import org.apache.commons.lang.Validate;

/**
 * TODO: make a JUnit test for Iterator
 * 
 * @author Stefan Angelov (cefothe)
 */
public class ArrayIterator<T> implements Iterator<T> {

    private final T[] _array;
    private final int _start;
    private final int _end;
    private int _current = -1;

    public ArrayIterator(T[] array, int start, int end) {
	// Validate all parameters to null values
	Validate.notNull(array);
	Validate.notNull(start);
	Validate.notNull(end);
	// Check for correct start and end index
	if (start < 0 || end >= array.length || start > end) {
	    throw new IllegalArgumentException();
	}
	this._array = array;
	this._start = start;
	this._end = end;
    }

    /**
     * This change Iterator position to start element
     */
    public void first() {

	_current = _start;
    }

    /**
     * This change Iterator position to end element
     */
    public void last() {
	_current = _end;
    }

    /**
     * Check if have values in array
     */
    public boolean isDone() {
	return _current < _start || _current > _end;
    }

    /**
     * Move position to next element in array
     */
    public void next() {
	_current++;

    }

    /**
     * Move position to previus element in array
     */
    public void previus() {
	_current--;

    }

    /**
     * @return {@link Object} Return current element
     */
    public T current() throws IteratorOutBoundsException {
	if (isDone()) {
	    throw new IteratorOutBoundsException();
	}
	return _array[_current];
    }

}
