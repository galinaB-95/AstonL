package org.example;

public class Rectangle implements Ps {
    private double width;
    private double height;
    private String bgColor;
    private String borderColor;

    public Rectangle(double width, double height, String bgColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        double c = 2 * (width + height);
        System.out.println(" Периметр прямоугольника " + c);
        return c;
    }

    @Override
    public double getArea() {
        double с = width * height;
        System.out.println("Площадь прямоугольника " + с);
        return с;
    }

    @Override
    public String getBgColor() {
        System.out.println("Цвет границ " + bgColor);
        return bgColor;
    }

    @Override
    public String getBorderColor() {
        System.out.println("Цвет фона " + borderColor);
        return borderColor;
    }
}
