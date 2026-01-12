package laba8;

import java.io.File;
import java.io.IOException;

public class task1ex1 {
    public static void main(String[] args) {
        try {
            // 1. Файл в папке проекта (безопасно!)
            File f1 = new File("MyFile1.txt");
            if (f1.createNewFile()) {
                System.out.println("Файл MyFile1.txt создан в папке проекта!");
            } else {
                System.out.println("Файл MyFile1.txt уже существует");
            }
            System.out.println("Полный путь 1: " + f1.getAbsolutePath());

            // 2. Файл в подпапке проекта (например, "data")
            File dataDir = new File("data");
            dataDir.mkdir(); // создаём папку data в проекте

            File f2 = new File(dataDir, "MyFile2.txt");
            if (f2.createNewFile()) {
                System.out.println("Файл MyFile2.txt создан в папке 'data'!");
            } else {
                System.out.println("Файл MyFile2.txt уже существует");
            }
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());

            // 3. Вложенные папки внутри проекта
            File f3 = new File("data/Papka1/Papka2/Papka3");
            if (f3.mkdirs()) {
                System.out.println(" Папки созданы успешно!");
            } else {
                System.out.println("️Папки уже существуют или не удалось создать");
            }
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());

        } catch (IOException e) {
            System.err.println(" Ошибка ввода-вывода: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка: " + e);
            e.printStackTrace();
        }
    }
}