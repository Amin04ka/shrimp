package laba6;

public class ex9 {
    public static void swapPairs(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.print("Исходный массив: ");
        System.out.println(arr);
        swapPairs(arr);
        System.out.print("После обмена: ");
        System.out.println(arr);
        char[] arr2 = {'1', '2', '3', '4', '5'};
        System.out.print("Исходный: ");
        System.out.println(arr2);
        swapPairs(arr2);
        System.out.print("После обмена: ");
        System.out.println(arr2);

    }
}
