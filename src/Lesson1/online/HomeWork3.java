package Lesson1.online;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static int size = 3;
    public static char emptyDot = '_';
    public static char krestik = 'X';
    public static char nolik = '0';
    public static char[][] map;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j ++) {
                map[i][j] = emptyDot;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x,y;
        do {
            System.out.println("Уважаемый игрок, пожалуйста сделайте ход. Нужно ввести координаты Х У");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x,y));
        map[y][x] = krestik;
    }

    public static void aiTurn() {
        int x,y;
        do{
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!isCellValid(x,y));
        System.out.println("Многоуважаемый компутер сделал ход в " + (x+1) + " " + (y+1));
        map[y][x] = nolik;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x>=size || y<0 || y >=size) return false;
        if(map[y][x] == emptyDot) return true;
        return false;
    }

    public static boolean checkWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[2][0] == symbol && map[1][1] == symbol && map[0][2] == symbol) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++){
               if (map[i][j] == emptyDot) return false;
           }
        } return true;
    }

    public static void main (String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(krestik)) {
                System.out.println("Поздравляем! Вы победили");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(nolik)) {
                System.out.println("К сожалению компутер выиграл. Не растраивайтесь.");
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Спасибо за игру");
    }
}
