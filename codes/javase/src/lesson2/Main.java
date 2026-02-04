package lesson2;

public class Main {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer Box: " + intBox.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Salam Java");
        System.out.println("String Box: " + stringBox.getValue());

        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(25.5);
        System.out.println("Double Box: " + doubleBox.getValue());

        intBox.printElement("Test");
        intBox.printElement(123);
        intBox.printElement(3.14);
    }
}
