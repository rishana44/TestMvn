package org.example.Lesson_2;

public class Homework2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 6;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 78;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 89;
        int b = 83;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else System.out.println("a < b");
    }
}
