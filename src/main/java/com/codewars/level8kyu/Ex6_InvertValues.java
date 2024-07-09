package com.codewars.level8kyu;

public class Ex6_InvertValues {
    public static int[] invert(int[] array) {
        //para inicializar un nuevo array con la misma longitud que el de entrada
        int[] invertedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            invertedArray[i] = -array[i];
            //otra forma: array[i] *= -1;
        }

        return invertedArray;
      }
    
}
