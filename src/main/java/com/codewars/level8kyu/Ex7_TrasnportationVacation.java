package com.codewars.level8kyu;

public class Ex7_TrasnportationVacation {
 
    public static int rentalCarCost(int d) {
      int rentDayCost = 40;
      int totalCost = rentDayCost * d;
       
      if (d >= 7) {
        totalCost -= 50;
    } else if (d >= 3) {
        totalCost -= 20;
    }
    
    return totalCost;

      }
    }

