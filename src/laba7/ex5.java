package laba7;

class SuperClass5 {
    private String text;
    public SuperClass5(String text) {
        this.text = text;
    }
    public void display() {
        System.out.println("SuperClass5: text = " + text);
    }
}
class SubClass5A extends SuperClass5 {
    protected int number;
    public SubClass5A(String text, int number) {
        super(text);
        this.number = number;
    }
    @Override
    public void display() {
        System.out.println("SubClass5A: text = " + "значение из суперкласса" +
                ", number = " + number);
    }
}
class SubClass5B extends SuperClass5 {
    protected char symbol;
    public SubClass5B(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }
    @Override
    public void display() {
        System.out.println("SubClass5B: text = " + "значение из суперкласса" +
                ", symbol = " + symbol);
    }
}
public class ex5 {
    public static void main(String[] args) {
        SuperClass5 obj1 = new SuperClass5("Parent");
        SubClass5A obj2 = new SubClass5A("ChildA", 100);
        SubClass5B obj3 = new SubClass5B("ChildB", 'X');
        System.out.println("Прямой вызов:");
        obj1.display();
        obj2.display();
        obj3.display();
        System.out.println("\nПолиморфный вызов:");
        SuperClass5 poly1 = new SubClass5A("PolyA", 200);
        SuperClass5 poly2 = new SubClass5B("PolyB", 'Y');
        poly1.display();
        poly2.display();
        System.out.println("Демонстрация полиморфизма:");
        SuperClass5[] objects = new SuperClass5[3];
        objects[0] = new SuperClass5("Super");
        objects[1] = new SubClass5A("SubA", 500);
        objects[2] = new SubClass5B("SubB", 'Z');
        for (SuperClass5 obj : objects) {
            obj.display();
        }
    }
}