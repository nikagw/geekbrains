package ru.geekbrains.javaone.lesson_a.online;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Dog d1 = new Dog("Baton",
                getRandomIntInRange(400,600),
                getRandomFloatInRange(0.1f),
                getRandomIntInRange(9,11));
        Dog d2 = new Dog("Sharik",
                getRandomIntInRange(400,600),
                getRandomFloatInRange(0.5f),
                getRandomIntInRange(19,21));
        Horse h = new Horse("Spirit",
                getRandomIntInRange(1400,1600),
                getRandomFloatInRange(2.5f),
                getRandomIntInRange(4,6));
        Bird b = new Bird("Vorobushek",
                getRandomIntInRange(4,6),
                getRandomFloatInRange(0));
        Cat c = new Cat("Cat in Boots",
                getRandomIntInRange(150,250),
                getRandomFloatInRange(1f));

        Animal[] zoo = {d1, d2, h, b, c};

        for (Animal i : zoo) {
            i.run(500);
            i.jump(1);
            i.swim(6);
            System.out.println("----------");
        }
    }

    private static int getRandomIntInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    private static float getRandomFloatInRange(float min) {
        return  (float) (Math.random() + min);
    }
}