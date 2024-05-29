package com.codewars.level8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTheNumberTest {
    
    @Test
  void tests() {
    assertEquals(15, MultiplyTheNumber.multiply(3), "For number = 3");
    assertEquals(250, MultiplyTheNumber.multiply(10), "For number = 10");
    assertEquals(25000, MultiplyTheNumber.multiply(200), "For number = 200");
    assertEquals(0, MultiplyTheNumber.multiply(0), "For number = 0");
    assertEquals(-15, MultiplyTheNumber.multiply(-3), "For number = -3");
  }

}
