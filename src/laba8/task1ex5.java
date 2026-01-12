package laba8;

import java.io.*;

public class task1ex5 {
    public static void main(String[] args) {
        File file = new File("data/MyFile1.txt");

        // Запись строк
        try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream(file), "cp1251"))) {
            pw.println("Первая строка");
            pw.println("Вторая строка");
            pw.println("Третья строка");
            System.out.println("Текст записан в " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // Чтение через BufferedReader
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "cp1251"))) {
            System.out.println("--- Чтение построчно ---");
            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNum++ + ": " + line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}