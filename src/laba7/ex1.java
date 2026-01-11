package laba7;

class SuperClass1 {
    private String text;
    public SuperClass1(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "SuperClass1: text = " + text;
    }
}
class SubClass1 extends SuperClass1 {
    private String extraText;
    public SubClass1(String text) {
        super(text);
    }
    public SubClass1(String text1, String text2) {
        super(text1);
        this.extraText = text2;
    }
    @Override
    public String toString() {
        return "SubClass1: text = " + super.toString().split("=")[1].trim() +
                ", extraText = " + extraText;
    }
}
public class ex1 {
    public static void main(String[] args) {
        SuperClass1 obj1 = new SuperClass1("Hello");
        SubClass1 obj2 = new SubClass1("World", "Java");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}