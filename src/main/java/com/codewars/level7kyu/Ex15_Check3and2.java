package com.codewars.level7kyu;

import java.util.HashMap;
import java.util.Map;

public class Ex15_Check3and2 {
    public boolean checkThreeAndTwo(char[] chars) {
// Crear un mapa para almacenar los conteos de cada carácter
Map<Character, Integer> countMap = new HashMap<>();

// Contar la cantidad de cada carácter en el array
for (char c : chars) {
    countMap.put(c, countMap.getOrDefault(c, 0) + 1);
}

// Verificar los conteos
boolean hasThree = false;
boolean hasTwo = false;

for (int count : countMap.values()) {
    if (count == 3) {
        hasThree = true;
    } else if (count == 2) {
        hasTwo = true;
    }
}

// Devolver true si hay un carácter que aparece 3 veces y otro que aparece 2 veces
return hasThree && hasTwo;
}
}
