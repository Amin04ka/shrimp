package laba5;

public class ex5 {
    private int value;
    public ex5() {
        setValue();
    }
    public ex5(int val) {
        setValue(val);
    }
    public void setValue() {
        value = 0;
        System.out.println("Установлено значение 0");
    }
    public void setValue(int val) {
        if (val > 100) {
            value = 100;
            System.out.println("Установлено максимальное значение 100 (передано: " + val + ")");
        } else {
            value = val;
            System.out.println("Установлено значение: " + val);
        }
    }
    public void checkValue() {
        System.out.println("Текущее значение: " + value);
    }
    public int getValue() {
        return value;
    }
    public static void main(String[] args) {
        ex5 a = new ex5();
        a.checkValue();
        ex5 b = new ex5(75);
        b.checkValue();
        ex5 c = new ex5(150);
        c.checkValue();
        a.setValue();
        a.checkValue();
        a.setValue(80);
        a.checkValue();
        a.setValue(120);
        a.checkValue();
    }
}