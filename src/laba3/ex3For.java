package laba3;

import java.util.Scanner;

public class ex3For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество чисел должно быть больше 0");
        } else {
            System.out.println("Последовательность чисел Фибоначчи:");

            int a = 1, b = 1;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.print(a + " ");
                } else if (i == 1) {
                    System.out.print(b + " ");
                } else {
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }
        }
        scanner.close();
    }
}

