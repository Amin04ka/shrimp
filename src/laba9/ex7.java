package laba9;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ex7 {

    public static int josephusArrayList(int n) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }
        return people.get(0);
    }

    public static int josephusLinkedList(int n) {
        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }
        return people.get(0);
    }

    public static long measureTime(Runnable method) {
        long start = System.nanoTime();
        method.run();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        int n = 10000;

        System.out.println("Задача Иосифа Флавия для N = " + n);

        long timeArrayList = measureTime(() -> {
            int result = josephusArrayList(n);
            System.out.println("ArrayList - Последний оставшийся: " + result);
        });

        long timeLinkedList = measureTime(() -> {
            int result = josephusLinkedList(n);
            System.out.println("LinkedList - Последний оставшийся: " + result);
        });

        System.out.println("Время выполнения:");
        System.out.println("ArrayList: " + timeArrayList / 1_000_000.0 + " мс");
        System.out.println("LinkedList: " + timeLinkedList / 1_000_000.0 + " мс");

        // Объяснение
        System.out.println("--- ОБЪЯСНЕНИЕ ---");
        System.out.println("LinkedList работает быстрее в данной задаче, потому что:");
        System.out.println("1. Удаление элемента в LinkedList происходит за O(1) после нахождения позиции");
        System.out.println("2. В ArrayList удаление требует сдвига всех последующих элементов O(n)");
        System.out.println("3. Хотя поиск позиции в LinkedList занимает O(n), в ArrayList тоже нужно O(n)");
        System.out.println("4. Основное преимущество - отсутствие сдвига элементов при удалении");
    }
}
