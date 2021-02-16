package lesson6;


/*
Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 Написать метод, проверяющий, есть ли указанное слово в папке
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadWrite {

    static byte[] str1 = "Hello! I am first string. Be careful when doing homework. All exception have to be handled".getBytes(StandardCharsets.US_ASCII);
    static byte[] str2 = "Hello! I am second string. Do not forget to glew me with first string and write to the third file".getBytes(StandardCharsets.US_ASCII);
    static String file1 = "testFile1.txt";
    static String file2 = "testFile2.txt";
    static String file3 = "testFile3.txt";

    public static void main(String[] args) {

        createFile(file1, str1);
        createFile(file2, str2);
        readFile(file1);
        readFile(file2);
        glewFiles(file1, file3);

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

    public static void readFile(String name) {
        try {
            FileInputStream file = new FileInputStream(name);
            int outputChar;
            while ((outputChar = file.read()) != -1) {
                System.out.print((char) outputChar);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void glewFiles(String name, String name2) {
        try {
            FileInputStream file = new FileInputStream(name);
            FileOutputStream file2 = new FileOutputStream(name2);
            byte[] buffer = new byte[file.available()];
            file.read(buffer, 0, buffer.length);
            file2.write(buffer, 0, buffer.length);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
