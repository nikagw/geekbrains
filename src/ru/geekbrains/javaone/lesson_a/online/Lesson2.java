package ru.geekbrains.javaone.lesson_a.online;

import com.sun.scenario.animation.shared.ClipEnvelope;
import java.util.Arrays;

public class Lesson2 {
    /** 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     * */
    private static void changeArray1(int[] a) {
        int i = 0;
        while (i < a.length) {
            a[i] = (a[i] == 1) ?  0 :  1;
            i++;
        }
    }

    /**
     * 2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит
     * его значениями 1 4 7 10 13 16 19 22;*/

    private static void pushInArray(int[] a) {
        a[0] = 1;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i-1] + 3;
        }
    }

    /**
     * 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и
     * умножающий числа меньше 6 на 2;*/

    private static void multiplyOnTwo(int[] a) {
        for (int i = 0; i < a.length; i++){
            if (a[i] < 6) a[i] *= 2;
        }
    }

    /**
     * 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;*/

    private static void findMinItem(int[] a) {
        int MinValue = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] < MinValue) MinValue = a[i];
        }
    }

    private static void findMaxItem(int[] a) {
        int MaxValue = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > MaxValue) MaxValue = a[i];
        }
    }

    /**
     * 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его
     * диагональные элементы единицами, используя цикл(ы);*/

    private static void pushDiagonalItems(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
                if(i == j) a[i][j] = 1;
            }
        }
    }

    /**
     * 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
     * true если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
     * checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
     * */

    private static boolean checkBalance(int[] a) {
        int arraySum = 0;
        for (int i = 0; i < a.length; i++) {
            arraySum += a[i];
        }
        return (arraySum % 2 == 0);
    }

    /**
     * 7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
     * при этом метод должен циклически сместить все элементы массива на n позиций.*/

    private static void shiftArray1(int[] a, int n) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(n>0){
                if (i + n < a.length) b[i + n] = a[i];
                else b[i + n - a.length] = a[i];
            } else {
                if (i + n < 0) b[i + n + a.length] = a[i];
                else b[i + n] = a[i];
            }
        }
    }

    /**
     * 8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
     * */

    private static void shiftArray2(int[] incoming, int shift) {
        if (shift >= 0) {
            for (int i = 0; i < shift; i++) {
                int c = incoming[incoming.length - 1];

                for (int j = incoming.length-1; j > 0; j--) {
                    incoming[j] = incoming[j - 1];
                }
                incoming[0] = c;
            }
        } else {
            for (int i = shift; i < 0; i++) {
                int b = incoming[0];

                for (int j = 0; j < incoming.length - 1; j++) {
                    incoming[j] = incoming[j + 1];
                }
                incoming[incoming.length - 1] = b;
            }
        }
    }

    public static void main (String[] args) {
        int[] boolArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] plusThreeArray = new int[8];
        int[] randomArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] newRandomArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] sqArray = new int [3][3];
        int[] balanceArray = {1, 1, 1, 2, 1, 7};
        int[] arr = {1, 2, 3};
        //Task 1
        changeArray1(boolArray);
        //Task 2
        pushInArray(plusThreeArray);
        //Task 3
        multiplyOnTwo(randomArray);
        //Task 4
        findMinItem(newRandomArray);
        findMaxItem(newRandomArray);
        //Task 5
        pushDiagonalItems(sqArray);
        //Task 6
        checkBalance(balanceArray);
        //Task 7
        shiftArray1(arr, 2);
        //Task 8
        shiftArray2(arr, -2);
    }
}