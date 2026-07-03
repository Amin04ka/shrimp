package laba9;
import java.util.HashMap;
import java.util.Map;

public class ex6 {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восемь");
        map.put(9, "Девять");
        map.put(10, "Десять");

        System.out.println("Строки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        System.out.println("Проверка ключа = 0:");
        boolean hasKeyZero = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                System.out.print(entry.getValue() + ", ");
                hasKeyZero = true;
            }
        }
        if (!hasKeyZero) {
            System.out.println("Ключ 0 отсутствует");
        }

        System.out.println("Перемножение ключей, где длина строки > 5:");
        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                System.out.println(entry.getKey() + " : " + entry.getValue() +
                        " (длина: " + entry.getValue().length() + ")");
            }
        }
        System.out.println("Результат перемножения: " + product);
    }
}
