package timus;

import java.util.*;
import java.text.DecimalFormat;

public class task_1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextLong()) {
                numbers.add(scanner.nextLong());
            } else {
                scanner.next();
            }
        }
        DecimalFormat df = new DecimalFormat("0.0000");
        df.setRoundingMode(java.math.RoundingMode.HALF_UP);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            double root = Math.sqrt(numbers.get(i));
            System.out.println(df.format(root));
        }
    }
}

