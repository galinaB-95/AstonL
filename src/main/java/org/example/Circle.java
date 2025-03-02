package org.example;

public class Circle implements Ps {
    private double radius;
    private String bgColor;
    private String borderColor;

    public Circle(double radius, String bgColor, String borderColor) {
        this.radius = radius;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }


    @Override
    public double getPerimeter() {
        double с = 2 * Math.PI * radius;
        System.out.println("Периметр круга " + с);
        return с;
    }

    @Override
    public double getArea() {
        double c = Math.PI * (radius * radius);
        System.out.println("Площадь круга " + c);
        return c;
    }

    @Override
    public final String getBgColor() {
        System.out.println("Цвет границ " + bgColor);
        return bgColor;
    }

    @Override
    public final String getBorderColor() {
        System.out.println("Цвет фона " + borderColor);
        return borderColor;

    }

}
