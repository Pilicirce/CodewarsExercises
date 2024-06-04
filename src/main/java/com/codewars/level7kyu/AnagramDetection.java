package com.codewars.level7kyu;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        
        // Convertir ambas cadenas a minúsculas
        String lowerCaseTest = test.toLowerCase();
        String lowerCaseOriginal = original.toLowerCase();

        // Convertir las cadenas a arrays de caracteres y ordenarlos
        char[] testArray = lowerCaseTest.toCharArray();
        Arrays.sort(testArray);
        String sortedTest = new String(testArray);

        char[] originalArray = lowerCaseOriginal.toCharArray();
        Arrays.sort(originalArray);
        String sortedOriginal = new String(originalArray);
        
        // Comparar las cadenas ordenadas
        return sortedTest.equals(sortedOriginal);
      }
}
