package com.codewars;

import java.util.Arrays;

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
        


        // Llama a otros métodos de otros ejercicios aquí
        
    }
}