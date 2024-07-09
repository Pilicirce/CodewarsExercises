package com.codewars.level8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex7_TransportationVacationTest {

  @Test
  public void under3Tests() {
    assertEquals(40, Ex7_TrasnportationVacation.rentalCarCost(1));
    assertEquals(80, Ex7_TrasnportationVacation.rentalCarCost(2));
  }
  
  @Test
  public void under7Tests() {
    assertEquals(100, Ex7_TrasnportationVacation.rentalCarCost(3));
    assertEquals(140, Ex7_TrasnportationVacation.rentalCarCost(4));
    assertEquals(180, Ex7_TrasnportationVacation.rentalCarCost(5));
    assertEquals(220, Ex7_TrasnportationVacation.rentalCarCost(6));
  }
  
  @Test
  public void over7Tests() {
    assertEquals(230, Ex7_TrasnportationVacation.rentalCarCost(7));
    assertEquals(270, Ex7_TrasnportationVacation.rentalCarCost(8));
    assertEquals(310, Ex7_TrasnportationVacation.rentalCarCost(9));
    assertEquals(350, Ex7_TrasnportationVacation.rentalCarCost(10));
  }
}

