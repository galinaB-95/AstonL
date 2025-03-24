package org.example;

import java.math.BigInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static BigInteger getFactorial (int f) {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i<=f; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
        }

        public double area(double h, double a) {
            return (h * a) / 2;
        }
        public static void
        }

