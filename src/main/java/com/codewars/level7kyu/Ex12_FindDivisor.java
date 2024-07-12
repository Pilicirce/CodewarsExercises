package com.codewars.level7kyu;

public class Ex12_FindDivisor {

  public long numberOfDivisors(int n) {

    // Inicializa el contador de divisores
    int count = 0;

    // Iterar desde 1 hasta n
    for (int i = 1; i <= n; i++) {
      // Si i es divisor de n
      if (n % i == 0) {
          count++;
      }
  }
  
      // Retorna el número total de divisores
      return count;

}
}