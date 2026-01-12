package laba8;

import java.io.*;

public class task1ex8 {
    public static void main(String[] args) {
        File file = new File("data/MyFile1.txt");

        // Создаём файл, если нужно
        if (!file.exists()) {
            try (PrintWriter pw = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(file), "cp1251"))) {
                pw.println("Текст для Примера 8");
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        // Чтение через преобразование байтового потока
        try (InputStream in = new FileInputStream(file);
             Reader reader = new InputStreamReader(in, "cp1251");
             BufferedReader br = new BufferedReader(reader)) {

            System.out.println("--- Пример 8: FileInputStream → InputStreamReader ---");
            int ch;
            while ((ch = br.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println(); // новая строка в конце

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}