package org.example;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String originCountry;
    private int price;
    private boolean statusBooking;

    public Product(String name, String productionDate, String manufacturer, String originCountry, int price, boolean statusBooking) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.statusBooking = statusBooking;
    }

    public void printInfo() {
        System.out.println("Название " + name + " дата производства " + productionDate + " производитель " + manufacturer + " страна происхождения " + originCountry + " цена " + price + " состояние бронирования попателем " + statusBooking);
    }

}





