package laba3;

import java.util.Scanner;

public class ex4While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        int min, max;
        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }

        System.out.println("Все целые числа от " + min + " до " + max + ":");

        int current = min;
        while (current <= max) {
            System.out.print(current + " ");
            current++;
        }

        scanner.close();
    }
}

