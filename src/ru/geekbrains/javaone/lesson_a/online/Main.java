package ru.geekbrains.javaone.lesson_a.online;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2 задание
        InputStream in;
        OutputStream out;
        try {
            FileInputStream fis = new FileInputStream("First.txt");
            Scanner sc = new Scanner(fis);
            String firstText = "";
            while (sc.hasNext()) {
                firstText = sc.nextLine();
            }
            fis.close();

            FileOutputStream fos = new FileOutputStream("Second.txt");
            PrintStream ps = new PrintStream(fos);
            String staticString = "Lorem ipsum dolor sit amet consectetur adipisicing elit.";
            ps.println(staticString);
            ps.print(firstText);
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
