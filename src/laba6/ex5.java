package laba6;

public class ex5 {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
    public static int sumByFormula(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Сумма квадратов от 1 до " + n + ": " + sumOfSquares(n));
        System.out.println("По формуле: " + sumByFormula(n));
    }
}

