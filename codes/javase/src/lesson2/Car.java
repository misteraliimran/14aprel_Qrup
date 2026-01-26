package lesson2;

public class Car implements Cloneable {
 String model;
 String brand;

 Car(String model, String brand) {
     this.model = model;
     this.brand = brand;
 }

 void printHashCode() {
     System.out.println("Car hashCode: " + this.hashCode());
 }

 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone();
 }
}