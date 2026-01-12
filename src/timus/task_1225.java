package timus;
import java.util.Scanner;
public class task_1225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(2);
        } else {
            long prev2 = 2;
            long prev1 = 2;
            long current = 0;
            for (int i = 3; i <= n; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }
            System.out.println(prev1);
        }
    }
}

