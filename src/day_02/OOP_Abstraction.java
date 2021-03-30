package day_02;
interface Fly{

}

interface LuxuryCar{
    void massage();

    static void main(String[] args) {

    }
    void seatHeater();
    void seatCooler();
}

abstract class Car1 {
    public String brand, model, color;
    public double price;

    public Car1(String brand, String model, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public abstract void start();


    @Override  // from OBJECT class
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }

}

final class Toyota2 extends Car1{

    public Toyota2(String model, String color, double price){
        super("Toyota", model, color, price );
    }

    @Override
    public void start() {
        System.out.println("Twist the key");
    }

}

final class Mercedes2 extends Car1 implements LuxuryCar{

    public Mercedes2( String model, String color, double price) {
        super("Mercedes", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Push start button");
    }

    @Override
    public void massage() {

    }

    @Override
    public void seatHeater() {

    }

    @Override
    public void seatCooler() {

    }
}

final class BMW2 extends Car1 implements LuxuryCar, Fly{

    public BMW2 ( String model, String color, double price) {
        super("BMW", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Jump Start");
    }

    @Override
    public void massage() {

    }

    @Override
    public void seatHeater() {

    }

    @Override
    public void seatCooler() {

    }
}

public class OOP_Abstraction { //InheritanceAbstractionPractice

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "White", 15000);
        Mercedes mercedes = new Mercedes("AMG", "Black", 60000);
        BMW bmw = new BMW("X7", "Red", 75000);

        System.out.println(toyota);
        System.out.println(mercedes);
        System.out.println(bmw);
    }
}