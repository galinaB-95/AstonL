package org.example;

import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ClassTests {

    public static int getFactorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * 1;
        }
        return result;
    }
    
    public static double area(double h, double a) {
            return (h * a) / 2;
        }


    public static int add(int a, int b) {

        return a + b;
    }

    public static int subtract(int a, int b) {

        return a - b;
    }

    public static int multipy(int a, int b) {

        return a * b;
    }

    public static int divide(int a, int b) {

        return a / b;
    }

    public static void comparing(int a, int b) {
        if (a > b) {
            System.out.println(a > b);
        } else if (a < b) {
            System.out.println(a < b);
        } else {
            System.out.println(a = b);
        }
    }
}

