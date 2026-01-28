package lesson2;

import java.util.*;

public class RuntimeExceptionDemo {

    public static void main(String[] args) {

        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException bas verdi");
        }

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException bas verdi");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException bas verdi");
        }

        try {
            String text = "Java";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException bas verdi");
        }

        try {
            String num = "abc";
            int x = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException bas verdi");
        }

        try {
            Object obj = "Hello";
            Integer n = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException bas verdi");
        }

        try {
            Thread t = new Thread();
            t.setPriority(20);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException bas verdi");
        }

        try {
            Iterator<Integer> it = List.of(1, 2, 3).iterator();
            it.remove();
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException bas verdi");
        }

        try {
            int[] a = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException bas verdi");
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            list.add("A");
            list.get(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException bas verdi");
        }
    }
}
