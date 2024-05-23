package com.codewars;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PowersOf2Test {
        @Test
        public void testSomething() {
          assertArrayEquals(new long[]{1}, PowersOf2.powersOfTwo(0));
          assertArrayEquals(new long[]{1,2}, PowersOf2.powersOfTwo(1));
          assertArrayEquals(new long[]{1,2,4,8,16}, PowersOf2.powersOfTwo(4));
        }

}
