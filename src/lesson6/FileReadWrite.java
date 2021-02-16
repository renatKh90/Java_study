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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWrite {

    static byte[] str1 = "Hello! I am first string. Be careful when doing homework. All exception have to be handled".getBytes(StandardCharsets.UTF_8);
    static byte[] str2 = "Hello! I am second string. Do not forget to glew me with first string and write to the third file".getBytes(StandardCharsets.UTF_8);
    static String file1 = "testFile1.txt";
    static String file2 = "testFile2.txt";
    static String file3 = "testFile3.txt";
    static String word = "Hello!";

    public static void main(String[] args) {

        createFile(file1, str1);
        createFile(file2, str2);

        concatenateFiles(new String[]{file1, file2}, file3);

        try {
            if (checkWordPresents(file1, word) == true) {
                System.out.println("Слово " + word + " содержится в файле " + file1);
            } else
            System.out.println("Слово " + word + " не содержится в файле " + file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkWordPresents(String file, String word) throws IOException {
        boolean isMatched = Files.lines(Paths.get(file)).anyMatch(word::equals);
        return isMatched;
    }
}


