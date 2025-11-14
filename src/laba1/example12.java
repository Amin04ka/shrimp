package laba1;

import java.util.Scanner;
import java.util.Calendar;

public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        int birthYear = currentYear - age;

        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным.");
        } else if (age > 150) {
            System.out.println("Возраст не может быть больше 150 лет.");
        } else {
            System.out.println("Ваш год рождения: " + birthYear);
        }

        in.close();
    }
}
