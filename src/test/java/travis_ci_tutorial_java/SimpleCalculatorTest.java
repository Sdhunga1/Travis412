package travis_ci_tutorial_java;


import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(1, 1), 0);
		
	}
	@Test
	public void testdivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(1, 1), 1);
		
	}
	@Test
	public void testmultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(1, 1), 1);
		
	}
	
}
