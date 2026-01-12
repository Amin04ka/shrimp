package timus;
import java.util.Scanner;
public class task_1209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            long k = scanner.nextLong();
            long block = 0;
            while ((block + 1) * (block + 2) / 2 < k) {
                block++;
            }
            long startOfBlock = block * (block + 1) / 2;
            long posInBlock = k - startOfBlock;
            if (posInBlock == 1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

