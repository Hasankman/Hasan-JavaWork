package Unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
	@Test // check if FindBig() method returns the right result.
	public void runFindBig() {
		// assertEquals checks if the first argument if equal to the 2nd
		assertEquals(500,Calculator.findBig(300, 500));
	}
	@Test // check if FindSmall() method returns the right result.
	public void runFindSmall() {
		// assertEquals checks if the first argument if equal to the 2nd
		assertEquals(10,Calculator.findSmall(10, 20));
	}
	@Test // check if FindSmall() method returns the right result.
	public void runFindBiggest() {
		// assertEquals checks if the first argument if equal to the 2nd
		assertEquals(20,Calculator.findBiggest(10, 15, 20));
	}
	@Test // check if FindSmall() method returns the right result.
	public void runFindMax() {
		int[] array= {100, 200, 300, 400, 500};
		// assertEquals checks if the first argument if equal to the 2nd
		assertEquals(500,Calculator.findMax(array));
	}
}
