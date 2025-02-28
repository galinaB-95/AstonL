package org.example;

public class Товар {
    private String название;
    private String датаПроизводства;
    private String производитель;
    private String странаПроисхождения;
    private int цена;
    private boolean состояниеБронированияПокупателем;

    public Товар(String название, String датаПроизводства, String производитель, String странаПроисхождения, int цена, boolean состояниеБронированияПокупателем) {
        this.название = название;
        this.датаПроизводства = датаПроизводства;
        this.производитель = производитель;
        this.странаПроисхождения = странаПроисхождения;
        this.цена = цена;
        this.состояниеБронированияПокупателем = состояниеБронированияПокупателем;
    }

    public void printTova() {
        System.out.println(" название " + название + " датаПроизводства " + датаПроизводства + " производитель " + производитель + " странаПроисхождения " + странаПроисхождения + " цена " + цена + " состояниеБронированияПокупателем " + состояниеБронированияПокупателем);
    }

}




