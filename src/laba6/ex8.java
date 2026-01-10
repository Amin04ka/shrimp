package laba6;

public class ex8 {
    public static double getAverage(int[] array) {
        if (array.length == 0) return 0;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Среднее значение: " + getAverage(arr));
        int[] arr2 = {10, 20, 30};
        System.out.println("Среднее значение: " + getAverage(arr2));
    }
}

