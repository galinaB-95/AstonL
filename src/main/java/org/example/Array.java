package org.example;

public class Array {
    public void fourArray (String arr [] ){
        int a = 1;
        int [][] b = new  int[4][4];
        for (int i=0; i<4; i++){
            for (int j = 0; j<4;  j++){
                b [i][j] = a;
                System.out.println(b[i][j] + "");
                a++;
            }
        }
    }
}
