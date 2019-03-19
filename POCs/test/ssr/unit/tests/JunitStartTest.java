package ssr.unit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitStartTest {

	@Test
	public void testAllPositiveNumbers() {
		JunitStart js = new JunitStart();
		assertEquals(40, js.addPositiveNumbers(20, 20));
	}
	@Test
	public void testOnePositiveNumbers() {
		JunitStart js = new JunitStart();
		assertEquals(40, js.addPositiveNumbers(20, -20));
	}
	@Test
	public void testAllNegativeNumbers() {
		JunitStart js = new JunitStart();
		assertEquals(40, js.addPositiveNumbers(-20, -20));
	}
	
}
