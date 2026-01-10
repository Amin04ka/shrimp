package laba6;

public class ex3 {
    public static int max(int... numbers) {
        if (numbers.length == 0) return 0;
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        return max;
    }
    public static int min(int... numbers) {
        if (numbers.length == 0) return 0;
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
        }
        return min;
    }
    public static double average(int... numbers) {
        if (numbers.length == 0) return 0;
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        System.out.println("max(1, 5, 3, 9, 2): " + max(1, 5, 3, 9, 2));
        System.out.println("min(1, 5, 3, 9, 2): " + min(1, 5, 3, 9, 2));
        System.out.println("average(1, 5, 3, 9, 2): " + average(1, 5, 3, 9, 2));

        int[] arr = {10, 20, 30, 40};
        System.out.println("Для массива {10, 20, 30, 40}:");
        System.out.println("Максимум: " + max(arr));
        System.out.println("Минимум: " + min(arr));
        System.out.println("Среднее: " + average(arr));
    }
}

