package com.codewars.level7kyu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;


public class SumNoDuplicatesTest {
    @Test
    void sampleTests() {
       assertEquals(5 , SumNoDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 3}));
       assertEquals(6 , SumNoDuplicates.sumNoDuplicates(new int[]{1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1,2,3}));
       assertEquals(3 , SumNoDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 2, 3}));
    }
}


    
