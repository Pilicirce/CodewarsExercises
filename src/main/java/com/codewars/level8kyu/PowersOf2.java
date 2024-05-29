package com.codewars.level8kyu;

public class PowersOf2 {

    public static long[] powersOfTwo(int n) {

        long[] result = new long[n + 1]; // inicializa el array con un tamaño de n+1 (para incluir todas ls potencias
                                         // desde 2^0 hasta 2^n)

        for (int i = 0; i <= n; i++) {
            // Utiliza el método Math.pow de la clase Math para calcular 2^i. Este método devuelve un valor de tipo "double"
            // (long) convierte el resultado de "double" a "long"
            // result[i] asigna el calor convertido al elemento "i-ésimo" del array result
            result[i] = (long) Math.pow(2, i);

        }
        return result;
    }
}
