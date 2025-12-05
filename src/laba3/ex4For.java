package laba3;

import java.util.Scanner;

public class ex4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        System.out.println("Все целые числа от " + min + " до " + max + ":");

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

