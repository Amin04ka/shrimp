package laba3;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] array = new int[size];
        System.out.println("Исходный массив:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Массив после сортировки по убыванию:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Проверка сортировки:");
        boolean sorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] < array[i + 1]) {
                sorted = false;
                System.out.printf("Ошибка: array[%d]=%d < array[%d]=%d%n",
                        i, array[i], i+1, array[i+1]);
            }
        }
        if (sorted) {
            System.out.println("Массив отсортирован правильно!");
        }
    }
}
