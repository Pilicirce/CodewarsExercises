package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex12_FindDivisorTest {
    Ex12_FindDivisor fd = new Ex12_FindDivisor();

	@Test
	public void oneTest() {
		assertEquals("Should return 1 if the parameter equals 1", 1, fd.numberOfDivisors(1));
	}

	@Test
	public void fourTest() {
		assertEquals("Should return 3 if the parameter equals 4", 3, fd.numberOfDivisors(4));
	}
  
	@Test
	public void fiveTest() {
		assertEquals("Should return 2 if the parameter equals 5", 2, fd.numberOfDivisors(5));
	}
  
	@Test
	public void twelveTest() {
		assertEquals("Should return 6 if the parameter equals 12", 6, fd.numberOfDivisors(12));
	}
  
	@Test
	public void thirtyTest() {
		assertEquals("Should return 8 if the parameter equals 30", 8, fd.numberOfDivisors(30));
	}
}

