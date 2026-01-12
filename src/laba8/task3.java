package laba8;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class task3 {
    private static final List<Character> VOWELS = Arrays.asList(
            'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'
    );
    private static boolean startsWithConsonant(String word) {
        if (word == null || word.isEmpty()) return false;
        char firstChar = Character.toLowerCase(word.charAt(0));
        // Проверяем, что это буква и не гласная
        if (firstChar >= 'а' && firstChar <= 'я') {
            return !VOWELS.contains(firstChar);
        }
        return false;
    }
    public static void main(String[] args) {
        File sourceFile = new File("data/pushkin.txt");
        File resultFile = new File("data/consonant_words.txt");
        try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream(sourceFile), "UTF-8"))) {
            pw.println("У лукоморья дуб зелёный;");
            pw.println("Златая цепь на дубе том:");
            pw.println("И днём и ночью кот учёный");
            pw.println("Всё ходит по цепи кругом;");
            System.out.println("Исходный файл создан: " + sourceFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка создания исходного файла: " + e.getMessage());
            return;
        }
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(sourceFile), "UTF-8"));
             PrintWriter writer = new PrintWriter(
                     new OutputStreamWriter(new FileOutputStream(resultFile), "UTF-8"))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String cleanLine = line.replaceAll("[^а-яА-Я\\s]", "").trim();
                if (cleanLine.isEmpty()) continue;
                String[] words = cleanLine.split("\\s+");
                StringBuilder selectedWords = new StringBuilder();
                int count = 0;
                for (String word : words) {
                    if (startsWithConsonant(word)) {
                        selectedWords.append(word).append(" ");
                        count++;
                    }
                }
                if (count > 0) {
                    writer.println("Строка " + lineNumber + ": " + selectedWords.toString().trim());
                    writer.println("Количество слов: " + count);
                    writer.println();
                }
            }
            System.out.println("Обработка завершена. Результат в: " + resultFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи: " + e.getMessage());
        }
    }
}