package laba8;

import java.io.*;

public class task1ex4 {
    public static void main(String[] args) {
        File file = new File("data/numIsh.txt");

        // Создаём исходный файл с числами
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeDouble(3.14);
            out.writeDouble(-2.5);
            out.writeDouble(0.0);
            out.writeDouble(7.89);
            out.writeDouble(-1.0);
            System.out.println("Числа записаны в " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
            return;
        }

        // Читаем и выводим
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            System.out.println("--- Чтение чисел из файла ---");
            for (int i = 0; i < 5; i++) {
                double d = in.readDouble();
                System.out.println((i + 1) + ") " + d);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}