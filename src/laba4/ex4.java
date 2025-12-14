package laba4;

public class ex4 {
    public static void main(String[] args) {
        int height = 5;

        int[][] triangle = new int[height][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 1;
            }
        }
        System.out.println("");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
