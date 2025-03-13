package org.example;

public class MyArrayDataException extends Exception {


    public MyArrayDataException(int i, int j) {
        super("Ошибка в ячейке (" + i + " x " + j + ")");
    }


}


