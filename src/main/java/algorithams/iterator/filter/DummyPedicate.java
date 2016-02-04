package algorithams.iterator.filter;

import org.apache.commons.lang.Validate;
import org.junit.Assert;

import algorithams.iterator.Iterator;

/**
 * This pedicate always return preliminary result
 * @author stefan
 *
 */
public class DummyPedicate  implements Pedicate{

	private final Iterator _iterator;
	private final boolean _result;
	
	public DummyPedicate(Iterator iterator, boolean result){
		Validate.notNull(iterator);
		Validate.notNull(result);
		
		this._iterator= iterator;
		this._result=result;
	}
	
	public boolean evaluate(Object object) {
		Assert.assertSame(_iterator.current(), object);
		_iterator.next();
		return _result;
	}

}
