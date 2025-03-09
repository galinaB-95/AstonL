package org.example;

public class Array {
    public static void fourArray (String [] [] arr) {

       String [][] n = new  String[4][4];
        for (int i=0; i<4; i++){
            for (int j = 0; j<4;  j++){

                System.out.print(arr[i][j] + "");

            }
            System.out.println();
        }

    }
}
