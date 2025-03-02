package org.example;

public class Circle implements Ps{
    private double radius;
    private String bgColor;
    private String borderColor;
    public Circle (double radius, String bgColor, String borderColor) {
        this.radius = radius;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public final String getBgColor() {
        return bgColor;
    }

    @Override
    public final String getBorderColor() {
        return borderColor;
    }

}
