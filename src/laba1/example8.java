package laba1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели: ");
        String day = in.nextLine();

        System.out.println("Введите текущую дату: ");
        String date = in.nextLine();

        System.out.println("Введите текущий месяц: ");
        String month = in.nextLine();

        System.out.println("день: " + day );
        System.out.println("дата: "  + date );
        System.out.println("месяц: " +  month);

        in.close();
    }

}
