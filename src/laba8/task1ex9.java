package laba8;

import java.io.*;

public class task1ex9 {
    public static void main(String[] args) {
        File file = new File("data/output9.txt");
        String text = "Привет из Примера 9!Это вторая строка.";

        // Запись посимвольно
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), "cp1251")) {
            for (char c : text.toCharArray()) {
                writer.write(c);
            }
            System.out.println("Текст записан посимвольно в " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        // Проверка: читаем обратно
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "cp1251"))) {
            System.out.println("--- Чтение результата ---");
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}