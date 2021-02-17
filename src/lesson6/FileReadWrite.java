package lesson6;


/*
Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 Написать метод, проверяющий, есть ли указанное слово в папке
 */
/**
 * Created by geekbrains student Renat Khanafiev
 */

import java.io.*;


public class FileReadWrite {

    static byte[] str1 = "Hello! I am first string. Be careful when doing homework. All exception have to be handled".getBytes();
    static byte[] str2 = "Hello! I am second string. Do not forget to glew me with first string and write to the third file".getBytes();
    static String file1 = "testFile1.txt";
    static String file2 = "testFile2.txt";
    static String file3 = "testFile3.txt";
    static String word1 = "Hello!";
    static String word2 = "KDjksdjsa!";


    public static void main(String[] args) {

        createFile(file1, str1);
        createFile(file2, str2);

        concatenateFiles(new String[]{file1, file2}, file3);

        searchWord(file1, word1);
//        searchWord(file2, word2);



    }

    public static void createFile(String name, byte[] str) {
        try {
            FileOutputStream file = new FileOutputStream(name);
            file.write(str);
            file.flush();
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Cause: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error! Cause: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void concatenateFiles(String[] names, String newFileName) {
        try {
            FileOutputStream out = new FileOutputStream(newFileName);
            byte[] buffer = new byte[2048];
            for (String name : names) {
                FileInputStream in = new FileInputStream(name);
                int i = 0;
                while ((i = in.read(buffer)) >= 0)
                    out.write(buffer, 0, i);
                in.close();
            }
        } catch (IOException e) {
            System.out.println("Error! Cause: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void searchWord(String file, String word) {
        try {
            FileInputStream input = new FileInputStream(file);
            int symbol = 0;
            int i = 0; // объявляем переменную для работы с индексом в массиве wordBytes
            byte[] wordBytes = word.getBytes(); // объявлеям массив где будем хранить набор байтов приходящий из потока
            do {
                symbol = input.read(); // читаем из входящего потока байты первого символа, записываем в переменную
                if (wordBytes[i] == symbol) { // если первый элемент массива равен символу
                    i++; // делаем инкремент чтобы пройти на следующий шаг и проверить байты второго символа и т.д
                    if (i == wordBytes.length) { // если индекс равен длине массива
                        System.out.println("Слово " + word + " присутствует в файле " + file); // слово найдено, печатаем в консоль
                    }
                } else { // если биты не совпадают, сбрасываем i на 0 потому что поток прислал другую буквy
                    i = 0;
                }
            } while (symbol != -1); // все это делать то дех пор пока поток не закончит присылать байты
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Cause: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error! Cause: " + e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс вышел за пределы массива " + e.getMessage());
            e.printStackTrace();
        }
    }
}



