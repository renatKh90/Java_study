package java_level2.homework1;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("************Задание1****************");

        RunJump[] runJumpers = {
                new Dog("Sharik", 2,1000),
                new Human("Uncle Fedor",3, 500),
                new Robot("Electronic", 5, 9999)
        };

        for(RunJump r : runJumpers) {
            r.run();
            r.jump();
        }

        System.out.println("************Задание2, 3 и 4****************");

        Dog dog = new Dog("Sharik", 2,1000);
        Human human = new Human("Uncle Fedor",3, 500);
        Robot robot = new Robot("Electronic", 5, 9999);


        Barrier[] barrier = {
                new Wall(10),
                new Track(1500)
        };

        for(Barrier b: barrier) {
            b.racing(dog);
            b.racing(human);
            b.racing(robot);
        }


    }
}
