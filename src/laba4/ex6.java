package laba4;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = {
                {15, 20, 35, 30},
                {35, 40, 45, 50},
                {55, 60, 65, 70},
                {75, 80, 85, 90}
        };
        System.out.println("Исходный массив:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + "");
            System.out.println();
        }
        int delRow = rand.nextInt(arr.length);
        int delCol = rand.nextInt(arr[0].length);
        int[][] newArr = new int[arr.length-1][arr[0].length-1];
        int ni = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == delRow) continue;
            int nj = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (j == delCol) continue;
                newArr[ni][nj++] = arr[i][j];
            }
            ni++;
        }
        System.out.println("Удалена строка " + delRow + " и столбец " + delCol);
        System.out.println("Новый массив:");
        for (int[] row : newArr) {
            for (int val : row) System.out.print(val + "");
            System.out.println();
        }
    }
}
