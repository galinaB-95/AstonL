package org.example;

public class Array {
    public static void main(String[] args) {
        String [][] arr2 = new String[][] {{"1", "1", "5", "2", "8"}, {"1", "2", "3", "4"}, {"1", "hi", "2", "1"}, {"1", "1", "3", "1"}};

        for (int i=0; i<4; i++){
            for (int j = 0; j<4;  j++){
                System.out.print(arr2[i][j]+"");
            }
            System.out.println();
        }

    }}