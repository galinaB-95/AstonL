package org.example;

public class Main {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Рекс ");
        Dog dog2 = new Dog("Макс ");

        Cat cat1 = new Cat("Мяу ");
        Cat cat2 = new Cat("Симба ");
        Cat cat3 = new Cat("Гав ");

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        dog1.run(5);
        dog1.swim(11);

        dog2.run(150);
        dog2.swim(8);

        cat1.run(300);
        cat1.swim(0);

        cat2.run(50);
        cat2.swim(800);

        cat3.run(10);
        cat3.swim(0);

        Bowl bowl = new Bowl(10);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 4);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");
        bowl.addFood(70);
        System.out.println("Добавили еду. Теперь в миске: " + bowl.getFood() + " ед.");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 4);
                System.out.println(cat.getName() + " сыт: " + cat.isFull());
            }
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");


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