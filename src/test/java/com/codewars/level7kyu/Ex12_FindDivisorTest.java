package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex12_FindDivisorTest {
    Ex12_FindDivisor fd = new Ex12_FindDivisor();

	@Test
	public void oneTest() {
		assertEquals(1, fd.numberOfDivisors(1), "Should return 1 if the parameter equals 1");
	}

	@Test
	public void fourTest() {
		assertEquals(3, fd.numberOfDivisors(4), "Should return 3 if the parameter equals 4");
	}
  
	@Test
	public void fiveTest() {
		assertEquals(2, fd.numberOfDivisors(5), "Should return 2 if the parameter equals 5");
	}
  
	@Test
	public void twelveTest() {
		assertEquals(6, fd.numberOfDivisors(12), "Should return 6 if the parameter equals 12");
	}
  
	@Test
	public void thirtyTest() {
		assertEquals(8, fd.numberOfDivisors(30), "Should return 8 if the parameter equals 30");
	}
}

