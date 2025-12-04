package laba3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine().trim().toLowerCase();

        int dayNumber;

        switch (dayName) {
            case "понедельник":
                dayNumber = 1;
                break;
            case "вторник":
                dayNumber = 2;
                break;
            case "среда":
                dayNumber = 3;
                break;
            case "четверг":
                dayNumber = 4;
                break;
            case "пятница":
                dayNumber = 5;
                break;
            case "суббота":
                dayNumber = 6;
                break;
            case "воскресенье":
                dayNumber = 7;
                break;
            default:
                System.out.println("Ошибка: такого дня недели нет!");
                scanner.close();
                return;
        }

        System.out.println("Порядковый номер дня недели: " + dayNumber);
        scanner.close();
    }
}
