package laba7;

class SuperClass2 {
    private String text;
    public SuperClass2(String text) {
        this.text = text;
    }
    public void setField(String text) {
        this.text = text;
    }
    public int getLength() {
        return text.length();
    }
}
class SubClass2 extends SuperClass2 {
    public int number;
    public SubClass2(String text, int number) {
        super(text);
        this.number = number;
    }
    @Override
    public void setField(String text) {
        super.setField(text);
    }
    public void setField() {
        super.setField("");
        this.number = 0;
    }
    public void setField(int number) {
        this.number = number;
    }
    public void setField(String text, int number) {
        super.setField(text);
        this.number = number;
    }
}
public class ex2 {
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2("Test", 10);
        obj.setField("New Text");
        obj.setField(20);
        obj.setField("Hello", 30);
        obj.setField();
        System.out.println("Длина текста: " + obj.getLength());
    }
}