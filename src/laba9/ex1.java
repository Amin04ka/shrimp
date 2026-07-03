package laba9;

public class ex1 {

    public static void example1(int x) {
        if (x >= 0 && x < 20) {
            System.out.print(x + " ");
            example1(2 * x + 1);
        }
    }

    public static void example2(int x) {
        if (x >= 0 && x < 20) {
            example2(2 * x + 1);
            System.out.print(x + " ");
        }
    }

    public static void example3(int x) {
        if (x >= 0 && x < 20) {
            System.out.println("До вызова: x = " + x);
            example3(2 * x + 1);
            System.out.println("После вызова: x = " + x);
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n, String indent) {
        System.out.println(indent + "fibonacci(" + n + ")");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1, indent + "  ") + fibonacci(n - 2, indent + "  ");
    }

    public static void main(String[] args) {
        System.out.println("Пример 1 (прямой порядок):");
        example1(1);

        System.out.println("Пример 2 (обратный порядок):");
        example2(1);

        System.out.println("Пример 3 (до и после вызова):");
        example3(1);

        System.out.println("Пример 4 (факториал 5): " + factorial(5));

        System.out.println("Пример 5 (число Фибоначчи для n=5):");
        int result = fibonacci(5, "");
        System.out.println("Результат: " + result);
    }
}
