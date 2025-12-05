package laba3;

public class ex8 {
    public static void main(String[] args) {
        final int SIZE = 10;
        char[] consonants = new char[SIZE];
        char currentLetter = 'A';
        int index = 0;

        while (index < SIZE) {
            if (currentLetter != 'A' && currentLetter != 'E' &&
                    currentLetter != 'I' && currentLetter != 'O' &&
                    currentLetter != 'U') {

                consonants[index] = currentLetter;
                index++;
            }
            currentLetter++;
        }
        System.out.println("Массив из 10 английских согласных букв:");
        System.out.print("[");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(consonants[i]);
            if (i < SIZE - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Подробная информация:");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("consonants[%d] = '%c' (код: %d)%n",
                    i, consonants[i], (int)consonants[i]);
        }
    }
}

