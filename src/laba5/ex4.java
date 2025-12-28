package laba5;

public class ex4 {
    char symbol;
    int number;
    ex4(int n, char c) {
        number = n;
        symbol = c;
    }

    ex4(double d) {
        symbol = (char)(int)d;
        number = (int)((d - (int)d) * 100);
    }

    void show() {
        System.out.println("Символ: " + symbol + " (" + (int)symbol + "), Число: " + number);
    }

    public static void main(String[] args) {
        ex4 a = new ex4(100, 'X');
        a.show();

        ex4 b = new ex4(65.1267);
        b.show();

        ex4 c = new ex4(97.5);
        c.show();
    }
}