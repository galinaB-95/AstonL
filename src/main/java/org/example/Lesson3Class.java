package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3Class {
    public static void printThreeWords() {
        String fruit1 = "Orange";
        String fruit2 = "Banana";
        String fruit3 = "Apple";
        System.out.println(fruit1 + "\n" + fruit2 + "\n" + fruit3);
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }


    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean twoNumber(int a, int b) {
        boolean c = (a + b > 10 && a + b <= 20);
        System.out.println(c);

        return c;
    }

    public static void sixTask(int a) {
        if (a < 0)
            System.out.println("Число отрицательное");
        else
            System.out.println("Число положительное");
    }

    public static boolean falsTask(int a) {
        boolean c = a < 0;
        System.out.println(c);

        return c;
    }

    public static void povtorTask(String a, int b) {
        String strRepeat = a.repeat(b);
        System.out.println(strRepeat);
    }

    public static boolean visokGod(int year) {
        boolean c = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        {
            System.out.println(c);
        }
        return c;
    }


    public static int[] createArray(int len, int intialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = intialValue;
        }
        System.out.println(array);
        return array;
    }


    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(2, -3);
        printColor(150);
        compareNumbers(5, 7);
        twoNumber(5, 9);
        sixTask(5);
        falsTask(7);
        povtorTask("Слово", 5);
        visokGod(2000);


        int a[] = {0, 1, 1, 0, 0, 1, 0};
        for (int i = 0; i < a.length; i++)
            if (a[i] == 0)
                a[i] = 1;
            else
                a[i] = 0;
        System.out.println(Arrays.toString(a));


        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));


        int[] ar = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 6) {
                ar[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(ar));


        int size = 5;
        int[][] array2 = new int[size][size];
        for (int i = 0; i < size; i++) {
            array2[i][i] = 1;
            array2[i][size - i - 1] = 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }

        createArray(8, 9);

    }
}