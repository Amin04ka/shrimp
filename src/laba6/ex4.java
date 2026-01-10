package laba6;

public class ex4 {
    public static long doubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        long result = 1;
        while (n > 0) {
            result *= n;
            n -= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Двойной факториал чисел:");
        System.out.println("0!! = " + doubleFactorial(0));
        System.out.println("1!! = " + doubleFactorial(1));
        System.out.println("2!! = " + doubleFactorial(2));
        System.out.println("3!! = " + doubleFactorial(3));
        System.out.println("4!! = " + doubleFactorial(4));
        System.out.println("5!! = " + doubleFactorial(5));
        System.out.println("6!! = " + doubleFactorial(6));
        System.out.println("7!! = " + doubleFactorial(7));
        System.out.println("8!! = " + doubleFactorial(8));
    }
}

