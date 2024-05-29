package com.codewars.level8kyu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PowersOf2Test {
  @Test // indica que el método "testSomething" es un test
  public void testSomething() {
    // new lon[]{1} define un array esperado que contiene solo un elemento "1" (esto sería la solución esperada)
    // llamamos al método con el cargumento (0)
    // AssertArrayEquals: Comprueba que el array resultante de PowersOf2.powersOfTwo(0) es igual al 
    //array esperado new long[]{1}. Si no son iguales, la prueba falla.
    assertArrayEquals(new long[] { 1 }, PowersOf2.powersOfTwo(0));

    // Lo mismo con otras pruebas
    assertArrayEquals(new long[] { 1, 2 }, PowersOf2.powersOfTwo(1));
    assertArrayEquals(new long[] { 1, 2, 4, 8, 16 }, PowersOf2.powersOfTwo(4));
  }

}
