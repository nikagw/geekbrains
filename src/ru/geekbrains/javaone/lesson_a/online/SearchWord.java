package ru.geekbrains.javaone.lesson_a.online;

import java.io.FileInputStream;
import java.io.IOException;

public class SearchWord {
    public boolean search (String filename, String word) {
        try {
            FileInputStream readFile = new FileInputStream(filename);
            int b;
            int count = 0;
            while ((b = readFile.read()) != -1) {
                count++;
//                System.out.print((char) b);
            }
            char[] arr = new char[count];
            for (int i = 0; i < count; i++) {
                arr[i] = (char) readFile.read();
            }
            readFile.close();
        } catch (IOException e) {
            System.out.print(e);
        }
        return true;
    }
}
