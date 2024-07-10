package com.codewars.level7kyu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;


public class Ex11_SumNoDuplicatesTest {
    @Test
    void sampleTests() {
       assertEquals(5 , Ex11_SumNoDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 3}));
       assertEquals(6 , Ex11_SumNoDuplicates.sumNoDuplicates(new int[]{1, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1,2,3}));
       assertEquals(3 , Ex11_SumNoDuplicates.sumNoDuplicates(new int[]{1, 1, 2, 2, 3}), "Incorrect answer for arr = "+ Arrays.toString(new int[]{1, 1, 2, 2, 3}));
    }
}


    
