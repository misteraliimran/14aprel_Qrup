package lesson2;

import java.util.Objects;

public class Toy {
    private String name;
    private double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[Oyuncaq: " + name + ", Qiymət: " + price + " AZN]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Toy toy = (Toy) obj;
        return Double.compare(toy.price, price) == 0 &&
               Objects.equals(name, toy.name);
    }
}