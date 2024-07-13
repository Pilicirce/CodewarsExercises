package com.codewars.level7kyu;

import java.util.List;

public class Ex13_OnesAndZeros {
    
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int length = binary.size();

        for (int i = 0; i < length; i++) {
            int bit = binary.get(i);
            result += bit * Math.pow(2, length - 1 - i);
        }

        return result;
    }
}
