package Lesson1.online;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Результат работы первого задания: a * (b + (c / d)) " + taskOne(4, 7, 8, 9));
        System.out.println("Результат работы второго задания: " + taskTwo(5, 6));
        taskThree(0);
        System.out.println("Результат работы четвертого задания: " + taskFour("Ренат"));
        System.out.print("Результат работы пятого задания: " );
        taskFive(2020);


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
    public static void taskThree(int i) {
        if (i>=0) {
            System.out.println("Результат работы третьего задания: Введено положительное число");
        } else {
            System.out.println("Результат работы третьего задания: Введено отрицательное число");
        }

    }


    //Задание 4
   public static String taskFour(String name) {
        return "Привет " + name;
    }

    //Задание 5

   public static void taskFive (int year) {
       if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " Невисокосный");
       else System.out.println(year + " Високосный");
    }

}