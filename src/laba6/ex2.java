package laba6;

public class ex2 {
    private static int value = 0;

    public static void displayAndIncrement() {
        System.out.println("Текущее значение: " + value);
        value++;
    }

    public static void main(String[] args) {
        displayAndIncrement();
        displayAndIncrement();
        displayAndIncrement();
        displayAndIncrement();
    }
}

