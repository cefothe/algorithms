package algorithams.iterator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayIteratorTest {

    @Test
    public void test() {
	Integer[] values = { 4, 5, 6, 7 };
	ArrayIterator<Integer> arrayIterator = new ArrayIterator<Integer>(values, 0, 3);
	arrayIterator.first();
	assertEquals(new Integer(4), arrayIterator.current());
    }

}
