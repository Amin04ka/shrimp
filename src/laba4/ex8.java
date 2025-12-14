package laba4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = sc.nextLine();

        System.out.println("Введите ключ:");
        int key = sc.nextInt();
        sc.nextLine();
        String enc = "";
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'а' : 'А';
                enc += (char)((c - base + key) % 32 + base);
            } else {
                enc += c;
            }
        }
        System.out.println("Текст после преобразования: " + enc);
        while (true) {
            System.out.println("Выполнить обратное преобразование? (у/n)");
            String ans = sc.nextLine().toLowerCase();

            if (ans.equals("у") || ans.equals("y")) {
                String dec = "";
                for (char c : enc.toCharArray()) {
                    if (Character.isLetter(c)) {
                        char base = Character.isLowerCase(c) ? 'а' : 'А';
                        dec += (char)((c - base - key + 32) % 32 + base);
                    } else {
                        dec += c;
                    }
                }
                System.out.println("Обратное преобразование: " + dec);
                break;
            } else if (ans.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        sc.close();
    }
}
