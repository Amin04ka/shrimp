package laba8;

import java.io.*;

public class task1ex7 {
    public static void main(String[] args) {
        File file = new File("data/MyFile1.txt");

        // Убедимся, что файл существует
        if (!file.exists()) {
            try (PrintWriter pw = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(file), "cp1251"))) {
                pw.println("Строка для Примера 7");
                pw.println("Ещё одна строка");
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        // Чтение построчно
        try (BufferedReader br = new BufferedReader(new FileReader(file, java.nio.charset.Charset.forName("cp1251")))) {
            System.out.println("--- Пример 7: BufferedReader + FileReader ---");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("» " + line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}