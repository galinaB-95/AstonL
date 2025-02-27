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
        System.out.println("название" + название + "датаПроизводства" + датаПроизводства + "производитель" + производитель + "странаПроисхождения" + странаПроисхождения + "цена" + цена + "состояниеБронированияПокупателем" + состояниеБронированияПокупателем);
    }

    public static void main(String[] args) {
        Товар[] товарArray = new Товар[5];
        товарArray[0] = new Товар("Samsung", "08.12.2000", "Samsung Corp.", "Korea", 5599, true);
        товарArray[1] = new Товар("Philips", "05.06.2018", "PhilipsC", "China", 8789, false);
        товарArray[2] = new Товар("not 6", "25.04.2015", "Xiaomi", "China", 15000, true);
        товарArray[3] = new Товар("PSP", "12.12.2020", "Sony", "China", 78000, true);
        товарArray[4] = new Товар("Mi6", "15.05.2019", "Xiaomi", "China", 2500, true);
    }

}




