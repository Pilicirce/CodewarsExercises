package com.codewars.level8kyu;

import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Tests")
class InvertValuesTest {
  private void runTest(int[] expected, int[] input) {
    assertArrayEquals(expected, InvertValues.invert(input), () -> String.format("Input: %s", Arrays.toString(input)));
  }

  @Test
  @DisplayName("Sample Tests")
  void sampleTests() {
    runTest(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5});
    runTest(new int[]{-1, 2, -3, 4, -5}, new int[]{1, -2, 3, -4, 5});
    runTest(new int[]{1, 2, 3, 4, 5}, new int[]{-1, -2, -3, -4, -5});
    runTest(new int[]{}, new int[]{});
    runTest(new int[]{0}, new int[]{0});
  }
}


