package laba8;

import java.io.*;

public class task2 {
    public static void main(String[] args) {
        File sourceFile = new File("data/input.dat");
        File resultFile = new File("data/output.txt");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(sourceFile))) {
            dos.writeUTF("Первая строка текста");
            dos.writeUTF("Вторая строка — нужна для результата");
            double[] numbers = {3.14, -2.5, 0.0, 7.89, -1.0};
            for (double d : numbers) {
                dos.writeDouble(d);
            }
            System.out.println("Исходный файл создан: " + sourceFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при создании исходного файла: " + e.getMessage());
            return;
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
             PrintWriter writer = new PrintWriter(
                     new OutputStreamWriter(new FileOutputStream(resultFile), "UTF-8"))) {
            String firstLine = dis.readUTF();
            String secondLine = dis.readUTF();
            writer.println(secondLine);
            int positiveCount = 0;
            for (int i = 0; i < 5; i++) {
                double num = dis.readDouble();
                if (num > 0) {
                    writer.println(num);
                    positiveCount++;
                }
            }
            System.out.println("Обработано: вторая строка + " + positiveCount + " положительных чисел");
            System.out.println("📄 Результат сохранён в: " + resultFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи: " + e.getMessage());
        }
    }
}