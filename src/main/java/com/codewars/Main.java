package com.codewars;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Llamar a los métodos de los diferentes ejercicios
        
        //Ejercicio 1: Classic HelloWorld
        HelloWorld.main(null);

        HelloWorld2.main(null);
        
        //Ejercicio 2: Collinearity
        System.out.println(Collinearity.collinearity(1, 1, 1, 1));  // true
        
        //Ejercico 3: Powers of 2
        int n = 2; // cambiar este valor para probar otros casos
        long[] powers = PowersOf2.powersOfTwo(n);
        System.out.println(Arrays.toString(powers)); 


        // Llama a otros métodos de otros ejercicios aquí
        
    }
}