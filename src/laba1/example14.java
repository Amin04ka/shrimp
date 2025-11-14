package laba1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = in.nextDouble();

        double prevNumber = number - 1;
        double nextNumber = number + 1;

        double sumOfThree = prevNumber + number + nextNumber;
        double squareOfSum = sumOfThree * sumOfThree;

        System.out.println( prevNumber);
        System.out.println( number);
        System.out.println( nextNumber);
        System.out.println( squareOfSum);

        in.close();

    }
}
