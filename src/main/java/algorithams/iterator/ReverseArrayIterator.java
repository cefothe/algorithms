package algorithams.iterator;

import org.apache.commons.lang.Validate;

/**
 * TODO: make a JUnit test for Reverse Iterator
 * @author Stefan Angelov (cefothe)
 */
public class ReverseArrayIterator implements Iterator {

	private Iterator _arrayIterator;
	
	/**
	 * Constructor to create a ReverseIterator
	 * @param arrayIterator This should be {@link ArrayIteratorTest}
	 */
	public ReverseArrayIterator(Iterator arrayIterator){
		Validate.notNull(arrayIterator);
		_arrayIterator = arrayIterator;
	}
	
	public void first() {
		_arrayIterator.last();
		
	}

	public void last() {
		_arrayIterator.first();
		
	}

	public boolean isDone() {
		return _arrayIterator.isDone();
	}

	public void next() {
		_arrayIterator.previus();
		
	}

	public void previus() {
        _arrayIterator.next();
		
	}

	public Object current() throws IteratorOutBoundsException {
		return _arrayIterator.current();
	}
 
}
