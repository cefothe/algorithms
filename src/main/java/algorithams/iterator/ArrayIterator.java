package algorithams.iterator;

import org.apache.commons.lang.Validate;
/**
 * TODO: make a JUnit test for Iterator
 * @author Stefan Angelov (cefothe)
 */
public class ArrayIterator implements Iterator {

	private final Object[] _array;
	private final int _start;
	private final int _end;
	private int _current =-1;
	
	public ArrayIterator(Object[] array,int start, int end){
		//Validate all parameters to null values
		Validate.notNull(array);
		Validate.notNull(start);
		Validate.notNull(end);
		//Check for correct start and end index 
		if(start<0 || end>= array.length || start>end){
			throw new IllegalArgumentException();
		}
		this._array=array;
		this._start=start;
		this._end= end;
	}
	
	public void first() {
		
		_current = _start;
	}

	public void last() {
		_current = _end;		
	}

	public boolean isDone() {
		return _current<_start || _current>_end;
	}

	public void next() {
		_current++;
		
	}

	public void previus() {
		_current--;
		
	}

	public Object current() throws IteratorOutBoundsException {
		if(isDone()){
			throw new IteratorOutBoundsException();
		}
		return  _array[_current];
	}

}
