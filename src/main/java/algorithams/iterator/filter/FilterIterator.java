package algorithams.iterator.filter;

import org.apache.commons.lang.Validate;

import algorithams.iterator.Iterator;
import algorithams.iterator.IteratorOutBoundsException;

/**
 * 
 * @author stefan
 *
 */
public class FilterIterator implements Iterator {

    private final Iterator _iterator;
    private final Pedicate _pedicate;

    public FilterIterator(Iterator iterator, Pedicate pedicate) {
	Validate.notNull(pedicate);
	Validate.notNull(iterator);

	this._iterator = iterator;
	this._pedicate = pedicate;
    }

    public void first() {
	_iterator.first();
	filterForwards();
    }

    public void last() {
	_iterator.last();
	filterBackwards();
    }

    public boolean isDone() {
	return _iterator.isDone();
    }

    public void next() {
	_iterator.next();
	filterForwards();

    }

    public void previus() {
	_iterator.previus();
	filterBackwards();
    }

    public Object current() throws IteratorOutBoundsException {
	return _iterator.current();
    }

    /**
     * Filter forwards to next value which corresponds to pedicate
     */
    private void filterForwards() {
	while (!_iterator.isDone() && !_pedicate.equals(_iterator.current())) {
	    _iterator.next();
	}
    }

    /**
     * Filter backwards to previus value which corresponds to pedicate
     */
    private void filterBackwards() {
	while (!_iterator.isDone() && !_pedicate.equals(_iterator.current())) {
	    _iterator.previus();
	}
    }
}
