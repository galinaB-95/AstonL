package org.example;

import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ClassTests {

    public static int getFactorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
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

    public static int compare(int a, int b) {
        return (a < b) ? -1 : ((a == b) ? 0 : 1);
    }
}

