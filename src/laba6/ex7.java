package laba6;

public class ex7 {
    public static int[] getCharCodes(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i];
        }
        return codes;
    }
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', '1', '2'};
        int[] codes = getCharCodes(chars);
        System.out.print("Коды символов: ");
        for (int code : codes) {
            System.out.print(code + " ");
        }
    }
}

