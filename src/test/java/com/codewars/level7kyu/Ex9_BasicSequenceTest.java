package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Ex9_BasicSequenceTest {
    
    @Test
    void testKnownValues() {
      assertArrayEquals(new int[]{0, 1, 3, 6}, Ex9_BasicSequence.sumOfN(3));
      assertArrayEquals(new int[]{0, -1, -3, -6, -10}, Ex9_BasicSequence.sumOfN(-4));
      assertArrayEquals(new int[]{0, 1}, Ex9_BasicSequence.sumOfN(1));
      assertArrayEquals(new int[]{0}, Ex9_BasicSequence.sumOfN(0));
    }
}
