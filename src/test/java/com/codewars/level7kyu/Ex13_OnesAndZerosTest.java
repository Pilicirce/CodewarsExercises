package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex13_OnesAndZerosTest {
    
    @org.junit.Test
    public void convertBinaryArrayToInt() throws Exception {

      assertEquals(1, Ex13_OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
      assertEquals(15, Ex13_OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
      assertEquals(6, Ex13_OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
      assertEquals(9, Ex13_OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));


    }
}

