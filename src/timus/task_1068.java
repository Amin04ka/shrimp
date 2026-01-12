package timus;
import java.util.Scanner;
public class task_1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 1) {
            System.out.println(n * (n + 1) / 2);
        } else {
            System.out.println((n + 1) * (2 - n) / 2);
        }
    }
}


