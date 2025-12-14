package laba4;

public class ex3 {
    public static void main(String[] args) {
        int height = 15;
        int length = 20;

        int[][] rectangle = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                rectangle[i][j] = 2;
            }
        }
        System.out.println("");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
