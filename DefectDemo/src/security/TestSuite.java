package security;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite {
  
	@Test
  public void add() {
		SecurityUI.counter = 0;
		SecurityUI.add1();
		Assert.assertEquals(SecurityUI.counter, 1);
  }
	
	@Test
	public void minus() {
		SecurityUI.counter = 0;
		SecurityUI.minus1();
		Assert.assertEquals(SecurityUI.counter, -1);
	}
	
	@Test
	public void testCase1() {
		SecurityUI.counter = 0;
		SecurityUI.add1();
		SecurityUI.add1();
		SecurityUI.add1();
		SecurityUI.add1();
		SecurityUI.minus1();
		Assert.assertEquals(SecurityUI.counter, 3);
	}
	
	@Test
	public void testCase2() {
		SecurityUI.counter = 0;
		SecurityUI.add1();
		SecurityUI.minus1();
		SecurityUI.add1();
		SecurityUI.minus1();
		SecurityUI.add1();
		SecurityUI.minus1();
		SecurityUI.add1();
		SecurityUI.minus1();
		Assert.assertEquals(SecurityUI.counter, 0);
	}
	
	@Test
	public void testCase3() {
		SecurityUI.counter = 0;
		SecurityUI.minus1();
		SecurityUI.minus1();
		SecurityUI.minus1();
		SecurityUI.minus1();
		SecurityUI.add1();
		Assert.assertEquals(SecurityUI.counter, -3);
	}
}
