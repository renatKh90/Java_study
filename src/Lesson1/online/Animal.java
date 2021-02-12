package Lesson1.online;

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

    void run(int runValue) {
        if(runValue <= runLimit) {
            System.out.println(name + " пробежал " + runValue + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + runValue + " метров");
        }
    }

    void jump(double jumpValue) {
        if(jumpValue <= jumpLimit) {
            System.out.println(name + " прыгнул на " + jumpValue + " метров");
        } else {
            System.out.println(name + " не смог прыгнуть на " + jumpValue + " метров");
        }
    }

    void swim(int swimValue) {
        if(swimValue <= swimLimit) {
            System.out.println(name + " проплыл " + swimValue + " метров");
        } else {
            System.out.println(name + " не смог проплыть " + swimValue + " метров");
        }
    }


}
