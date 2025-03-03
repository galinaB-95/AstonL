package org.example;

public interface Ps {
    double getPerimeter();

    double getArea();

    String getBgColor();

    String getBorderColor();

    public default void p(double radius) {
        double с = 2 * Math.PI * radius;
        System.out.println("Периметр круга" + с);
    }

    public default void p(int a, int b, int c) {
        double d = a + b + c;
        System.out.println("Периметр трегольника" + d);
    }

    public default void p(int width, int height) {
        double c = 2 * (width + height);
        System.out.println(" Периметр прямоугольника " + c);

    }
}


