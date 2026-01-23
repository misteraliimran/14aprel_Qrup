package lesson2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Player p1 = new Player("Ali", 100);

        Player p2 = (Player) p1.clone();

        System.out.println("Orijinal hashCode: " + p1.hashCode());
        System.out.println("Klon hashCode: " + p2.hashCode());

        System.out.println("== ilə yoxlama: " + (p1 == p2));
        System.out.println("equals ilə yoxlama: " + p1.equals(p2));
    }
}