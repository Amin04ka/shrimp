package laba4;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя1234567890 ";
        int n = myAlphabet.length();

        System.out.println("Введите текст для шифрования:");
        String text = sc.nextLine();

        System.out.println("Введите ключ:");
        int key = sc.nextInt();
        sc.nextLine();
        String shifr = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = myAlphabet.indexOf(c);

            if (index >= 0) {
                int newIndex = (index + key) % n;
                shifr += myAlphabet.charAt(newIndex);
            } else {
                shifr += c;
            }
        }

        System.out.println("Текст после преобразования: " + shifr);
        while (true) {
            System.out.println("Выполнить обратное преобразование? (у/n)");
            String ans = sc.nextLine().toLowerCase();

            if (ans.equals("у") || ans.equals("y")) {
                String deshifr = "";
                for (int i = 0; i < shifr.length(); i++) {
                    char c = shifr.charAt(i);
                    int index = myAlphabet.indexOf(c);

                    if (index >= 0) {
                        int newIndex = (index - key) % n;
                        if (newIndex < 0) newIndex += n;
                        deshifr += myAlphabet.charAt(newIndex);
                    } else {
                        deshifr += c;
                    }
                }
                System.out.println("Обратное преобразование: " + deshifr);
                break;
            } else if (ans.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите у или n");
            }
        }

        sc.close();
    }
}
