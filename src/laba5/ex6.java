package laba5;

public class ex6 {
    private int max;
    private int min;
    public ex6() {
        max = 0;
        min = 0;
    }
    public ex6(int v) {
        max = v;
        min = v;
    }
    public ex6(int v1, int v2) {
        setValues(v1, v2);
    }
    public void setValues() {
        max = 0;
        min = 0;
    }
    public void setValues(int v) {
        max = v;
        min = v;
    }
    public void setValues(int v1, int v2) {
        int allMin = Math.min(Math.min(min, max), Math.min(v1, v2));
        int allMax = Math.max(Math.max(min, max), Math.max(v1, v2));

        min = allMin;
        max = allMax;
    }
    public void show() {
        System.out.println("Min: " + min + ", Max: " + max);
    }
    public static void main(String[] args) {
        ex6 a = new ex6();
        a.show();
        ex6 b = new ex6(10);
        b.show();
        ex6 c = new ex6(5, 15);
        c.show();
        c.setValues(8, 25);
        c.show();
        c.setValues(30, 5);
        c.show();
    }
}