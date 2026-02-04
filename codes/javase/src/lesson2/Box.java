package lesson2;

public class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public <E> void printElement(E element) {
        System.out.println("Generic metoddan gələn dəyər: " + element);
    }
}
