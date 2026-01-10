package laba6;

public class ex1 {
    private char charField;
    private String textField;

    public void assignValue(char value) {
        this.charField = value;
    }
    public void assignValue(String value) {
        this.textField = value;
    }
    public void assignValue(char[] chars) {
        if (chars.length == 1) {
            this.charField = chars[0];
        } else {
            this.textField = new String(chars);
        }
    }
    public char getCharField() {
        return charField;
    }
    public String getTextField() {
        return textField;
    }
    public static void main(String[] args) {

        ex1 obj = new ex1();

        obj.assignValue('A');
        obj.assignValue("Hello");

        char[] singleChar = {'B'};
        obj.assignValue(singleChar);
        char[] multipleChars = {'H', 'i'};
        obj.assignValue(multipleChars);

        System.out.println("charField: " + obj.getCharField());
        System.out.println("textField: " + obj.getTextField());
    }
}