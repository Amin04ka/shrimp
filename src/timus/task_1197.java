package timus;
import java.util.Scanner;
public class task_1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};
        for (int i = 0; i < n; i++) {
            String pos = scanner.next();
            char colChar = pos.charAt(0);
            char rowChar = pos.charAt(1);
            int col = colChar - 'a';
            int row = rowChar - '1';
            int count = 0;
            for (int j = 0; j < 8; j++) {
                int newCol = col + dx[j];
                int newRow = row + dy[j];
                if (newCol >= 0 && newCol < 8 && newRow >= 0 && newRow < 8) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}


