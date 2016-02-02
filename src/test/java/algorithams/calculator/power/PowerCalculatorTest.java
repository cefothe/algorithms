package algorithams.calculator.power;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithams.calculator.power.PowerCalculator;

public class PowerCalculatorTest {

	@Test
	public void testAnythingRaisedToThePowerOfZeroIsOne() {
		assertEquals(1, PowerCalculator.F.calculate(0, 0));
		assertEquals(1, PowerCalculator.F.calculate(12, 0));
	}
	
	@Test
	public void testAnythingRaisedToThePowerOfOneIsItSelf(){
		assertEquals(12, PowerCalculator.F.calculate(12, 1));
		assertEquals(120, PowerCalculator.F.calculate(120, 1));
		assertEquals(111, PowerCalculator.F.calculate(111, 1));
	}
	
	@Test
	public void testAritrary(){
		assertEquals(0, PowerCalculator.F.calculate(0, 2));
		assertEquals(8, PowerCalculator.F.calculate(2, 3));
	}

}
