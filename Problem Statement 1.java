public class DataHolder {

     int integerValue;
     double doubleValue;
     String text;

    public void calculateSum(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Sum: " + result);
    }

    public void uppercaseText(String input) {
        this.text = input.toUpperCase();
        System.out.println("Uppercase Text: " + text);
    }
}

public class Main {

    public static void main(String[] args) {
        DataHolder data = new DataHolder();
        data.integerValue = 10;
        data.doubleValue = 20.5;
        data.text = "hello";

        data.calculateSum(data.integerValue, 5);
        data.uppercaseText("world");
    }
}
