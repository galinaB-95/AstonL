package org.example;

public class Main {
        public static void main(String[] args) {
            Ps implementedByCircle = new Circle(8, "фиолетовый", "красный");
            implementedByCircle.getArea();
            implementedByCircle.getPerimeter();
            implementedByCircle.getBgColor();
            implementedByCircle.getBorderColor();

            Ps implementedByTriangle = new Triangle(9, 10, 5, "Розовый", "Голбой");
            implementedByTriangle.getPerimeter();
            implementedByTriangle.getArea();
            implementedByTriangle.getBgColor();
            implementedByTriangle.getBorderColor();

            Ps implementedByRectangle = new Rectangle(8, 17, "pink", "red");
            implementedByRectangle.getPerimeter();
            implementedByRectangle.getArea();
            implementedByRectangle.getBgColor();
            implementedByRectangle.getBorderColor();
    }
}
