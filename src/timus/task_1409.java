package timus;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int l = scanner.nextInt();

        int n = h + l - 1;

        int garryMissed = n - h;
        int larryMissed = n - l;

        System.out.println(garryMissed + " " + larryMissed);
    }
}

