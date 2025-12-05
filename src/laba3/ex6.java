package laba3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Введите размер массива (целое положительное число): ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Ошибка: размер массива должен быть положительным числом!");
                scanner.close();
                return;
            }
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = 2 + i * 5;
            }

            System.out.println("Созданный массив чисел, которые при делении на 5 дают остаток 2:");
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.println("Проверка условия для каждого элемента:");
            for (int i = 0; i < array.length; i++) {
                int remainder = array[i] % 5;
                System.out.printf("%d %% 5 = %d %s%n",
                        array[i],
                        remainder,
                        (remainder == 2) ? "✓" : "✗");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение! Требуется целое число.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива не может быть отрицательным!");
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

