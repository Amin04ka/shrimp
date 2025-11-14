package laba1;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = in.nextLine();

        System.out.println("Введите возраст");
        String age = in.nextLine();

        System.out.println("имя:" + name);
        System.out.println("возраст:" + age);

        in.close();

    }
}
