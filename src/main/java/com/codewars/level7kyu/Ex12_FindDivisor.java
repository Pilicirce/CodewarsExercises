package com.codewars.level7kyu;

public class Ex12_FindDivisor {

  public long numberOfDivisors(int n) {

    // Inicializa el contador de divisores
    int count = 0;

    // Itera desde 1 hasta la raíz cuadrada de n
    for (int i = 1; i <= Math.sqrt(n); i++) {
      // Si i es divisor de n
      if (n % i == 0) {
          // Incrementa el contador
          count++;
          // Verifica y cuenta el complemento n / i si es diferente de i
          if (i != n / i) {
              count++;
          }

        }
      }
      
      // Retorna el número total de divisores
      return count;

}
}