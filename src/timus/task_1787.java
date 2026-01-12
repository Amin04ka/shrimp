package timus;
import java.util.Scanner;
public class task_1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int queue = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            queue += a;
            if (queue >= k) {
                queue -= k;
            } else {
                queue = 0;
            }
        }
        System.out.println(queue);
    }
}

