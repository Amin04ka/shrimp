package laba5;

public class ex2 {
    private char start;
    private char end;

    public ex2(char start, char end) {
        this.start = start;
        this.end = end;
    }
    public void printRange() {

        char first = (char) Math.min(start, end);
        char last = (char) Math.max(start, end);
        for (char c = first; c <= last; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ex2 printer1 = new ex2('A', 'D');
        System.out.print("Диапазон от A до D: ");
        printer1.printRange();
        ex2 printer2 = new ex2('D', 'A');
        System.out.print("Диапазон от D до A: ");
        printer2.printRange();
        ex2 printer3 = new ex2('5', '9');
        System.out.print("Диапазон от 5 до 9: ");
        printer3.printRange();
        ex2 printer4 = new ex2('m', 'p');
        System.out.print("Диапазон от m до p: ");
        printer4.printRange();
    }
}


