package laba11;
import java.util.*;
import java.util.stream.*;

public class ex1 {

    public static int[] filterEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public static int[] commonElements(int[] arr1, int[] arr2) {
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr1)
                .distinct()
                .filter(x -> set2.contains(x))
                .toArray();
    }

    public static List<String> startsWithUpperCase(List<String> strings) {
        return strings.stream()
                .filter(s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static List<Integer> squares(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<Integer> greaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Четные: " + Arrays.toString(filterEven(arr1)));

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        System.out.println("Общие: " + Arrays.toString(commonElements(a, b)));

        List<String> words = Arrays.asList("apple", "Banana", "Cherry", "", null, "dog");
        System.out.println("С большой буквы: " + startsWithUpperCase(words));

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        System.out.println("Квадраты: " + squares(nums));

        System.out.println("Больше 3: " + greaterThan(nums, 3));
    }
}

