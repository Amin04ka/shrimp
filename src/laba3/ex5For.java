package laba3;

import java.util.Scanner;

public class ex5For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел для суммирования: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Количество должно быть больше 0");
            scanner.close();
            return;
        }

        System.out.println("Числа, удовлетворяющие условиям:");
        System.out.println("(остаток от деления на 5 = 2 ИЛИ остаток от деления на 3 = 1)");

        int sum = 0;
        int found = 0;
        int number = 1;

        for (; found < count; number++) {
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.print(number + " ");
                sum += number;
                found++;
            }
        }

        System.out.println("Сумма найденных чисел: " + sum);
        scanner.close();
    }
}
