package com.codewars;

import java.util.Arrays;

import com.codewars.level7kyu.AnagramDetection;
import com.codewars.level8kyu.Collinearity;
import com.codewars.level8kyu.HelloWorld;
import com.codewars.level8kyu.HelloWorld2;
import com.codewars.level8kyu.MultiplyTheNumber;
import com.codewars.level8kyu.PowersOf2;
import com.codewars.level8kyu.RockPaperScissors;

public class Main {

    public static void main(String[] args) {
        // Llamar a los métodos de los diferentes ejercicios
        
        //Ejercicio 1: Classic HelloWorld
        //DESCRIPTION: You are given a method called main, make it print the line Hello World!, (yes, that includes a new 
        //line character at the end) and don't return anything
        //Note that for some languages, the function main is the entry point of the program.

        HelloWorld.main(null);

        HelloWorld2.main(null);
        

        //Ejercicio 2: Collinearity
        //Theoretical Material You are given two vectors starting from the origin (x=0, y=0) with coordinates (x1,y1) 
        //and (x2,y2). Your task is to find out if these vectors are collinear. Collinear vectors are vectors that lie 
        //on the same straight line. They can be directed in the same or opposite directions. One vector can be obtained 
        //from another by multiplying it by a certain number. In terms of coordinates, vectors (x1, y1) and (x2, y2) are
        // collinear if (x1, y1) = (kx2, ky2) , where k is any number acting as a coefficient.
        //Notes All vectors start from the origin (x=0, y=0). Be careful when handling cases where x1, x2, y1, or y2 are 
        //zero to avoid division by zero errors. A vector with coordinates (0, 0) is collinear to all vectors.

        System.out.println(Collinearity.collinearity(1, 1, 1, 1));  // true
        

        //Ejercico 3: Powers of 2
        //DESCRIPTION: Complete the function that takes a non-negative integer n as input, and returns a list of all the
        // powers of 2 with the exponent ranging from 0 to n ( inclusive ).
        //Examples n = 0 ==> [1] # [2^0] n = 1 ==> [1, 2] # [2^0, 2^1] n = 2 ==> [1, 2, 4] # [2^0, 2^1, 2^2]

        int n = 2; // cambiar este valor para probar otros casos
        long[] powers = PowersOf2.powersOfTwo(n);
        System.out.println(Arrays.toString(powers)); 



        //Ejercicio 4: Rock Paper Scissirs!
        //DESCRIPTION: Rock Paper Scissors Let's play! You have to return which player won! In case of a draw return Draw!.
        //Examples(Input1, Input2 --> Output):
        //"scissors", "paper" --> "Player 1 won!" 
        //"scissors", "rock" --> "Player 2 won!" 
        //"paper", "paper" --> "Draw!"
        System.out.println(RockPaperScissors.rps("rock", "scissors"));  // Player 1 won!
        System.out.println(RockPaperScissors.rps("scissors", "rock"));  // Player 2 won!
        System.out.println(RockPaperScissors.rps("paper", "paper"));    // Draw!
    


        //Ejercicio 5: Multiply the number
        //DESCRIPTION:Jack really likes his number five: the trick here is that you have to multiply each number 
        //by 5 raised to the number of digits of each numbers, so, for example:
        //3 -->    15  (  3 * 5¹)
        //10 -->   250  ( 10 * 5²)
        //200 --> 25000  (200 * 5³)
        //0 -->     0  (  0 * 5¹)
        //-3 -->   -15  ( -3 * 5¹)
        int result1 = MultiplyTheNumber.multiply(3);
        int result2 = MultiplyTheNumber.multiply(10);
        int result3 = MultiplyTheNumber.multiply(200);
        int result4 = MultiplyTheNumber.multiply(0);
        int result5 = MultiplyTheNumber.multiply(-3);

        // Imprimir los resultados
        System.out.println("Resultado para 3: " + result1);
        System.out.println("Resultado para 10: " + result2);
        System.out.println("Resultado para 200: " + result3);
        System.out.println("Resultado para 0: " + result4);
        System.out.println("Resultado para -3: " + result5);



        //Ejercicio 6: Anagram Detection
        //DESCRIPTION: An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
        //Note: anagrams are case insensitive
        //Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
        //Examples: "foefet" is an anagram of "toffee"
        //"Buckethead" is an anagram of "DeathCubeK"

        // Llamada al método isAnagram de la clase AnagramDetection
        boolean resultAnagram1 = AnagramDetection.isAnagram("foefet", "toffee");
        boolean resultAnagram2 = AnagramDetection.isAnagram("Buckethead", "DeathCubeK");
        boolean resultAnagram3 = AnagramDetection.isAnagram("Twoo", "Woot");
        boolean resultAnagram4 = AnagramDetection.isAnagram("apple", "pale");

        // Imprimir los resultados
        System.out.println("Anagram 'foefet' and 'toffee': " + resultAnagram1); // true
        System.out.println("Anagram 'Buckethead' and 'DeathCubeK': " + resultAnagram2); // true
        System.out.println("Anagram 'Twoo' and 'Woot': " + resultAnagram3); // true
        System.out.println("Anagram 'apple' and 'pale': " + resultAnagram4); // false
        


        //Ejercicio 7: Basic Sequence Practice
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





        

        // Llama a otros métodos de otros ejercicios aquí
        
    }
}