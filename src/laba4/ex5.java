package laba4;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] original = new int[3][5];
        int[][] transposed = new int[5][3];
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                original[i][j] = rand.nextInt(10);
                System.out.print(original[i][j] + " ");
                transposed[j][i] = original[i][j];
            }
            System.out.println();
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) System.out.print(transposed[i][j] + " ");
            System.out.println();
        }
    }
}
