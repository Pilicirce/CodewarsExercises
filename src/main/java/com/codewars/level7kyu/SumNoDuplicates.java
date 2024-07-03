package com.codewars.level7kyu;

import java.util.HashMap;
import java.util.Map;

public class SumNoDuplicates{
    public static int sumNoDuplicates(int[] arr){
     // Paso 1: Crear un `Map` para almacenar el conteo de cada número
     Map<Integer, Integer> countMap = new HashMap<>();

     // Paso 2: Recorrer el array y llenar el `Map` con los conteos
     for (int num : arr) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    // Paso 3: Recorrer el `Map` y sumar los números que tienen un conteo de 1
    int sum = 0;
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
        if (entry.getValue() == 1) {
            sum += entry.getKey();
        }
    }
     
    return sum;
    
    }
}

