package org.example;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"7", "8", "5", "2",},
                {"1", "2", "3", "4"},
                {"1", "8", "2", "1"},
                {"1", "1", "3", "1"}};
        try {
            try {
                int result = fourArray(arr);
                System.out.println(result);
            } catch (MyArraysSizeException e) {
                System.out.println("Размер массива привышен");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке " + e.i + "x" + e.j);
        }
    }

    public static int fourArray(String[][] arr) throws MyArraysSizeException, MyArrayDataException {

        int a = 1;
        if (arr.length != 4) {
            throw new MyArraysSizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraysSizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    a = a + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return a;
    }
}