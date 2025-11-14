package laba1;

import java.util.Scanner;
import java.util.Calendar;

public class example10 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Введите ваш год рождения: ");
        int birthYear = in.nextInt();

        int age = currentYear - birthYear;

        if (birthYear > currentYear) {
            System.out.println("Ошибка! Год рождения не может быть больше текущего года.");
        } else if (age < 0) {
            System.out.println("Ошибка! Возраст не может быть отрицательным.");
        } else {
            System.out.println("Ваш возраст: " + age + " лет");
        }

       in.close();
    }
}


