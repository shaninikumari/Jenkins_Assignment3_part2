package IT7320_Assignment3.JenkinDemo;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	Calculator myCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		myCalculator=new Calculator();
	}

	public void testAdd() {
		double total=5.0 + 4.0+6.0;
		Assert.assertEquals( total, myCalculator.add(5.0,4.0,6.0), 0.0);
	}

	public void testMultiply() {
		double total=5.0*4.0*6.0;
		Assert.assertEquals(total, myCalculator.multiply(5.0,4.0,6.0), 0.0);
	}

	public void testSubstract() {
		double total=6.0 - 5.0;
		Assert.assertEquals(total, myCalculator.substract(6.0, 5.0), 0.0);
	}

}
