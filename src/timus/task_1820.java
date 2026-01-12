package timus;
import java.util.Scanner;
public class task_1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int time = (2 * n + k - 1) / k;
        System.out.println(time);
    }
}

