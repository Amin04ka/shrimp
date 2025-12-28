package laba5;

public class ex3 {
    private int first;
    private int second;
    public ex3() {
        this(0, 0);
        System.out.println("Вызван конструктор без аргументов");
    }
    public ex3(int value) {
        this(value, value);
        System.out.println("Вызван конструктор с одним аргументом: " + value);
    }
    public ex3(int first, int second) {
        this.first = first;
        this.second = second;
        System.out.println("Вызван конструктор с двумя аргументами: " +
                first + ", " + second);
    }
    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }
    public void display() {
        System.out.println("first = " + first + ", second = " + second);
    }

    public static void main(String[] args) {
        System.out.println("=== Создание объектов ===");

        ex3 obj1 = new ex3();
        obj1.display();

        ex3 obj2 = new ex3(10);
        obj2.display();

        ex3 obj3 = new ex3(5, 8);
        obj3.display();
    }
}