package com.codewars.level7kyu;

public class BasicSequence {
    public static int[] sumOfN(int n) {

        int length = Math.abs(n) + 1;
        int[] result = new int[length];

        int sum = 0;
        
        for (int i = 0; i < length; i++) {
            sum += (n < 0 ? -i : i);
            result[i] = sum;
        }

        return result; 
      }
}
