package laba7;

class Alpha {
    public char symbol;
    public Alpha(char symbol) {
        this.symbol = symbol;
    }
    public Alpha(Alpha obj) {
        this.symbol = obj.symbol;
    }
}
class Beta extends Alpha {
    public String text;

    public Beta(char symbol, String text) {
        super(symbol);
        this.text = text;
    }
    public Beta(Beta obj) {
        super(obj);
        this.text = obj.text;
    }
}
class Gamma extends Beta {
    public int number;
    public Gamma(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }
    public Gamma(Gamma obj) {
        super(obj);
        this.number = obj.number;
    }
}
public class ex4 {
    public static void main(String[] args) {
        Alpha a1 = new Alpha('A');
        Alpha a2 = new Alpha(a1);
        Beta b1 = new Beta('B', "Text");
        Beta b2 = new Beta(b1);
        Gamma g1 = new Gamma('C', "Hello", 100);
        Gamma g2 = new Gamma(g1);
        System.out.println("a1.symbol = " + a1.symbol);
        System.out.println("a2.symbol = " + a2.symbol);
        System.out.println("b1.text = " + b1.text);
        System.out.println("b2.text = " + b2.text);
        System.out.println("g1.number = " + g1.number);
        System.out.println("g2.number = " + g2.number);
        a2.symbol = 'Z';
        b2.text = "Changed";
        g2.number = 999;
        System.out.println("После изменений:");
        System.out.println("a1.symbol = " + a1.symbol + " (оригинал)");
        System.out.println("a2.symbol = " + a2.symbol + " (копия изменена)");
    }
}