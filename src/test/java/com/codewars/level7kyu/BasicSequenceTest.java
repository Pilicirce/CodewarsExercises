package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BasicSequenceTest {
    
    @Test
    void testKnownValues() {
      assertArrayEquals(new int[]{0, 1, 3, 6}, BasicSequence.sumOfN(3));
      assertArrayEquals(new int[]{0, -1, -3, -6, -10}, BasicSequence.sumOfN(-4));
      assertArrayEquals(new int[]{0, 1}, BasicSequence.sumOfN(1));
      assertArrayEquals(new int[]{0}, BasicSequence.sumOfN(0));
    }
}
