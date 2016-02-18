package algorithams.iterator;

/**
 * 
 * @author Stefan Angelov (cefothe)
 */
public interface Iterator<T> {

    public void first();

    public void last();

    public boolean isDone();

    public void next();

    public void previus();

    public T current() throws IteratorOutBoundsException;
}
