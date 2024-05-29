package com.codewars.level8kyu;

public class Collinearity {
    
    public static boolean collinearity(int x1, int y1, int x2, int y2) {

        // La función collinearity determina si dos vectores (x1,y1) y (x2,y2) son
        // colineales usando la fórmula del producto cruzado: x1⋅y2−y1⋅x2=0

        return x1 * y2 == y1 * x2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(collinearity(1, 1, 1, 1)); // true
        System.out.println(collinearity(1, 2, 2, 4)); // true
        System.out.println(collinearity(1, 1, 6, 1)); // false
        System.out.println(collinearity(1, 2, -1, -2)); // true
        System.out.println(collinearity(1, 2, 1, -2)); // false
        System.out.println(collinearity(4, 0, 11, 0)); // true
        System.out.println(collinearity(0, 1, 6, 0)); // false
        System.out.println(collinearity(4, 4, 0, 4)); // false
        System.out.println(collinearity(0, 0, 0, 0)); // true
        System.out.println(collinearity(0, 0, 1, 0)); // true
        System.out.println(collinearity(5, 7, 0, 0)); // true
    }
}
