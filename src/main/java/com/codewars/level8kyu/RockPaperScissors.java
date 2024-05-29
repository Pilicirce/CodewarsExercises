package com.codewars.level8kyu;

public class RockPaperScissors {

    public static String rps(String p1, String p2) {

      if (p1.equals(p2)){
         return "Draw!";
      }

       // Casos en los que el jugador 1 gana
       if ((p1.equals("rock") && p2.equals("scissors")) ||
       (p1.equals("scissors") && p2.equals("paper")) ||
       (p1.equals("paper") && p2.equals("rock"))) {
       return "Player 1 won!";
   }

   // Si no es empate ni gana el jugador 1, entonces gana el jugador 2
   return "Player 2 won!";
  }
      
    
}
