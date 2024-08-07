package com.codewars;

import java.util.Arrays;
import java.util.List;

import com.codewars.level7kyu.Ex13_OnesAndZeros;
import com.codewars.level7kyu.Ex14_ReverseLetter;
import com.codewars.level7kyu.Ex15_Check3and2;
import com.codewars.level7kyu.Ex12_FindDivisor;
import com.codewars.level7kyu.Ex11_SumNoDuplicates;
import com.codewars.level7kyu.Ex10_GrowthPopulation;
import com.codewars.level7kyu.Ex9_BasicSequence;
import com.codewars.level7kyu.Ex8_AnagramDetection;
import com.codewars.level8kyu.Ex7_TrasnportationVacation;
import com.codewars.level8kyu.Ex6_InvertValues;
import com.codewars.level8kyu.Ex5_MultiplyTheNumber;
import com.codewars.level8kyu.Ex4_RockPaperScissors;
import com.codewars.level8kyu.Ex3_PowersOf2;
import com.codewars.level8kyu.Ex2_Collinearity;
import com.codewars.level8kyu.Ex1_HelloWorld;


public class Main {

    public static void main(String[] args) {
        // Llamar a los métodos de los diferentes ejercicios
        
        //Ejercicio 1: Classic HelloWorld
        //DESCRIPTION: You are given a method called main, make it print the line Hello World!, (yes, that includes a new 
        //line character at the end) and don't return anything
        //Note that for some languages, the function main is the entry point of the program.

        Ex1_HelloWorld.main(null);

        

        //Ejercicio 2: Collinearity
        //Theoretical Material You are given two vectors starting from the origin (x=0, y=0) with coordinates (x1,y1) 
        //and (x2,y2). Your task is to find out if these vectors are collinear. Collinear vectors are vectors that lie 
        //on the same straight line. They can be directed in the same or opposite directions. One vector can be obtained 
        //from another by multiplying it by a certain number. In terms of coordinates, vectors (x1, y1) and (x2, y2) are
        // collinear if (x1, y1) = (kx2, ky2) , where k is any number acting as a coefficient.
        //Notes All vectors start from the origin (x=0, y=0). Be careful when handling cases where x1, x2, y1, or y2 are 
        //zero to avoid division by zero errors. A vector with coordinates (0, 0) is collinear to all vectors.

        System.out.println(Ex2_Collinearity.collinearity(1, 1, 1, 1));  // true
        

        //Ejercico 3: Powers of 2
        //DESCRIPTION: Complete the function that takes a non-negative integer n as input, and returns a list of all the
        // powers of 2 with the exponent ranging from 0 to n ( inclusive ).
        //Examples n = 0 ==> [1] # [2^0] n = 1 ==> [1, 2] # [2^0, 2^1] n = 2 ==> [1, 2, 4] # [2^0, 2^1, 2^2]

        int n = 2; // cambiar este valor para probar otros casos
        long[] powers = Ex3_PowersOf2.powersOfTwo(n);
        System.out.println(Arrays.toString(powers)); 



        //Ejercicio 4: Rock Paper Scissirs!
        //DESCRIPTION: Rock Paper Scissors Let's play! You have to return which player won! In case of a draw return Draw!.
        //Examples(Input1, Input2 --> Output):
        //"scissors", "paper" --> "Player 1 won!" 
        //"scissors", "rock" --> "Player 2 won!" 
        //"paper", "paper" --> "Draw!"
        System.out.println(Ex4_RockPaperScissors.rps("rock", "scissors"));  // Player 1 won!
        System.out.println(Ex4_RockPaperScissors.rps("scissors", "rock"));  // Player 2 won!
        System.out.println(Ex4_RockPaperScissors.rps("paper", "paper"));    // Draw!
    


        //Ejercicio 5: Multiply the number
        //DESCRIPTION:Jack really likes his number five: the trick here is that you have to multiply each number 
        //by 5 raised to the number of digits of each numbers, so, for example:
        //3 -->    15  (  3 * 5¹)
        //10 -->   250  ( 10 * 5²)
        //200 --> 25000  (200 * 5³)
        //0 -->     0  (  0 * 5¹)
        //-3 -->   -15  ( -3 * 5¹)
        int result1 = Ex5_MultiplyTheNumber.multiply(3);
        int result2 = Ex5_MultiplyTheNumber.multiply(10);
        int result3 = Ex5_MultiplyTheNumber.multiply(200);
        int result4 = Ex5_MultiplyTheNumber.multiply(0);
        int result5 = Ex5_MultiplyTheNumber.multiply(-3);

        // Imprimir los resultados
        System.out.println("Resultado para 3: " + result1);
        System.out.println("Resultado para 10: " + result2);
        System.out.println("Resultado para 200: " + result3);
        System.out.println("Resultado para 0: " + result4);
        System.out.println("Resultado para -3: " + result5);


        //Ejercicio 6: Invert values
        //Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the 
        //negatives become positives.
        //[1, 2, 3, 4, 5] --> [-1, -2, -3, -4, -5]
        //[1, -2, 3, -4, 5] --> [-1, 2, -3, 4, -5]
        //[] --> []

        // Pruebas manuales para verificar el método invert
        int[] exampleInvert1 = {1, 2, 3, 4, 5};
        int[] resultInvert1 = Ex6_InvertValues.invert(exampleInvert1);
        System.out.println("Input: " + Arrays.toString(exampleInvert1) + " -> Output: " + Arrays.toString(resultInvert1));

        int[] exampleInvert2 = {1, -2, 3, -4, 5};
        int[] resultInvert2 = Ex6_InvertValues.invert(exampleInvert2);
        System.out.println("Input: " + Arrays.toString(exampleInvert2) + " -> Output: " + Arrays.toString(resultInvert2));

        int[] exampleInvert3 = {};
        int[] resultInvert3 = Ex6_InvertValues.invert(exampleInvert3);
        System.out.println("Input: " + Arrays.toString(exampleInvert3) + " -> Output: " + Arrays.toString(resultInvert3));

        int[] exampleInvert4 = {0};
        int[] resultInvert4 = Ex6_InvertValues.invert(exampleInvert4);
        System.out.println("Input: " + Arrays.toString(exampleInvert4) + " -> Output: " + Arrays.toString(resultInvert4));
    


        //Ejercicio 7: Transportation on vacation
       //After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight
       // for you and your girlfriend and try to leave all the mess behind you. You will need a rental car
       // in order for you to get around in your vacation. The manager of the car rental makes you some good offers.
       //Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. 
       //Alternatively, if you rent the car for 3 or more days, you get $20 off your total. Write a code that gives 
       //out the total amount for different days(d).
        System.out.println("Costo para 2 días: " + Ex7_TrasnportationVacation.rentalCarCost(2)); // Espera: 80
        System.out.println("Costo para 3 días: " + Ex7_TrasnportationVacation.rentalCarCost(3)); // Espera: 100
        System.out.println("Costo para 4 días: " + Ex7_TrasnportationVacation.rentalCarCost(4)); // Espera: 140
        System.out.println("Costo para 5 días: " + Ex7_TrasnportationVacation.rentalCarCost(7)); // Espera: 230
        System.out.println("Costo para 6 días: " + Ex7_TrasnportationVacation.rentalCarCost(10)); // Espera: 350




        //Ejercicio 8: Anagram Detection
        //DESCRIPTION: An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
        //Note: anagrams are case insensitive
        //Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
        //Examples: "foefet" is an anagram of "toffee"
        //"Buckethead" is an anagram of "DeathCubeK"

        // Llamada al método isAnagram de la clase AnagramDetection
        boolean resultAnagram1 = Ex8_AnagramDetection.isAnagram("foefet", "toffee");
        boolean resultAnagram2 = Ex8_AnagramDetection.isAnagram("Buckethead", "DeathCubeK");
        boolean resultAnagram3 = Ex8_AnagramDetection.isAnagram("Twoo", "Woot");
        boolean resultAnagram4 = Ex8_AnagramDetection.isAnagram("apple", "pale");

        // Imprimir los resultados
        System.out.println("Anagram 'foefet' and 'toffee': " + resultAnagram1); // true
        System.out.println("Anagram 'Buckethead' and 'DeathCubeK': " + resultAnagram2); // true
        System.out.println("Anagram 'Twoo' and 'Woot': " + resultAnagram3); // true
        System.out.println("Anagram 'apple' and 'pale': " + resultAnagram4); // false
        


        //Ejercicio 9: Basic Sequence Practice
        //DESCRIPTION:A sequence or a series, in mathematics, is a string of objects, like numbers, that follow a particular
        // pattern. The individual elements in a sequence are called terms. A simple example is 3, 6, 9, 12, 15, 18, 21, ..., 
        //where the pattern is: "add 3 to the previous term". In this kata, we will be using a more complicated sequence: 
        //0, 1, 3, 6, 10, 15, 21, 28, ... This sequence is generated with the pattern: "the nth term is the sum of numbers 
        //from 0 to n, inclusive".
        //Your Task: Complete the function that takes an integer n and returns a list/array of length abs(n) + 1 of the 
        //arithmetic series explained above. Whenn < 0 return the sequence with negative terms.
        //Examples: 5  -->  [0,  1,  3,  6,  10,  15]
        //-5  -->  [0, -1, -3, -6, -10, -15]
        // 7  -->  [0,  1,  3,  6,  10,  15,  21,  28]
        int[] resultSec1 = Ex9_BasicSequence.sumOfN(3);
        int[] resultSec2 = Ex9_BasicSequence.sumOfN(-4);
        int[] resultSec3 = Ex9_BasicSequence.sumOfN(1);
        int[] resultSec4 = Ex9_BasicSequence.sumOfN(0);

         // Imprimir los resultados
         System.out.println("sumOfN(3): " + arrayToString(resultSec1));
         System.out.println("sumOfN(-4): " + arrayToString(resultSec2));
         System.out.println("sumOfN(1): " + arrayToString(resultSec3));
         System.out.println("sumOfN(0): " + arrayToString(resultSec4));

        

        //Ejercicio 10: Growth of Population
        //DESCRIPTION: In a small town the population is p0 = 1000 at the beginning of a year. The population regularly 
        //increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. How many years 
        //does the town need to see its population greater than or equal to p = 1200 inhabitants?

        //At the end of the first year there will be: 1000 + 1000 * 0.02 + 50 => 1070 inhabitants
        //At the end of the 2nd year there will be: 1070 + 1070 * 0.02 + 50 => 1141 inhabitants (** number of inhabitants is an integer **)
        //At the end of the 3rd year there will be: 1141 + 1141 * 0.02 + 50 => 1213
        //It will need 3 entire years. 

        //More generally given parameters:
        //p0, percent, aug (inhabitants coming or leaving each year), p (population to equal or surpass)
        //the function nb_year should return n number of entire years needed to get a population greater or equal to p.
        //aug is an integer, percent a positive or null floating number, p0 and p are positive integers (> 0)
        //Examples: nb_year(1500, 5, 100, 5000) -> 15
        //nb_year(1500000, 2.5, 10000, 2000000) -> 10

        int years = Ex10_GrowthPopulation.nbYear(1500, 5, 100, 5000);
        System.out.println("Years needed: " + years);



        //Ejercicio 11: Sum a list but ignore any duplicates
        //DESCRIPTION: Please write a function that sums a list, but ignores any duplicated items in the list.
        //For instance, for the list [3, 4, 3, 6] the function should return 10, 
        //and for the list [1, 10, 3, 10, 10] the function should return 4.
        //NOTA ACLARATORIA: solo se suman los números que aparecen una vez
        // Ejemplos de listas de prueba
        int[] list1 = {1, 1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 1, 2, 2, 3};

        // Llamadas al método sumNoDuplicates
        int resultList1 = Ex11_SumNoDuplicates.sumNoDuplicates(list1);
        int resultList2 = Ex11_SumNoDuplicates.sumNoDuplicates(list2);
        int resultList3 = Ex11_SumNoDuplicates.sumNoDuplicates(list3);

        // Imprimir los resultados
        System.out.println("Resultado para list1: " + resultList1); // Debería imprimir 5
        System.out.println("Resultado para list2: " + resultList2); // Debería imprimir 6
        System.out.println("Resultado para list3: " + resultList3); // Debería imprimir 3




        //Ejercicio 12: Count the divisors of a number
        //DESCRIPTION: Count the number of divisors of a positive integer n.
        //Random tests go up to n = 500000. 
        //Examples (input --> output)
        //4 --> 3 // we have 3 divisors - 1, 2 and 4
        //5 --> 2 // we have 2 divisors - 1 and 5
        //12 --> 6 // we have 6 divisors - 1, 2, 3, 4, 6 and 12
        //30 --> 8 // we have 8 divisors - 1, 2, 3, 5, 6, 10, 15 and 30
        //Note you should only return a number, the count of divisors. The numbers between parentheses are shown 
        //only for you to see which numbers are counted in each case.
    
         // Crear una instancia de FindDivisor
         Ex12_FindDivisor fd = new Ex12_FindDivisor();

         // Probar el método numberOfDivisors con diferentes valores
         System.out.println("Divisors of 1: " + fd.numberOfDivisors(1)); // Should return 1
         System.out.println("Divisors of 4: " + fd.numberOfDivisors(4)); // Should return 3
         System.out.println("Divisors of 5: " + fd.numberOfDivisors(5)); // Should return 2
         System.out.println("Divisors of 12: " + fd.numberOfDivisors(12)); // Should return 6
         System.out.println("Divisors of 30: " + fd.numberOfDivisors(30)); // Should return 8
         System.out.println("Divisors of 100: " + fd.numberOfDivisors(100)); // Should return 9




         //Ejercicio 13: Ones and Zeros
         //DESCRIPTION: Given an array of ones and zeroes, convert the equivalent binary value to an integer.
         // Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
         //Examples: Testing: [0, 0, 0, 1] ==> 1
         //Testing: [0, 0, 1, 0] ==> 2
         //Testing: [0, 1, 0, 1] ==> 5
         //Testing: [1, 0, 0, 1] ==> 9jeje
         //Testing: [0, 0, 1, 0] ==> 2
         //Testing: [0, 1, 1, 0] ==> 6
         //Testing: [1, 1, 1, 1] ==> 15
         //Testing: [1, 0, 1, 1] ==> 11
         //However, the arrays can have varying lengths, not just limited to 4.

         //Nota: En el sistema binario, cada posición representa una potencia de 2, comenzando desde 0 en la derecha. Por ejemplo, 
         //en el número binario 1101, el valor decimal sería: 1×2^3 + 1×2^2 + 0×2^1 + 1×2^0 = 8 + 4 + 0 + 1 = 13.

        List<Integer> binary1 = Arrays.asList(0, 0, 0, 1);
        List<Integer> binary2 = Arrays.asList(1, 1, 1, 1);
        List<Integer> binary3 = Arrays.asList(0, 1, 1, 0);
        List<Integer> binary4 = Arrays.asList(1, 0, 0, 1);

        // Llamada al método ConvertBinaryArrayToInt y mostrar resultados
        System.out.println("Testing: " + binary1 + " ==> " + Ex13_OnesAndZeros.ConvertBinaryArrayToInt(binary1));
        System.out.println("Testing: " + binary2 + " ==> " + Ex13_OnesAndZeros.ConvertBinaryArrayToInt(binary2));
        System.out.println("Testing: " + binary3 + " ==> " + Ex13_OnesAndZeros.ConvertBinaryArrayToInt(binary3));
        System.out.println("Testing: " + binary4 + " ==> " + Ex13_OnesAndZeros.ConvertBinaryArrayToInt(binary4));




        //Ejercicio 14: Reverse the letters in a string
        //Given a string str, reverse it and omit all non-alphabetic characters.
        //Example: For str = "krishan", the output should be "nahsirk".
        //For str = "ultr53o?n", the output should be "nortlu".
        //Input/Output
        //[input] string str
        //A string consists of lowercase latin letters, digits and symbols.
        //[output] a string

        System.out.println(Ex14_ReverseLetter.reverseLetter("krishan"));  // Debería imprimir "nahsirk"
        System.out.println(Ex14_ReverseLetter.reverseLetter("ultr53o?n"));  // Debería imprimir "nortlu"
        System.out.println(Ex14_ReverseLetter.reverseLetter("ab23c"));  // Debería imprimir "cba"
        System.out.println(Ex14_ReverseLetter.reverseLetter("krish21an"));  // Debería imprimir "nahsirk"

        

        //Ejercicio 15: Check three and two
        // DESCRIPTION: Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran), check if the array contains three and two of the same values.
        // Examples
        // ["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
        // ["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
        // ["a", "a", "a", "a", "a"] ==> false // 5x "a"

        Ex15_Check3and2 solution = new Ex15_Check3and2();
        System.out.println(solution.checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' })); // true
        System.out.println(solution.checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' })); // false
        System.out.println(solution.checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' })); // false
    


        //Ejercicio 16: Rotate for a Max
        //Description: Let us begin with an example: Take a number: 56789. Rotate left, you get 67895.
        //Keep the first digit in place and rotate left the other digits: 68957.
        //Keep the first two digits in place and rotate the other ones: 68579.
        //Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains only one digit which rotated is itself.
        //You have the following sequence of numbers: 56789 -> 67895 -> 68957 -> 68579 -> 68597
        //and you must return the greatest: 68957.

        //Task: Write function max_rot(n) which given a positive integer n returns the maximum number you got doing rotations similar to the above example.
        //So max_rot (or maxRot or ... depending on the language) is such as: max_rot(56789) should return 68957
        // max_rot(38458215) should return 85821534


        


        
        // Llama a otros métodos de otros ejercicios aquí
        
    }


    
    /**
     * Exercise 9: Método auxiliar para convertir arrays en una cadena para imprimir
     * @param array
     * @return
     */
 private static String arrayToString(int[] array) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < array.length; i++) {
        sb.append(array[i]);
        if (i < array.length - 1) {
            sb.append(", ");
        }
    }
    sb.append("]");
    return sb.toString();
}

}