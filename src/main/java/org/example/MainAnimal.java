package org.example;

public class MainAnimal {
    public static void main(String[] args) {


Dog dog1 = new Dog(" Рекс ");
Dog dog2 = new Dog(" Макс ");

Cat cat1 = new Cat(" Мяу ");
Cat cat2 = new Cat(" Симба");

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего отов: " + Cat.getCatCount());

        dog1.run(750);
        dog1.swim(4);

        dog2.run(150);
        dog2.swim(8);

        cat1.run(300);
        cat1.swim(6);

        cat2.run(600);
        cat2.swim(800);

        Bowl bowl = new Bowl(40);
        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            cat.eat(bowl, 8);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");
        bowl.addFood(70);
        System.out.println("Добавили еду. Теперь в миске: " + bowl.getFood() + " едю.");
         for (Cat cat : cats) {
             if (!cat.isFull()) {
                 cat.eat(bowl, 8);
                 System.out.println(cat.getName() + " сыт: " + cat.isFull());
             }
    }
        System.out.println("Остато еды в миске: " + bowl.getFood() + " ед.");

    }
}