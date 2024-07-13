package com.codewars.level7kyu;

public class Ex14_ReverseLetter {
    public static String reverseLetter(final String str) {
        
    // Filtrar caracteres no alfabéticos y construir la cadena resultante
    StringBuilder filteredString = new StringBuilder();
    for (char c : str.toCharArray()) {
        if (Character.isLetter(c)) {
            filteredString.append(c);
        }
    }
    
    // Invertir la cadena resultante
    return filteredString.reverse().toString();
}
}
