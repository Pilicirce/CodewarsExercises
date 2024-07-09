package com.codewars.level8kyu;

public class Ex5_MultiplyTheNumber {
    
    public static int multiply(int number) {
       
        //convertir el número a una cadena (string) y contar los caracteres.
        int numberOfDigits = String.valueOf(Math.abs(number)).length();


        //para calcular 5 elevado a la potencia del número de dígitos:
        int result = (int) (number * Math.pow(5, numberOfDigits));

        //devolver el resultado calculado
        return result;
      }
}
