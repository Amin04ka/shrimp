package laba7;

class First {
    public int number;
    public First(int number) {
        this.number = number;
    }
    public void setValue(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "First: number = " + number;
    }
}
class Second extends First {
    public char symbol;
    public Second(int number, char symbol) {
        super(number);
        this.symbol = symbol;
    }
    public void setValue(int number, char symbol) {
        super.setValue(number);
        this.symbol = symbol;
    }
    @Override
    public String toString() {
        return "Second: number = " + number + ", symbol = " + symbol;
    }
}
class Third extends Second {
    public String text;
    public Third(int number, char symbol, String text) {
        super(number, symbol);
        this.text = text;
    }

    public void setValue(int number, char symbol, String text) {
        super.setValue(number, symbol);
        this.text = text;
    }
    @Override
    public String toString() {
        return "Third: number = " + number + ", symbol = " + symbol + ", text = " + text;
    }
}
public class ex3 {
    public static void main(String[] args) {
        First obj1 = new First(10);
        Second obj2 = new Second(20, 'A');
        Third obj3 = new Third(30, 'B', "Hello");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        obj1.setValue(100);
        obj2.setValue(200, 'X');
        obj3.setValue(300, 'Y', "World");
        System.out.println("После изменения:");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}