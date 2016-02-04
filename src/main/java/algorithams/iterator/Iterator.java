package algorithams.iterator;
/**
 * 
 * @author Stefan Angelov (cefothe)
 */
public interface Iterator {
	
	public void first();
	
	public void last();

	public boolean isDone();
	
	public void next();
	
	public void previus();
	
	public Object current() throws IteratorOutBoundsException;
}
