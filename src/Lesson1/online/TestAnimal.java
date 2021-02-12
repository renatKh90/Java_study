package Lesson1.online;

public class TestAnimal {
    public static void main (String[] args) {
        Dog dog = new Dog(500,0.5,"Шарик", 10);
        Cat cat = new Cat(200, 2,"Матроскин", 0);
        Horse horse = new Horse(1500,3, "Конёк-горбунок", 100);
        Bird bird = new Bird(5,0.2,"Птенчик", 0);

        dog.run(500);
        cat.run(150);
        horse.run(1400);
        bird.run(8);

        System.out.println("**************************************************");

        dog.jump(0.8);
        cat.jump(3);
        horse.jump(1);
        bird.jump(0.1);


        System.out.println("**************************************************");

        dog.swim(3);
        horse.swim(50);


        }
    }

