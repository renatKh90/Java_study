package Lesson1.online;

public class TestAnimal {
    public static void main (String[] args) {
        Dog dog1 = new Dog(500,0.5,"Шарик", true, 10);
        Dog dog2 = new Dog(600,0.5,"Тузик", true,10);
        Cat cat = new Cat(200, 2,"Матроскин",false,0);
        Horse horse = new Horse(1500,3, "Конёк-горбунок", true,100);
        Bird bird = new Bird(5,0.2,"Птенчик",false,0);

        dog1.run(550);
        dog2.run(600);
        cat.run(150);
        horse.run(1400);
        bird.run(8);

        System.out.println("**************************************************");

        dog1.jump(0.8);
        cat.jump(3);
        horse.jump(1);
        bird.jump(0.1);


        System.out.println("**************************************************");

        dog1.swim(3);
        horse.swim(50);
        bird.swim(50);
        cat.swim(10);


        }
    }

