package Lesson1.online;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Результат работы первого задания");
        System.out.println(taskOne(4, 7, 8, 9));
        System.out.println();
        System.out.println("Результат работы второго задания");
        System.out.println(taskTwo(5, 6));
        System.out.println();
        System.out.println("Результат работы третьего задания");
        System.out.println(taskThree(0));
        System.out.println();
        System.out.println("Результат работы четвертого задания");
        System.out.println(taskFour("Ренат"));
        System.out.println();

    }


    // Задание 1
    public static float taskOne(int a, int b, int c, int d) {
        float e = a * (b + (c / d));
        return (float) e;
    }

    // Задание 2
    public static boolean taskTwo(int f, int g) {
        int h = f + g;
        return h >= 10 && h <= 20;
    }

    //Задание 3
    public static int taskThree(int i) {
        if (i>=0) {
            System.out.println("Введено положительное число");
        } else {
            System.out.println("Введено отрицательное число");
        }
        return i;
    }


    //Задание 4
    public static String taskFour(String name) {
        return "Привет " + name;
    }
}
