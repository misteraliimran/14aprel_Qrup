package lesson2;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            String a = null;
            a.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException bas verdi");
        }

        try {
            int x = 0;
            int b = 5 / x;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException bas verdi");
        }

        try {
            int[] c = {1, 2};
            System.out.println(c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException bas verdi");
        }

        try {
            int d = Integer.parseInt("qaqa");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException bas verdi");
        }

        try {
            Object e = "salam";
            Integer f = (Integer) e;
        } catch (ClassCastException ex) {
            System.out.println("ClassCastException bas verdi");
        }

        try {
            String g = "java";
            g.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException bas verdi");
        }
    }
}
