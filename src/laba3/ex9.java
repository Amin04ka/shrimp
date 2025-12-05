package laba3;

import java.util.Random;

public class ex9 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 5 + random.nextInt(11);
        int[] array = new int[size];

        System.out.println("Создан массив из " + size + " элементов:");
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Минимальный элемент:");
        System.out.println("Значение: " + minValue);
        System.out.println("Индекс: " + minIndex);
        System.out.println("Позиция в массиве: " + (minIndex + 1));
    }
}

