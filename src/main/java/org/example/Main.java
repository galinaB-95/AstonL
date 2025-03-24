package org.example;

import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public double area(double h, double a) {
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

