package laba8;

import java.io.*;
import java.util.Arrays;

public class task1ex3 {

    // Считывание по 5 байт (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        int totalBytes = 0;
        while (true) {
            int count = in.read(buff);
            if (count == -1) { // конец файла
                break;
            }
            totalBytes += count;
            String str = new String(buff, 0, count, "cp1251");
            System.out.println("количество = " + count +
                    ", buff = " + Arrays.toString(Arrays.copyOf(buff, count)) +
                    ", str = " + str + "");
        }
        System.out.println("Всего прочитано байт: " + totalBytes);
    }

    public static void main(String[] args) {
        // Используем путь внутри проекта — безопасно и переносимо
        File file = new File("data/MyFile1.txt");

        // Создаём файл с примером текста, если его нет
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs(); // создаём папку data/
                try (PrintWriter pw = new PrintWriter(
                        new OutputStreamWriter(new FileOutputStream(file), "cp1251"))) {
                    pw.println("У лукоморья дуб зелёный;");
                    pw.println("Златая цепь на дубе том:");
                }
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Не удалось создать файл: " + e.getMessage());
                return;
            }
        }

        // Чтение файла с использованием try-with-resources (автоматическое закрытие)
        try (InputStream in = new FileInputStream(file)) {
            System.out.println("--- Чтение файла по 5 байт ---");
            readAllByArray(in);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}