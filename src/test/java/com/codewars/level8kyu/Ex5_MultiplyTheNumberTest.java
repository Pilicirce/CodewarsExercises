package com.codewars.level8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex5_MultiplyTheNumberTest {
    
    @Test
  void tests() {
    assertEquals(15, Ex5_MultiplyTheNumber.multiply(3), "For number = 3");
    assertEquals(250, Ex5_MultiplyTheNumber.multiply(10), "For number = 10");
    assertEquals(25000, Ex5_MultiplyTheNumber.multiply(200), "For number = 200");
    assertEquals(0, Ex5_MultiplyTheNumber.multiply(0), "For number = 0");
    assertEquals(-15, Ex5_MultiplyTheNumber.multiply(-3), "For number = -3");
  }

}
