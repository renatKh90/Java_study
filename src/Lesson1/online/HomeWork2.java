package Lesson1.online;

/*
Lesson2
1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
2 Задать пустой целочисленный массив размером 8.
Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
написать метод,принимающий на вход массив и умножающий числа меньше 6 на 2;
4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
5* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
заполнить его диагональные элементы единицами, используя цикл(ы);
6** Написать метод, которому на вход подаётся одномерный массив и число n
(может быть положительным, или отрицательным),
при этом метод должен циклически сместить все элементы массива на n позиций.
[1,2,3,4,5], -2 => [3,4,5,1,2]
[1,2,3,4,5], 2 => [4,5,1,2,3]
7 *** Не пользоваться вспомогательным массивом при решении задачи 6.
 */

import java.lang.reflect.Array;

public class HomeWork2 {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int[] myArrOne = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 1; i < myArrOne.length; i++) {
            myArrOne[i] = myArrOne[i] == 0 ? 1 : 0;
            System.out.print(myArrOne[i] + " ");
        }

        // Задание 2
        System.out.println("\nЗадание 2");
        int[] myArrTwo = new int[8];
        int step = 1;
        for (int i = 0; i < myArrTwo.length; i++) {
            myArrTwo[i] = step;
            step = step + 3;
            System.out.print(myArrTwo[i] + " ");
        }

        // Задание 3
        System.out.println("\nЗадание 3");
        int[] myArrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArrThree.length; i++) {
            if (myArrThree[i] < 6) {
                myArrThree[i] = myArrThree[i] * 2;
            }
            System.out.print(myArrThree[i] + " ");
        }

        // Задание 4
        System.out.println("\nЗадание 4");
        int[] myArrFour = {10, 50, 37, -2, 811, -74, 75, 32, 4, -8, 119, 11};
        System.out.println("Самый большой элемент в нашем массиве = " + maxArrayElement(myArrFour));
        System.out.println("Самый маленький элемент в нашем массиве = " + minArrayElement(myArrFour));


        // Задание 5*

    }


    // Метод вычисляющий максимальное значение массива
    public static int maxArrayElement(int[] myArrFour) {
        int max = myArrFour[0];
        for (int i = 1; i < myArrFour.length; i++) {
            if (myArrFour[i] > max) {
                max = myArrFour[i];
            }
        }
        return max;
    }

    // Метод вычисляющий минимальное значение массива
    public static int minArrayElement(int[] myArrFour) {
        int min = myArrFour[0];
        for (int i = 1; i < myArrFour.length; i++) {
            if (myArrFour[i] < min) {
                min = myArrFour[i];
            }
        }
        return min;
    }
}




