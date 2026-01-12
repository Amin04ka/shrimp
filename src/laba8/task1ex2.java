package laba8;

import java.io.*;
import java.net.URL;

public class task1ex2 {

    // Метод для чтения данных из Reader посимвольно
    public static void readAllByChar(Reader reader) throws IOException {
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        System.out.println("[конец потока]");
    }

    public static void main(String[] args) {
        // === 1. Чтение из файла ===
        File file = new File("data/text.txt");
        try {
            // Создаём папку и файл, если их нет
            file.getParentFile().mkdirs();
            if (!file.exists()) {
                try (PrintWriter pw = new PrintWriter(
                        new OutputStreamWriter(new FileOutputStream(file), "cp1251"))) {
                    pw.println("Привет из файла!");
                    pw.println("Это вторая строка.");
                }
                System.out.println("Файл создан: " + file.getAbsolutePath());
            }

            // Читаем файл через байтовый → символьный поток
            try (InputStream in = new FileInputStream(file);
                 Reader reader = new InputStreamReader(in, "cp1251")) {
                System.out.println("--- Чтение из файла ---");
                readAllByChar(reader);
            }

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }

        try {
            byte[] data = {72, 101, 108, 108, 111}; // "Hello" в ASCII
            try (InputStream in = new ByteArrayInputStream(data);
                 Reader reader = new InputStreamReader(in, "UTF-8")) {
                System.out.println("--- Чтение из массива байтов ---");
                readAllByChar(reader);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из массива: " + e.getMessage());
        }
    }
}