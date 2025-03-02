package org.example;

public class Triangle implements Ps {
    private double sideA;
    private double sideB;
    private double sideC;
    private String bgColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String bgColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        double c = sideA + sideB + sideC;
        System.out.println("Периметр трегольника" + c);
        return c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double c = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("Площадь трегольника" + c);
        return c;
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
