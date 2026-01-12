package laba8;

import java.io.*;

public class task1ex10 {
    public static void main(String[] args) {
        File source = new File("data/source.txt");
        File target = new File("data/copy.txt");

        // Создаём исходный файл
        try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream(source), "cp1251"))) {
            pw.println("Это исходный файл.");
            pw.println("Он будет скопирован побайтно.");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Копирование
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(target)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            System.out.println("Файл скопирован: " + source.getName() + " → " + target.getName());

        } catch (IOException e) {
            System.err.println("Ошибка копирования: " + e.getMessage());
        }

        // Проверка
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(target), "cp1251"))) {
            System.out.println("--- Содержимое копии ---");
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Ошибка чтения копии: " + e.getMessage());
        }
    }
}