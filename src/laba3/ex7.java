package laba3;

public class ex7 {
    public static void main(String[] args) {

        final int SIZE = 10;

        char[] charArray = new char[SIZE];

        char currentChar = 'а';
        for (int i = 0; i < SIZE; i++) {
            charArray[i] = currentChar;
            currentChar += 2;
        }

        System.out.println("Массив букв (через одну) в прямом порядке:");

        for (int i = 0; i < SIZE; i++) {
            System.out.print(charArray[i] + " ");
        }

        System.out.println("Массив букв (через одну) в обратном порядке:");

        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println("Дополнительная информация:");
        System.out.println("Размер массива: " + SIZE);
        System.out.println("Первая буква: " + charArray[0]);
        System.out.println("Последняя буква: " + charArray[SIZE - 1]);
    }
}

