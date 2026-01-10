package laba6;

public class ex6 {
    public static int[] getFirstElements(int[] array, int n) {
        if (n >= array.length) {
            int[] copy = new int[array.length];
            System.arraycopy(array, 0, copy, 0, array.length);
            return copy;
        }
        int[] result = new int[n];
        System.arraycopy(array, 0, result, 0, n);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result1 = getFirstElements(arr, 3);
        int[] result2 = getFirstElements(arr, 10);
        System.out.print("Первые 3 элемента: ");
        for (int num : result1) System.out.print(num + " ");
        System.out.print("Первые 10 элементов (копия всего массива): ");
        for (int num : result2) System.out.print(num + " ");
    }
}

