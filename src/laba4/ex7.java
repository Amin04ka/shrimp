package laba4;
public class ex7 {
    public static void main(String[] args) {

        int rows = 7;
        int cols = 7;
        int[][] array = new int[rows][cols];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }
        System.out.println("");
        printArray(array);
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
