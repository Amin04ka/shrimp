package laba6;

public class ex10 {
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            return new int[]{0, 0};
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        int[] result1 = findMinMax(5, 2, 8, 1, 9, 3);
        System.out.println("Минимум: " + result1[0] + ", Максимум: " + result1[1]);

        int[] result2 = findMinMax(-10, 0, 15, -3, 7);
        System.out.println("Минимум: " + result2[0] + ", Максимум: " + result2[1]);

        int[] result3 = findMinMax(42);
        System.out.println("Минимум: " + result3[0] + ", Максимум: " + result3[1]);
    }
}

