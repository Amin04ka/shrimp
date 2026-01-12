package laba8;

import java.io.*;
import java.util.Scanner;

public class task1ex6 {
    public static void main(String[] args) {
        File file = new File("data/userInput.txt");

        // Чтение с консоли
        System.out.println("Введите 3 строки (на русском):");
        Scanner sc = new Scanner(System.in);
        String[] lines = new String[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = sc.nextLine();
        }

        // Запись в файл
        try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream(file), "cp1251"))) {
            for (String line : lines) {
                pw.println(line);
            }
            System.out.println("Введённый текст сохранён в " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }
    }
}