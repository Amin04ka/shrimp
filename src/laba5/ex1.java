package laba5;

public class ex1 {
    public static void main(String[] args) {
        SymbolHandler handler = new SymbolHandler();
        handler.setSymbol('A');
        handler.printSymbolAndCode();
        int code = handler.getCharCode();
        System.out.println("Код символа (полученный отдельно): " + code);
        handler.setSymbol('$');
        handler.printSymbolAndCode();
        handler.setSymbol('7');
        handler.printSymbolAndCode();
    }
}
class SymbolHandler {
    private char symbol;
    public void setSymbol(char s) {
        this.symbol = s;
    }
    public int getCharCode() {
        return (int) this.symbol;
    }
    public void printSymbolAndCode() {
        System.out.println("Символ: '" + this.symbol + "', Код: " + getCharCode());
    }
}

