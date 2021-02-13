package Lesson1.online;

/*Домашнее задание Java1. Level1. Step5
        1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

 */

public class Animal {
    protected int runLimit;
    protected double jumpLimit;
    protected String name;
    protected int swimLimit;

    public Animal(int runLimit, double jumpLimit, String name, int swimLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.name = name;
        this.swimLimit = swimLimit;
    }

    public Animal(int runLimit, double jumpLimit, String name) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.name = name;
    }

    protected void run(int runValue) {
        if(runValue <= runLimit) {
            System.out.println(name + " пробежал " + runValue + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + runValue + " метров");
        }
    }

    protected void jump(double jumpValue) {
        if(jumpValue <= jumpLimit) {
            System.out.println(name + " прыгнул на " + jumpValue + " метров");
        } else {
            System.out.println(name + " не смог прыгнуть на " + jumpValue + " метров");
        }
    }

    protected void swim(int swimValue) {
        if(swimValue <= swimLimit) {
            System.out.println(name + " проплыл " + swimValue + " метров");
        } else {
            System.out.println(name + " не смог проплыть " + swimValue + " метров");
        }
    }


}
