package org.example;


public class Main {
    public static void main(String[] args) {
        Product[] productArray = new Product[5];
        productArray[0] = new Product("Samsung", "08.12.2000", "Samsung Corp.", "Korea", 5599, true);
        productArray[1] = new Product("Philips", "05.06.2018", "PhilipsC", "China", 8789, false);
        productArray[2] = new Product("not 6", "25.04.2015", "Xiaomi", "China", 15000, true);
        productArray[3] = new Product("PSP", "12.12.2020", "Sony", "China", 78000, true);
        productArray[4] = new Product("Mi6", "15.05.2019", "Xiaomi", "China", 2500, true);
        for (int i = 0; i < productArray.length; i++) {
            productArray[i].printInfo();
        }

        Park.Attraktion attraktion = new Park().new Attraktion("sky", "10.00-20.00", 350);
        System.out.println(attraktion.getNameAttraktion());

    }
}
