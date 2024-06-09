package com.codewars.level8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TransportationVacationTest {

  @Test
  public void under3Tests() {
    assertEquals(40, TrasnportationVacation.rentalCarCost(1));
    assertEquals(80, TrasnportationVacation.rentalCarCost(2));
  }
  
  @Test
  public void under7Tests() {
    assertEquals(100, TrasnportationVacation.rentalCarCost(3));
    assertEquals(140, TrasnportationVacation.rentalCarCost(4));
    assertEquals(180, TrasnportationVacation.rentalCarCost(5));
    assertEquals(220, TrasnportationVacation.rentalCarCost(6));
  }
  
  @Test
  public void over7Tests() {
    assertEquals(230, TrasnportationVacation.rentalCarCost(7));
    assertEquals(270, TrasnportationVacation.rentalCarCost(8));
    assertEquals(310, TrasnportationVacation.rentalCarCost(9));
    assertEquals(350, TrasnportationVacation.rentalCarCost(10));
  }
}

