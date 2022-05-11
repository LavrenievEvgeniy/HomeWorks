package ru.geekbrains.homeworks;

public class Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 2;
        int b = 6;

        if (a >= b) {
            System.out.println(a >= b);
        } else {
            System.out.println("a < b");
        }
    }

    private static void checkSumSign() {
        int a = 20;
        int b = 22;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    private static void printThreeWords() {
        System.out.println("Apple");
        System.out.println("Banana");
        System.out.println("Orange");
     }

    private static void printColor() {
        int value = 152;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
