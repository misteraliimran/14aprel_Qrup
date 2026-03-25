package lesson2;

import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Aysel");
        stack.push("Murad");
        stack.push("Leyla");

        System.out.println("Ən son əlavə edilən element: " + stack.peek());
    }
}
