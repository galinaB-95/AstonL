package org.example;

public class Main {
    public static void main(String[] args) {
        Tovar[] tovarArray = new Tovar[5];
        tovarArray[0] = new Tovar("Samsung", "08.12.2000", "Samsung Corp.", "Korea", 5599, true);
        tovarArray[1] = new Tovar("Philips", "05.06.2018", "PhilipsC", "China", 8789, false);
        tovarArray[2] = new Tovar("not 6", "25.04.2015", "Xiaomi", "China", 15000, true);
        tovarArray[3] = new Tovar("PSP", "12.12.2020", "Sony", "China", 78000, true);
        tovarArray[4] = new Tovar("Mi6", "15.05.2019", "Xiaomi", "China", 2500, true);


    Park park = new Park();
    park.atraktion.название = "Float";
    park.atraktion.времяРаботы = "18:00-23:00";
    park.atraktion.стоимость = 250;

}}
