package laba1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце: ");
        int days = in.nextInt();

        System.out.println("месяц " + month + " содержит " + days + " дней");

        in.close();
    }
}
